/*
 * Copyright (c) 2018 Martin Geisse
 * This file is distributed under the terms of the MIT license.
 */
package name.martingeisse.mahdl.plugin.processor.expression;

import com.google.common.collect.ImmutableList;
import com.intellij.psi.PsiElement;
import name.martingeisse.mahdl.plugin.functions.BuiltinFunction;
import name.martingeisse.mahdl.plugin.functions.BuiltinFunctions;
import name.martingeisse.mahdl.plugin.input.psi.*;
import name.martingeisse.mahdl.plugin.processor.ErrorHandler;
import name.martingeisse.mahdl.plugin.processor.definition.*;
import name.martingeisse.mahdl.plugin.processor.type.ProcessedDataType;
import name.martingeisse.mahdl.plugin.util.LiteralParser;
import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 */
public class ExpressionProcessorImpl implements ExpressionProcessor {

	private final ErrorHandler errorHandler;
	private final LocalDefinitionResolver localDefinitionResolver;

	public ExpressionProcessorImpl(ErrorHandler errorHandler, LocalDefinitionResolver localDefinitionResolver) {
		this.errorHandler = errorHandler;
		this.localDefinitionResolver = localDefinitionResolver;
	}

	public ProcessedExpression process(ExtendedExpression expression) {
		try {
			if (expression instanceof ExtendedExpression_Normal) {
				return process(((ExtendedExpression_Normal) expression).getExpression());
			} else if (expression instanceof ExtendedExpression_Switch) {
				return process((ExtendedExpression_Switch) expression);
			} else {
				return error(expression, "unknown expression type");
			}
		} catch (TypeErrorException e) {
			return error(expression, "internal error during type-check");
		}
	}

	private ProcessedExpression process(ExtendedExpression_Switch expression) throws TypeErrorException {

		ProcessedExpression selector = process(expression.getSelector());
		boolean selectorOkay = (selector.getDataType() instanceof ProcessedDataType.Vector);
		if (!selectorOkay) {
			error(expression.getSelector(), "selector must be of vector type, found " + selector.getDataType());
		}

		if (expression.getItems().getAll().isEmpty()) {
			return error(expression, "switch expression has no cases");
		}

		ProcessedDataType resultValueType = null;
		boolean errorInCases = false;
		Set<ConstantValue.Vector> foundSelectorValues = new HashSet<>();
		List<ProcessedSwitchExpression.Case> processedCases = new ArrayList<>();
		ProcessedExpression processedDefaultCase = null;
		for (ExpressionCaseItem caseItem : expression.getItems().getAll()) {
			ProcessedExpression resultValueExpression;
			if (caseItem instanceof ExpressionCaseItem_Value) {
				ExpressionCaseItem_Value typedCaseItem = (ExpressionCaseItem_Value) caseItem;

				// result value expression gets handled below
				resultValueExpression = process(typedCaseItem.getResultValue());

				// process selector values
				List<ConstantValue.Vector> caseSelectorValues = new ArrayList<>();
				for (Expression currentCaseSelectorExpression : typedCaseItem.getSelectorValues().getAll()) {
					ConstantValue.Vector selectorVectorValue = processCaseSelectorValue(currentCaseSelectorExpression, selector.getDataType());
					if (foundSelectorValues.add(selectorVectorValue)) {
						caseSelectorValues.add(selectorVectorValue);
					} else {
						error(currentCaseSelectorExpression, "duplicate selector value");
						errorInCases = true;
					}
				}
				processedCases.add(new ProcessedSwitchExpression.Case(ImmutableList.copyOf(caseSelectorValues), resultValueExpression));

			} else if (caseItem instanceof ExpressionCaseItem_Default) {

				// result value expression gets handled below
				resultValueExpression = process(((ExpressionCaseItem_Default) caseItem).getResultValue());

				// remember default case and check for duplicate
				if (processedDefaultCase != null) {
					error(caseItem, "duplicate default case");
					errorInCases = true;
				} else {
					processedDefaultCase = resultValueExpression;
				}

			} else {
				error(caseItem, "unknown case item type");
				errorInCases = true;
				continue;
			}

			// now handle the result value expression
			if (resultValueType == null) {
				resultValueType = resultValueExpression.getDataType();
			} else if (resultValueType instanceof ProcessedDataType.Integer) {
				if ((resultValueExpression.getDataType() instanceof ProcessedDataType.Vector)) {
					resultValueType = resultValueExpression.getDataType();
				}
			}

		}

		// try to convert all result value expressions to the common result value type
		if (resultValueType == null) {
			return error(expression, "internal error: could not determine result type of switch expression");
		}
		ImmutableList<ProcessedSwitchExpression.Case> unconvertedCases = ImmutableList.copyOf(processedCases);
		processedCases.clear();
		for (ProcessedSwitchExpression.Case aCase : unconvertedCases) {
			ProcessedExpression converted = convertImplicitly(aCase.getResultValue(), resultValueType);
			if (converted instanceof UnknownExpression) {
				errorInCases = true;
			}
			processedCases.add(new ProcessedSwitchExpression.Case(aCase.getSelectorValues(), converted));
		}

		// check for missing selector values
		if (processedDefaultCase == null) {
			int selectorSize = ((ProcessedDataType.Vector) selector.getDataType()).getSize();
			if (foundSelectorValues.size() != (1 << selectorSize)) {
				return error(expression, "incomplete switch expression");
			}
		}

		// in case of errors, don't return a switch expression
		if (!selectorOkay || errorInCases) {
			return new UnknownExpression(expression);
		}

		// now build the switch expression
		return new ProcessedSwitchExpression(expression, resultValueType, selector, ImmutableList.copyOf(processedCases), processedDefaultCase);

	}

