package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import name.martingeisse.mahdl.simulator.parser.Symbols;

public class PsiFactory {

    public static PsiElement createPsiElement(ASTNode node) {
        IElementType type = node.getElementType();

                    if (type == Symbols.synthetic_List_Statement) {
                return new ListNode<Statement>(node, createTokenSet(Symbols.statement_Assignment, Symbols.statement_IfThen, Symbols.statement_IfThenElse, Symbols.statement_Switch, Symbols.statement_Block, Symbols.statement_Error1, Symbols.statement_Error2), Statement.class);
            }
                    if (type == Symbols.synthetic_Optional_KWNATIVE) {
                return new Optional<LeafPsiElement>(node);
            }
                    if (type == Symbols.synthetic_List_ExpressionCaseItem_Nonempty) {
                return new ListNode<ExpressionCaseItem>(node, createTokenSet(Symbols.expressionCaseItem_Value, Symbols.expressionCaseItem_Default), ExpressionCaseItem.class);
            }
                    if (type == Symbols.literal_Integer) {
                return new Literal_Integer(node);
            }
                    if (type == Symbols.literal_Vector) {
                return new Literal_Vector(node);
            }
                    if (type == Symbols.literal_Text) {
                return new Literal_Text(node);
            }
                    if (type == Symbols.implementationItem_SignalLikeDefinitionGroup) {
                return new ImplementationItem_SignalLikeDefinitionGroup(node);
            }
                    if (type == Symbols.implementationItem_ModuleInstanceDefinitionGroup) {
                return new ImplementationItem_ModuleInstanceDefinitionGroup(node);
            }
                    if (type == Symbols.implementationItem_DoBlock) {
                return new ImplementationItem_DoBlock(node);
            }
                    if (type == Symbols.implementationItem_Error) {
                return new ImplementationItem_Error(node);
            }
                    if (type == Symbols.qualifiedModuleName) {
                return new QualifiedModuleName(node);
            }
                    if (type == Symbols.synthetic_List_Statement_Nonempty) {
                return new ListNode<Statement>(node, createTokenSet(Symbols.statement_Assignment, Symbols.statement_IfThen, Symbols.statement_IfThenElse, Symbols.statement_Switch, Symbols.statement_Block, Symbols.statement_Error1, Symbols.statement_Error2), Statement.class);
            }
                    if (type == Symbols.signalLikeDefinition_WithoutInitializer) {
                return new SignalLikeDefinition_WithoutInitializer(node);
            }
                    if (type == Symbols.signalLikeDefinition_WithInitializer) {
                return new SignalLikeDefinition_WithInitializer(node);
            }
                    if (type == Symbols.signalLikeDefinition_Error) {
                return new SignalLikeDefinition_Error(node);
            }
                    if (type == Symbols.statement_Assignment) {
                return new Statement_Assignment(node);
            }
                    if (type == Symbols.statement_IfThen) {
                return new Statement_IfThen(node);
            }
                    if (type == Symbols.statement_IfThenElse) {
                return new Statement_IfThenElse(node);
            }
                    if (type == Symbols.statement_Switch) {
                return new Statement_Switch(node);
            }
                    if (type == Symbols.statement_Block) {
                return new Statement_Block(node);
            }
                    if (type == Symbols.statement_Error1) {
                return new Statement_Error1(node);
            }
                    if (type == Symbols.statement_Error2) {
                return new Statement_Error2(node);
            }
                    if (type == Symbols.portDefinition) {
                return new PortDefinition(node);
            }
                    if (type == Symbols.synthetic_SeparatedList_IDENTIFIER_DOT_Nonempty) {
                return new ListNode<LeafPsiElement>(node, createTokenSet(Symbols.IDENTIFIER), LeafPsiElement.class);
            }
                    if (type == Symbols.expressionCaseItem_Value) {
                return new ExpressionCaseItem_Value(node);
            }
                    if (type == Symbols.expressionCaseItem_Default) {
                return new ExpressionCaseItem_Default(node);
            }
                    if (type == Symbols.synthetic_List_ImplementationItem) {
                return new ListNode<ImplementationItem>(node, createTokenSet(Symbols.implementationItem_SignalLikeDefinitionGroup, Symbols.implementationItem_ModuleInstanceDefinitionGroup, Symbols.implementationItem_DoBlock, Symbols.implementationItem_Error), ImplementationItem.class);
            }
                    if (type == Symbols.synthetic_SeparatedList_ModuleInstanceDefinition_COMMA_Nonempty) {
                return new ListNode<ModuleInstanceDefinition>(node, createTokenSet(Symbols.moduleInstanceDefinition), ModuleInstanceDefinition.class);
            }
                    if (type == Symbols.moduleInstanceDefinition) {
                return new ModuleInstanceDefinition(node);
            }
                    if (type == Symbols.expression_Literal) {
                return new Expression_Literal(node);
            }
                    if (type == Symbols.expression_Identifier) {
                return new Expression_Identifier(node);
            }
                    if (type == Symbols.expression_InstancePort) {
                return new Expression_InstancePort(node);
            }
                    if (type == Symbols.expression_IndexSelection) {
                return new Expression_IndexSelection(node);
            }
                    if (type == Symbols.expression_RangeSelection) {
                return new Expression_RangeSelection(node);
            }
                    if (type == Symbols.expression_Parenthesized) {
                return new Expression_Parenthesized(node);
            }
                    if (type == Symbols.expression_FunctionCall) {
                return new Expression_FunctionCall(node);
            }
                    if (type == Symbols.expression_UnaryNot) {
                return new Expression_UnaryNot(node);
            }
                    if (type == Symbols.expression_UnaryPlus) {
                return new Expression_UnaryPlus(node);
            }
                    if (type == Symbols.expression_UnaryMinus) {
                return new Expression_UnaryMinus(node);
            }
                    if (type == Symbols.expression_BinaryPlus) {
                return new Expression_BinaryPlus(node);
            }
                    if (type == Symbols.expression_BinaryMinus) {
                return new Expression_BinaryMinus(node);
            }
                    if (type == Symbols.expression_BinaryTimes) {
                return new Expression_BinaryTimes(node);
            }
                    if (type == Symbols.expression_BinaryDividedBy) {
                return new Expression_BinaryDividedBy(node);
            }
                    if (type == Symbols.expression_BinaryRemainder) {
                return new Expression_BinaryRemainder(node);
            }
                    if (type == Symbols.expression_BinaryEqual) {
                return new Expression_BinaryEqual(node);
            }
                    if (type == Symbols.expression_BinaryNotEqual) {
                return new Expression_BinaryNotEqual(node);
            }
                    if (type == Symbols.expression_BinaryGreaterThan) {
                return new Expression_BinaryGreaterThan(node);
            }
                    if (type == Symbols.expression_BinaryGreaterThanOrEqual) {
                return new Expression_BinaryGreaterThanOrEqual(node);
            }
                    if (type == Symbols.expression_BinaryLessThan) {
                return new Expression_BinaryLessThan(node);
            }
                    if (type == Symbols.expression_BinaryLessThanOrEqual) {
                return new Expression_BinaryLessThanOrEqual(node);
            }
                    if (type == Symbols.expression_BinaryAnd) {
                return new Expression_BinaryAnd(node);
            }
                    if (type == Symbols.expression_BinaryOr) {
                return new Expression_BinaryOr(node);
            }
                    if (type == Symbols.expression_BinaryXor) {
                return new Expression_BinaryXor(node);
            }
                    if (type == Symbols.expression_BinaryShiftLeft) {
                return new Expression_BinaryShiftLeft(node);
            }
                    if (type == Symbols.expression_BinaryShiftRight) {
                return new Expression_BinaryShiftRight(node);
            }
                    if (type == Symbols.expression_BinaryConcat) {
                return new Expression_BinaryConcat(node);
            }
                    if (type == Symbols.expression_Conditional) {
                return new Expression_Conditional(node);
            }
                    if (type == Symbols.synthetic_SeparatedList_Expression_COMMA_Nonempty) {
                return new ListNode<Expression>(node, createTokenSet(Symbols.expression_Literal, Symbols.expression_Identifier, Symbols.expression_InstancePort, Symbols.expression_IndexSelection, Symbols.expression_RangeSelection, Symbols.expression_Parenthesized, Symbols.expression_FunctionCall, Symbols.expression_UnaryNot, Symbols.expression_UnaryPlus, Symbols.expression_UnaryMinus, Symbols.expression_BinaryPlus, Symbols.expression_BinaryMinus, Symbols.expression_BinaryTimes, Symbols.expression_BinaryDividedBy, Symbols.expression_BinaryRemainder, Symbols.expression_BinaryEqual, Symbols.expression_BinaryNotEqual, Symbols.expression_BinaryGreaterThan, Symbols.expression_BinaryGreaterThanOrEqual, Symbols.expression_BinaryLessThan, Symbols.expression_BinaryLessThanOrEqual, Symbols.expression_BinaryAnd, Symbols.expression_BinaryOr, Symbols.expression_BinaryXor, Symbols.expression_BinaryShiftLeft, Symbols.expression_BinaryShiftRight, Symbols.expression_BinaryConcat, Symbols.expression_Conditional), Expression.class);
            }
                    if (type == Symbols.doBlockTrigger_Combinatorial) {
                return new DoBlockTrigger_Combinatorial(node);
            }
                    if (type == Symbols.doBlockTrigger_Clocked) {
                return new DoBlockTrigger_Clocked(node);
            }
                    if (type == Symbols.doBlockTrigger_Error) {
                return new DoBlockTrigger_Error(node);
            }
                    if (type == Symbols.module) {
                return new Module(node);
            }
                    if (type == Symbols.portDefinitionGroup_Valid) {
                return new PortDefinitionGroup_Valid(node);
            }
                    if (type == Symbols.portDefinitionGroup_Error1) {
                return new PortDefinitionGroup_Error1(node);
            }
                    if (type == Symbols.portDefinitionGroup_Error2) {
                return new PortDefinitionGroup_Error2(node);
            }
                    if (type == Symbols.dataType_Bit) {
                return new DataType_Bit(node);
            }
                    if (type == Symbols.dataType_Vector) {
                return new DataType_Vector(node);
            }
                    if (type == Symbols.dataType_Matrix) {
                return new DataType_Matrix(node);
            }
                    if (type == Symbols.dataType_Integer) {
                return new DataType_Integer(node);
            }
                    if (type == Symbols.dataType_Text) {
                return new DataType_Text(node);
            }
                    if (type == Symbols.synthetic_List_PortDefinitionGroup) {
                return new ListNode<PortDefinitionGroup>(node, createTokenSet(Symbols.portDefinitionGroup_Valid, Symbols.portDefinitionGroup_Error1, Symbols.portDefinitionGroup_Error2), PortDefinitionGroup.class);
            }
                    if (type == Symbols.synthetic_List_StatementCaseItem_Nonempty) {
                return new ListNode<StatementCaseItem>(node, createTokenSet(Symbols.statementCaseItem_Value, Symbols.statementCaseItem_Default), StatementCaseItem.class);
            }
                    if (type == Symbols.signalLikeKind_Constant) {
                return new SignalLikeKind_Constant(node);
            }
                    if (type == Symbols.signalLikeKind_Signal) {
                return new SignalLikeKind_Signal(node);
            }
                    if (type == Symbols.signalLikeKind_Register) {
                return new SignalLikeKind_Register(node);
            }
                    if (type == Symbols.portDirection_In) {
                return new PortDirection_In(node);
            }
                    if (type == Symbols.portDirection_Out) {
                return new PortDirection_Out(node);
            }
                    if (type == Symbols.statementCaseItem_Value) {
                return new StatementCaseItem_Value(node);
            }
                    if (type == Symbols.statementCaseItem_Default) {
                return new StatementCaseItem_Default(node);
            }
                    if (type == Symbols.instanceReferenceName) {
                return new InstanceReferenceName(node);
            }
                    if (type == Symbols.instancePortName) {
                return new InstancePortName(node);
            }
                    if (type == Symbols.synthetic_SeparatedList_PortDefinition_COMMA_Nonempty) {
                return new ListNode<PortDefinition>(node, createTokenSet(Symbols.portDefinition), PortDefinition.class);
            }
                    if (type == Symbols.extendedExpression_Normal) {
                return new ExtendedExpression_Normal(node);
            }
                    if (type == Symbols.extendedExpression_Switch) {
                return new ExtendedExpression_Switch(node);
            }
                    if (type == Symbols.synthetic_SeparatedList_SignalLikeDefinition_COMMA_Nonempty) {
                return new ListNode<SignalLikeDefinition>(node, createTokenSet(Symbols.signalLikeDefinition_WithoutInitializer, Symbols.signalLikeDefinition_WithInitializer, Symbols.signalLikeDefinition_Error), SignalLikeDefinition.class);
            }
        		if (type == Symbols.__PARSED_FRAGMENT) {
			return new ASTWrapperPsiElement(node);
        }

        throw new RuntimeException("cannot create PSI element for AST node due to unknown element type: " + type);
    }

	private static IElementType[] createTokenSet(IElementType... types) {
		return types;
	}

}
