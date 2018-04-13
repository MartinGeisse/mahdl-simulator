/*
 * Copyright (c) 2018 Martin Geisse
 * This file is distributed under the terms of the MIT license.
 */
package name.martingeisse.mahdl.plugin.processor.expression;

import com.intellij.psi.PsiElement;
import name.martingeisse.mahdl.plugin.input.psi.Expression;
import name.martingeisse.mahdl.plugin.input.psi.ExtendedExpression;
import name.martingeisse.mahdl.plugin.processor.ErrorHandler;
import name.martingeisse.mahdl.plugin.processor.type.ProcessedDataType;

/**
 *
 */
public interface ExpressionProcessor {

	ProcessedExpression process(ExtendedExpression expression);

	ProcessedExpression process(Expression expression);

	ProcessedExpression convertImplicitly(ProcessedExpression sourceExpression, ProcessedDataType targetType);

	default ProcessedExpression process(ExtendedExpression expression, ProcessedDataType targetType) {
		return convertImplicitly(process(expression), targetType);
	}

	default ProcessedExpression process(Expression expression, ProcessedDataType targetType) {
		return convertImplicitly(process(expression), targetType);
	}

	ErrorHandler getErrorHandler();

	// returns null on failure
	ConstantValue.Vector processCaseSelectorValue(Expression expression, ProcessedDataType selectorDataType);

}