	public ProcessedExpression process(Expression expression) {
		return processWithoutFolding(expression).performFolding(errorHandler);
	}

	private ProcessedExpression processWithoutFolding(Expression expression) {
		try {
			if (expression instanceof Expression_Literal) {
				return process((Expression_Literal) expression);
			} else if (expression instanceof Expression_Identifier) {
				return process((Expression_Identifier) expression);
			} else if (expression instanceof Expression_InstancePort) {
				return process((Expression_InstancePort) expression);
			} else if (expression instanceof Expression_IndexSelection) {
				return process((Expression_IndexSelection) expression);
			} else if (expression instanceof Expression_RangeSelection) {
				return process((Expression_RangeSelection) expression);
			} else if (expression instanceof UnaryOperation) {
				return process((UnaryOperation) expression);
			} else if (expression instanceof BinaryOperation) {
				return process((BinaryOperation) expression);
			} else if (expression instanceof Expression_Conditional) {
				return process((Expression_Conditional) expression);
			} else if (expression instanceof Expression_FunctionCall) {
				return process((Expression_FunctionCall) expression);
			} else if (expression instanceof Expression_Parenthesized) {
				return process(((Expression_Parenthesized) expression).getExpression());
			} else {
				return error(expression, "unknown expression type");
			}
		} catch (TypeErrorException e) {
			return error(expression, "internal error during type-check");
		}
	}

	private ProcessedExpression process(Expression_Literal expression) {
		try {
			return new ProcessedConstantValue(expression, LiteralParser.parseLiteral(expression));
		} catch (LiteralParser.ParseException e) {
			return error(expression, e.getMessage());
		}
	}

	private ProcessedExpression process(Expression_Identifier expression) {
		String name = expression.getIdentifier().getText();
		Named definition = localDefinitionResolver.getDefinition(name);
		if (definition == null) {
			return error(expression, "cannot resolve symbol '" + name + "'");
		} else if (definition instanceof SignalLike) {
			return new SignalLikeReference(expression, (SignalLike) definition);
		} else if (definition instanceof ModuleInstance || definition instanceof ModuleInstanceWithMissingDefinition) {
			return error(expression, "cannot use a module instance directly in an expression");
		} else {
			return error(expression, "symbol '" + name + "' does not refer to a signal-like");
		}
	}

	private ProcessedExpression process(Expression_InstancePort expression) {

		// find the module instance
		ModuleInstance moduleInstance;
		{
			String instanceName = expression.getInstanceName().getIdentifier().getText();
			Named moduleInstanceCandidate = localDefinitionResolver.getDefinition(instanceName);
			if (moduleInstanceCandidate == null) {
				return error(expression.getInstanceName(), "cannot resolve symbol '" + instanceName + "'");
			} else if (moduleInstanceCandidate instanceof ModuleInstance) {
				moduleInstance = (ModuleInstance) moduleInstanceCandidate;
			} else if (moduleInstanceCandidate instanceof ModuleInstanceWithMissingDefinition) {
				QualifiedModuleName moduleNameElement = ((ModuleInstanceWithMissingDefinition) moduleInstanceCandidate).getModuleNameElement();
				String moduleName = PsiUtil.canonicalizeQualifiedModuleName(moduleNameElement);
				return error(expression.getInstanceName(), "missing module '" + moduleName + "' for instance '" + instanceName + "'");
			} else {
				return error(expression.getInstanceName(), instanceName + " is not a module instance");
			}
		}

		// resolve the port reference
		String portName = expression.getPortName().getIdentifier().getText();
		InstancePort port = moduleInstance.getPorts().get(portName);
		if (port == null) {
			return error(expression, "cannot resolve port '" + portName + "' of instance '" + moduleInstance.getName() +
				"' of module '" + moduleInstance.getModuleElement().getName() + "'");
		}
		return new InstancePortReference(expression, moduleInstance, port);

	}

	private ProcessedExpression process(Expression_IndexSelection expression) throws TypeErrorException {

		ProcessedExpression container = process(expression.getContainer());
		int containerSizeIfKnown = determineContainerSize(container, true, "index-select");

		ProcessedExpression index = process(expression.getIndex());
		index = handleIndex(index, containerSizeIfKnown);

		if (containerSizeIfKnown == -1 || index instanceof UnknownExpression) {
			return new UnknownExpression(expression);
		} else {
			if (container.getDataType() instanceof ProcessedDataType.Vector) {
				return new ProcessedIndexSelection.BitFromVector(expression, container, index);
			} else if (container.getDataType() instanceof ProcessedDataType.Matrix) {
				return new ProcessedIndexSelection.VectorFromMatrix(expression, container, index);
			} else {
				return error(expression, "unknown container type");
			}
		}

	}

	private ProcessedExpression process(Expression_RangeSelection expression) throws TypeErrorException {

		// evaluate container
		ProcessedExpression container = process(expression.getContainer());
		int containerSizeIfKnown = determineContainerSize(container, false, "range-select");

		// evaluate from-index
		ProcessedExpression fromIndex = process(expression.getFrom());
		if (!(fromIndex.getDataType() instanceof ProcessedDataType.Integer)) {
			fromIndex = error(expression.getFrom(), "from-index must be of type integer, found " + fromIndex.getDataType());
		}
		Integer fromIndexInteger = evaluateLocalSmallIntegerExpressionThatMustBeFormallyConstant(fromIndex);

		// evaluate to-index
		ProcessedExpression toIndex = process(expression.getTo());
		if (!(toIndex.getDataType() instanceof ProcessedDataType.Integer)) {
			toIndex = error(expression.getTo(), "to-index must be of type integer, found " + toIndex.getDataType());
		}
		Integer toIndexInteger = evaluateLocalSmallIntegerExpressionThatMustBeFormallyConstant(toIndex);

		// stop here if any of them failed
		if (containerSizeIfKnown < 0 || fromIndexInteger == null || toIndexInteger == null) {
			return new UnknownExpression(expression);
		}

		// otherwise return a range selection node
		int width = fromIndexInteger - toIndexInteger + 1;
		return new ProcessedRangeSelection(expression, new ProcessedDataType.Vector(width), container, fromIndexInteger, toIndexInteger);

	}

	private int determineContainerSize(@NotNull ProcessedExpression container, boolean allowMatrix, String operatorVerb) {
		ProcessedDataType type = container.getDataType();
		if (type instanceof ProcessedDataType.Unknown) {
			return -1;
		} else if (type instanceof ProcessedDataType.Vector) {
			return ((ProcessedDataType.Vector) type).getSize();
		} else if (allowMatrix && type instanceof ProcessedDataType.Matrix) {
			return ((ProcessedDataType.Matrix) type).getFirstSize();
		} else {
			error(container, "cannot " + operatorVerb + " from an expression of type " + type.getFamily().getDisplayString());
			return -1;
		}
	}

	private ProcessedExpression handleIndex(@NotNull ProcessedExpression index, int containerSizeIfKnown) {
		if (index.getDataType() instanceof ProcessedDataType.Integer) {
			// For an integer, the actual value is relevant, so non-PO2-sized containers can be indexed with a
			// constant index without getting errors. There won't be an error based on the type alone nor a type
			// conversion.
			return index;
		} else if (index.getDataType() instanceof ProcessedDataType.Vector) {
			if (containerSizeIfKnown < 0) {
				return new UnknownExpression(index.getErrorSource());
			} else {
				// For a vector, the greatest possible value is releant, not the actual value, even if the vector is
				// constant (see language design documents for details).
				int indexSize = ((ProcessedDataType.Vector) index.getDataType()).getSize();
				if (containerSizeIfKnown < (1 << indexSize)) {
					return error(index, "index of vector size " + indexSize +
						" must index a container vector of at least " + (1 << indexSize) + " in size, found " +
						containerSizeIfKnown);
				} else {
					return index;
				}
			}
		} else {
			return error(index, "cannot use an expression of type " + index.getDataType().getFamily() + " as index");
		}
	}

	private ProcessedExpression process(UnaryOperation expression) {
		ProcessedExpression operand = process(expression.getOperand());
		if (operand.getDataType() instanceof ProcessedDataType.Unknown) {
			return new UnknownExpression(expression);
		}
		ProcessedUnaryOperator operator = ProcessedUnaryOperator.from(expression);
		// unary operators have simple type handling -- we can even use the safety check and TypeErrorException to
		// detect errors without checking ourselves.
		try {
			return new ProcessedUnaryOperation(expression, operand, operator);
		} catch (TypeErrorException e) {
			return error(expression, "cannot apply operator " + operator + " to an operand of type " + operand.getDataType());
		}
	}

	private ProcessedExpression process(BinaryOperation expression) throws TypeErrorException {
		ProcessedExpression leftOperand = process(expression.getLeftOperand());
		ProcessedExpression rightOperand = process(expression.getRightOperand());
		if (leftOperand.getDataType() instanceof ProcessedDataType.Unknown || rightOperand.getDataType() instanceof ProcessedDataType.Unknown) {
			return new UnknownExpression(expression);
		}

		// handle concatenation operator -- it can have one of two entirely different meanings and has complex type handling
		if (expression instanceof Expression_BinaryConcat) {
			return handleConcatenation((Expression_BinaryConcat) expression, leftOperand, rightOperand);
		}
		ProcessedBinaryOperator operator = ProcessedBinaryOperator.from(expression);

		// Now, only logical operators can handle bit values, and only if both operands are bits. We must be able to
		// recognize bit literals for this, though, and we try that if either operand is already a bit.
		if ((leftOperand.getDataType() instanceof ProcessedDataType.Bit) != (rightOperand.getDataType() instanceof ProcessedDataType.Bit)) {
			ProcessedExpression leftBitLiteral = leftOperand.recognizeBitLiteral();
			if (leftBitLiteral != null) {
				leftOperand = leftBitLiteral;
			}
			ProcessedExpression rightBitLiteral = rightOperand.recognizeBitLiteral();
			if (rightBitLiteral != null) {
				rightOperand = rightBitLiteral;
			}
			if ((leftOperand.getDataType() instanceof ProcessedDataType.Bit) != (rightOperand.getDataType() instanceof ProcessedDataType.Bit)) {
				return error(expression, "this operator cannot be used for " + leftOperand.getDataType().getFamily() +
					" and " + rightOperand.getDataType().getFamily() + " operands");
			}
		}
		if (leftOperand.getDataType() instanceof ProcessedDataType.Bit) {
			return new ProcessedBinaryOperation(expression, leftOperand, rightOperand, operator);
		}

		// all other binary operators are IVOs
		{
			boolean error = false;
			if (!(leftOperand.getDataType() instanceof ProcessedDataType.Vector) && !(leftOperand.getDataType() instanceof ProcessedDataType.Integer)) {
				error = true;
			}
			if (!(rightOperand.getDataType() instanceof ProcessedDataType.Vector) && !(rightOperand.getDataType() instanceof ProcessedDataType.Integer)) {
				error = true;
			}
			if (error) {
				return error(expression, "cannot apply operator " + operator + " to operands of type " + leftOperand.getDataType() + " and " + rightOperand.getDataType());
			}
		}

		// handle TAIVOs (shift operators) specially (no conversion; result type is that of the left operand)
		if (expression instanceof Expression_BinaryShiftLeft || expression instanceof Expression_BinaryShiftRight) {
			return new ProcessedBinaryOperation(expression, leftOperand, rightOperand, operator);
		}

		// handle TSIVOs
		if (leftOperand.getDataType() instanceof ProcessedDataType.Vector) {
			int leftSize = ((ProcessedDataType.Vector) leftOperand.getDataType()).getSize();
			if (rightOperand.getDataType() instanceof ProcessedDataType.Vector) {
				int rightSize = ((ProcessedDataType.Vector) rightOperand.getDataType()).getSize();
				if (leftSize != rightSize) {
					return error(expression, "cannot apply operator " + operator + " to vectors of different sizes " +
						leftSize + " and " + rightSize);
				}
			} else {
				rightOperand = new TypeConversion.IntegerToVector(leftSize, rightOperand);
			}
		} else {
			if (rightOperand.getDataType() instanceof ProcessedDataType.Vector) {
				int rightSize = ((ProcessedDataType.Vector) rightOperand.getDataType()).getSize();
				leftOperand = new TypeConversion.IntegerToVector(rightSize, leftOperand);
			}
		}
		return new ProcessedBinaryOperation(expression, leftOperand, rightOperand, operator);

	}

	private ProcessedExpression handleConcatenation(Expression_BinaryConcat expression,
													ProcessedExpression leftOperand,
													ProcessedExpression rightOperand) throws TypeErrorException {

		// handle text concatenation
		if (leftOperand.getDataType() instanceof ProcessedDataType.Text || rightOperand.getDataType() instanceof ProcessedDataType.Text) {
			return new ProcessedBinaryOperation(expression, leftOperand, rightOperand, ProcessedBinaryOperator.TEXT_CONCAT);
		}

		// handle bit / vector concatenation
		boolean typeError = false;
		if (leftOperand.getDataType() instanceof ProcessedDataType.Bit) {
			leftOperand = new TypeConversion.BitToVector(leftOperand);
		} else if (!(leftOperand.getDataType() instanceof ProcessedDataType.Vector)) {
			typeError = true;
		}
		if (rightOperand.getDataType() instanceof ProcessedDataType.Bit) {
			rightOperand = new TypeConversion.BitToVector(rightOperand);
		} else if (!(rightOperand.getDataType() instanceof ProcessedDataType.Vector)) {
			typeError = true;
		}
		if (typeError) {
			return error(expression, "cannot apply concatenation operator to operands of type " + leftOperand.getDataType() + " and " + rightOperand.getDataType());
		} else {
			return new ProcessedBinaryOperation(expression, leftOperand, rightOperand, ProcessedBinaryOperator.VECTOR_CONCAT);
		}

	}

	private ProcessedExpression process(Expression_Conditional expression) throws TypeErrorException {
		ProcessedExpression condition = process(expression.getCondition());
		ProcessedExpression thenBranch = process(expression.getThenBranch());
		ProcessedExpression elseBranch = process(expression.getElseBranch());
		boolean error = false;

		// handle condition
		condition = convertImplicitly(condition, ProcessedDataType.Bit.INSTANCE);
		if (!(condition.getDataType() instanceof ProcessedDataType.Bit)) {
			error = true;
		}

		// handle branches
		branchTypeCheck:
		if (!thenBranch.getDataType().equals(elseBranch.getDataType())) {

			// recognize bit literals in either branch
			if (thenBranch.getDataType() instanceof ProcessedDataType.Bit) {
				ProcessedExpression elseBit = elseBranch.recognizeBitLiteral();
				if (elseBit != null) {
					elseBranch = elseBit;
					break branchTypeCheck;
				}
			} else if (elseBranch.getDataType() instanceof ProcessedDataType.Bit) {
				ProcessedExpression thenBit = thenBranch.recognizeBitLiteral();
				if (thenBit != null) {
					thenBranch = thenBit;
					break branchTypeCheck;
				}
			}

			// no bit literals -- recognize integer/vector combinations
			if ((thenBranch.getDataType() instanceof ProcessedDataType.Vector) && (elseBranch.getDataType() instanceof ProcessedDataType.Integer)) {
				int size = ((ProcessedDataType.Vector) thenBranch.getDataType()).getSize();
				elseBranch = new TypeConversion.IntegerToVector(size, elseBranch);
			} else if ((thenBranch.getDataType() instanceof ProcessedDataType.Integer) && (elseBranch.getDataType() instanceof ProcessedDataType.Vector)) {
				int size = ((ProcessedDataType.Vector) elseBranch.getDataType()).getSize();
				thenBranch = new TypeConversion.IntegerToVector(size, thenBranch);
			} else {
				error(elseBranch, "incompatible types in then/else branches: " + thenBranch.getDataType() + " vs. " + elseBranch.getDataType());
				error = true;
			}

		}

		// check for errors
		if (error) {
			return new UnknownExpression(expression);
		} else {
			return new ProcessedConditional(expression, condition, thenBranch, elseBranch);
		}

	}

	private ProcessedExpression process(Expression_FunctionCall expression) {
		boolean error = false;

		String functionName = expression.getFunctionName().getText();
		BuiltinFunction builtinFunction = BuiltinFunctions.FUNCTIONS.get(functionName);
		if (builtinFunction == null) {
			error(expression.getFunctionName(), "unknown function: " + functionName);
			error = true;
		}

		List<ProcessedExpression> arguments = new ArrayList<>();
		for (Expression argumentExpression : expression.getArguments().getAll()) {
			ProcessedExpression argument = process(argumentExpression);
			if (argument.getDataType() instanceof ProcessedDataType.Unknown) {
				error = true;
			}
			arguments.add(argument);
		}

		if (error) {
			return new UnknownExpression(expression);
		}

		ProcessedDataType returnType = builtinFunction.checkType(expression, arguments, errorHandler);
		if (returnType instanceof ProcessedDataType.Unknown) {
			return new UnknownExpression(expression);
		}

		return new ProcessedFunctionCall(expression, returnType, builtinFunction, ImmutableList.copyOf(arguments));
	}

	private ConstantValue evaluateLocalExpressionThatMustBeFormallyConstant(ProcessedExpression expression) {
		return expression.evaluateFormallyConstant(
			new ProcessedExpression.FormallyConstantEvaluationContext(errorHandler));
	}

	private Integer evaluateLocalSmallIntegerExpressionThatMustBeFormallyConstant(ProcessedExpression expression) {
		BigInteger integerValue = evaluateLocalExpressionThatMustBeFormallyConstant(expression).convertToInteger();
		if (integerValue == null) {
			errorHandler.onError(expression.getErrorSource(), "cannot convert value to integer");
			return null;
		}
		try {
			return integerValue.intValueExact();
		} catch (ArithmeticException e) {
			errorHandler.onError(expression.getErrorSource(), "value too large");
			return null;
		}
	}

	@Override
	public ProcessedExpression convertImplicitly(ProcessedExpression sourceExpression, ProcessedDataType targetType) {
		ProcessedDataType sourceType = sourceExpression.getDataType();

		// don't add follow-up errors
		if ((sourceType instanceof ProcessedDataType.Unknown) || (targetType instanceof ProcessedDataType.Unknown)) {
			return sourceExpression;
		}

		// check if conversion is needed at all
		if (sourceType.equals(targetType)) {
			return sourceExpression;
		}

		// recognize 0 and 1 as bit literals
		if (targetType instanceof ProcessedDataType.Bit) {
			ProcessedExpression bitLiteral = sourceExpression.recognizeBitLiteral();
			if (bitLiteral != null) {
				return bitLiteral;
			}
		}

		// the only other implicit conversions are integer-to-vector and vector-to-integer
		try {
			if (sourceType instanceof ProcessedDataType.Integer) {
				if (targetType instanceof ProcessedDataType.Vector) {
					int targetSize = ((ProcessedDataType.Vector) targetType).getSize();
					return new TypeConversion.IntegerToVector(targetSize, sourceExpression);
				}
			} else if (sourceType instanceof ProcessedDataType.Vector) {
				if (targetType instanceof ProcessedDataType.Integer) {
					return new TypeConversion.VectorToInteger(sourceExpression);
				}
			}
		} catch (TypeErrorException e) {
			return error(sourceExpression, "internal error during type conversion");
		}

		return error(sourceExpression, "cannot convert expression of type " + sourceType + " to type " + targetType);
	}

	/**
	 * This method is sometimes called with a sub-expression of the current expression as the error source, in case
	 * that error can be attributed to that sub-expression. For example, if an operand of an operator has a type
	 * the operator can't handle, then the error message will be attached to the operand, not the whole binary
	 * expression.
	 * <p>
	 * The same error source gets attached to the returned {@link UnknownExpression} as the error source for other
	 * error messages added later. This is wrong in principle, since those error messages should be attached to the
	 * whole parent expression instead. However, since the return value right now is an UnknownExpression, no further
	 * error messages should be generated at all, and so this wrong behavior should not matter.
	 */
	@NotNull
	private ProcessedExpression error(@NotNull PsiElement errorSource, @NotNull String message) {
		errorHandler.onError(errorSource, message);
		return new UnknownExpression(errorSource);
	}

	/**
	 * the same note as for the other error method above applies to this one
	 */
	@NotNull
	private ProcessedExpression error(@NotNull ProcessedExpression processedExpression, @NotNull String message) {
		return error(processedExpression.getErrorSource(), message);
	}

	public ErrorHandler getErrorHandler() {
		return errorHandler;
	}

	@Override
	public ConstantValue.Vector processCaseSelectorValue(Expression expression, ProcessedDataType selectorDataType) {
		ProcessedExpression processedSelectorValueExpression = process(expression);
		processedSelectorValueExpression = convertImplicitly(processedSelectorValueExpression, selectorDataType);
		ConstantValue selectorValue = evaluateLocalExpressionThatMustBeFormallyConstant(processedSelectorValueExpression);
		if (selectorValue instanceof ConstantValue.Unknown) {
			return null;
		}
		if (!(selectorValue instanceof ConstantValue.Vector)) {
			error(expression, "internal error: selector is not a vector in spite of type conversion");
			return null;
		}
		return (ConstantValue.Vector) selectorValue;
	}

}
