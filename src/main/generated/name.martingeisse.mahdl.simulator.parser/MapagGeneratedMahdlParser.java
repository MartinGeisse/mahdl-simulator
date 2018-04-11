package name.martingeisse.mahdl.simulator.parser;

import name.martingeisse.mahdl.simulator.parser.psi.IElementType;
import name.martingeisse.mahdl.simulator.parser.psi.ASTNode;
import name.martingeisse.mahdl.simulator.parser.psi.PsiElement;


import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapagGeneratedMahdlParser  {

	// ------------------------------------------------------------------------------------------------
	// --- generated stuff
	// ------------------------------------------------------------------------------------------------

	// symbols (tokens and nonterminals)
	private static final int EOF_SYMBOL_CODE = 0;
	private static final int ERROR_SYMBOL_CODE = 1;
	private static final IElementType[] SYMBOL_CODE_TO_ELEMENT_TYPE = {
    	null, // %eof -- doesn't have an IElementType
    	null, // %error -- doesn't have an IElementType
		IElementType.BAD_CHARACTER, // %badchar
                    Symbols.BLOCK_COMMENT,
                    Symbols.CLOSING_CURLY_BRACE,
                    Symbols.CLOSING_PARENTHESIS,
                    Symbols.CLOSING_SQUARE_BRACKET,
                    Symbols.COLON,
                    Symbols.COMMA,
                    Symbols.DOT,
                    Symbols.EQUALS,
                    Symbols.IDENTIFIER,
                    Symbols.INTEGER_LITERAL,
                    Symbols.KW_BIT,
                    Symbols.KW_CASE,
                    Symbols.KW_CONSTANT,
                    Symbols.KW_DEFAULT,
                    Symbols.KW_DO,
                    Symbols.KW_ELSE,
                    Symbols.KW_IF,
                    Symbols.KW_IN,
                    Symbols.KW_INTEGER,
                    Symbols.KW_INTERFACE,
                    Symbols.KW_MATRIX,
                    Symbols.KW_MODULE,
                    Symbols.KW_NATIVE,
                    Symbols.KW_OUT,
                    Symbols.KW_REGISTER,
                    Symbols.KW_SIGNAL,
                    Symbols.KW_SWITCH,
                    Symbols.KW_TEXT,
                    Symbols.KW_VECTOR,
                    Symbols.LINE_COMMENT,
                    Symbols.OPENING_CURLY_BRACE,
                    Symbols.OPENING_PARENTHESIS,
                    Symbols.OPENING_SQUARE_BRACKET,
                    Symbols.OP_AND,
                    Symbols.OP_CONCAT,
                    Symbols.OP_CONDITIONAL,
                    Symbols.OP_DIVIDED_BY,
                    Symbols.OP_EQUAL,
                    Symbols.OP_GREATER_THAN,
                    Symbols.OP_GREATER_THAN_OR_EQUAL,
                    Symbols.OP_LESS_THAN,
                    Symbols.OP_LESS_THAN_OR_EQUAL,
                    Symbols.OP_MINUS,
                    Symbols.OP_NOT,
                    Symbols.OP_NOT_EQUAL,
                    Symbols.OP_OR,
                    Symbols.OP_PLUS,
                    Symbols.OP_REMAINDER,
                    Symbols.OP_SHIFT_LEFT,
                    Symbols.OP_SHIFT_RIGHT,
                    Symbols.OP_TIMES,
                    Symbols.OP_XOR,
                    Symbols.SEMICOLON,
                    Symbols.TEXT_LITERAL,
                    Symbols.VECTOR_LITERAL,
        	};

	// state machine (general)
	private static final int START_STATE = 0;

	// state machine (action table)
	private static final int ACTION_TABLE_WIDTH = 89;
	private static final int[] ACTION_TABLE;
	static {
		try (InputStream inputStream = MapagGeneratedMahdlParser.class.getResourceAsStream("/MapagGeneratedMahdlParser.actions")) {
			try (DataInputStream dataInputStream = new DataInputStream(inputStream)) {
				ACTION_TABLE = new int[917 * ACTION_TABLE_WIDTH];
				for (int i = 0; i < ACTION_TABLE.length; i++) {
					ACTION_TABLE[i] = dataInputStream.readInt();
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	// state machine (alternatives / reduction table)
	private static final int[] ALTERNATIVE_INDEX_TO_RIGHT_HAND_SIDE_LENGTH = {
                    0,
                    2,
                    0,
                    1,
                    1,
                    2,
                    1,
                    1,
                    1,
                    4,
                    3,
                    5,
                    1,
                    1,
                    1,
                    2,
                    1,
                    3,
                    2,
                    4,
                    5,
                    7,
                    7,
                    3,
                    2,
                    1,
                    1,
                    1,
                    3,
                    4,
                    3,
                    0,
                    2,
                    1,
                    3,
                    1,
                    1,
                    1,
                    3,
                    4,
                    6,
                    3,
                    4,
                    2,
                    2,
                    2,
                    3,
                    3,
                    3,
                    3,
                    3,
                    3,
                    3,
                    3,
                    3,
                    3,
                    3,
                    3,
                    3,
                    3,
                    3,
                    3,
                    3,
                    5,
                    1,
                    3,
                    1,
                    1,
                    1,
                    9,
                    4,
                    2,
                    1,
                    1,
                    4,
                    7,
                    1,
                    1,
                    0,
                    2,
                    1,
                    2,
                    1,
                    1,
                    1,
                    1,
                    1,
                    4,
                    3,
                    1,
                    1,
                    1,
                    3,
                    1,
                    7,
                    1,
                    3,
        	};
	private static final Object[] ALTERNATIVE_INDEX_TO_PARSE_NODE_HEAD = {
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_List_Statement),
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_List_Statement),
                    name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_Optional_KWNATIVE,
                    name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_Optional_KWNATIVE,
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_List_ExpressionCaseItem_Nonempty),
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_List_ExpressionCaseItem_Nonempty),
                    name.martingeisse.mahdl.simulator.parser.Symbols.literal_Integer,
                    name.martingeisse.mahdl.simulator.parser.Symbols.literal_Vector,
                    name.martingeisse.mahdl.simulator.parser.Symbols.literal_Text,
                    name.martingeisse.mahdl.simulator.parser.Symbols.implementationItem_SignalLikeDefinitionGroup,
                    name.martingeisse.mahdl.simulator.parser.Symbols.implementationItem_ModuleInstanceDefinitionGroup,
                    name.martingeisse.mahdl.simulator.parser.Symbols.implementationItem_DoBlock,
                    name.martingeisse.mahdl.simulator.parser.Symbols.implementationItem_Error,
                    name.martingeisse.mahdl.simulator.parser.Symbols.qualifiedModuleName,
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_List_Statement_Nonempty),
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_List_Statement_Nonempty),
                    name.martingeisse.mahdl.simulator.parser.Symbols.signalLikeDefinition_WithoutInitializer,
                    name.martingeisse.mahdl.simulator.parser.Symbols.signalLikeDefinition_WithInitializer,
                    name.martingeisse.mahdl.simulator.parser.Symbols.signalLikeDefinition_Error,
                    name.martingeisse.mahdl.simulator.parser.Symbols.statement_Assignment,
                    name.martingeisse.mahdl.simulator.parser.Symbols.statement_IfThen,
                    name.martingeisse.mahdl.simulator.parser.Symbols.statement_IfThenElse,
                    name.martingeisse.mahdl.simulator.parser.Symbols.statement_Switch,
                    name.martingeisse.mahdl.simulator.parser.Symbols.statement_Block,
                    name.martingeisse.mahdl.simulator.parser.Symbols.statement_Error1,
                    name.martingeisse.mahdl.simulator.parser.Symbols.statement_Error2,
                    name.martingeisse.mahdl.simulator.parser.Symbols.portDefinition,
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_SeparatedList_IDENTIFIER_DOT_Nonempty),
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_SeparatedList_IDENTIFIER_DOT_Nonempty),
                    name.martingeisse.mahdl.simulator.parser.Symbols.expressionCaseItem_Value,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expressionCaseItem_Default,
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_List_ImplementationItem),
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_List_ImplementationItem),
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_SeparatedList_ModuleInstanceDefinition_COMMA_Nonempty),
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_SeparatedList_ModuleInstanceDefinition_COMMA_Nonempty),
                    name.martingeisse.mahdl.simulator.parser.Symbols.moduleInstanceDefinition,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_Literal,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_Identifier,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_InstancePort,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_IndexSelection,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_RangeSelection,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_Parenthesized,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_FunctionCall,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_UnaryNot,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_UnaryPlus,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_UnaryMinus,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryPlus,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryMinus,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryTimes,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryDividedBy,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryRemainder,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryEqual,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryNotEqual,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryGreaterThan,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryGreaterThanOrEqual,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryLessThan,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryLessThanOrEqual,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryAnd,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryOr,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryXor,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryShiftLeft,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryShiftRight,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_BinaryConcat,
                    name.martingeisse.mahdl.simulator.parser.Symbols.expression_Conditional,
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_SeparatedList_Expression_COMMA_Nonempty),
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_SeparatedList_Expression_COMMA_Nonempty),
                    name.martingeisse.mahdl.simulator.parser.Symbols.doBlockTrigger_Combinatorial,
                    name.martingeisse.mahdl.simulator.parser.Symbols.doBlockTrigger_Clocked,
                    name.martingeisse.mahdl.simulator.parser.Symbols.doBlockTrigger_Error,
                    name.martingeisse.mahdl.simulator.parser.Symbols.module,
                    name.martingeisse.mahdl.simulator.parser.Symbols.portDefinitionGroup_Valid,
                    name.martingeisse.mahdl.simulator.parser.Symbols.portDefinitionGroup_Error1,
                    name.martingeisse.mahdl.simulator.parser.Symbols.portDefinitionGroup_Error2,
                    name.martingeisse.mahdl.simulator.parser.Symbols.dataType_Bit,
                    name.martingeisse.mahdl.simulator.parser.Symbols.dataType_Vector,
                    name.martingeisse.mahdl.simulator.parser.Symbols.dataType_Matrix,
                    name.martingeisse.mahdl.simulator.parser.Symbols.dataType_Integer,
                    name.martingeisse.mahdl.simulator.parser.Symbols.dataType_Text,
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_List_PortDefinitionGroup),
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_List_PortDefinitionGroup),
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_List_StatementCaseItem_Nonempty),
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_List_StatementCaseItem_Nonempty),
                    name.martingeisse.mahdl.simulator.parser.Symbols.signalLikeKind_Constant,
                    name.martingeisse.mahdl.simulator.parser.Symbols.signalLikeKind_Signal,
                    name.martingeisse.mahdl.simulator.parser.Symbols.signalLikeKind_Register,
                    name.martingeisse.mahdl.simulator.parser.Symbols.portDirection_In,
                    name.martingeisse.mahdl.simulator.parser.Symbols.portDirection_Out,
                    name.martingeisse.mahdl.simulator.parser.Symbols.statementCaseItem_Value,
                    name.martingeisse.mahdl.simulator.parser.Symbols.statementCaseItem_Default,
                    name.martingeisse.mahdl.simulator.parser.Symbols.instanceReferenceName,
                    name.martingeisse.mahdl.simulator.parser.Symbols.instancePortName,
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_SeparatedList_PortDefinition_COMMA_Nonempty),
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_SeparatedList_PortDefinition_COMMA_Nonempty),
                    name.martingeisse.mahdl.simulator.parser.Symbols.extendedExpression_Normal,
                    name.martingeisse.mahdl.simulator.parser.Symbols.extendedExpression_Switch,
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_SeparatedList_SignalLikeDefinition_COMMA_Nonempty),
                    new ListNodeGenerationWrapper(name.martingeisse.mahdl.simulator.parser.Symbols.synthetic_SeparatedList_SignalLikeDefinition_COMMA_Nonempty),
        	};
	private static final int[] ALTERNATIVE_INDEX_TO_NONTERMINAL_SYMBOL_CODE = {
                    80,
                    80,
                    83,
                    83,
                    77,
                    77,
                    66,
                    66,
                    66,
                    63,
                    63,
                    63,
                    63,
                    72,
                    81,
                    81,
                    73,
                    73,
                    73,
                    75,
                    75,
                    75,
                    75,
                    75,
                    75,
                    75,
                    69,
                    84,
                    84,
                    61,
                    61,
                    78,
                    78,
                    86,
                    86,
                    68,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    60,
                    85,
                    85,
                    59,
                    59,
                    59,
                    67,
                    70,
                    70,
                    70,
                    58,
                    58,
                    58,
                    58,
                    58,
                    79,
                    79,
                    82,
                    82,
                    74,
                    74,
                    74,
                    71,
                    71,
                    76,
                    76,
                    65,
                    64,
                    87,
                    87,
                    62,
                    62,
                    88,
                    88,
        	};

	// state machine (error messages)
	private static final String[] STATE_INPUT_EXPECTATION = {
                    "module native",
                    "",
                    "bit integer matrix text vector",
                    "bit integer matrix text vector",
                    "(identifier)",
                    "(identifier)",
                    "[",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "[",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "(identifier)",
                    "(identifier)",
                    "[",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "(identifier)",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) * + - ~",
                    ")",
                    ")",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - switch ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - switch ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - switch ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - switch ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - switch ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - switch ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - switch ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - switch ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - switch ~",
                    "!= % & ( * + - . / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ( ) * + , - . / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ( ) * + - . / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ( * + - . / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & ( * + - . / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & ( * + , - . / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ( * + - . / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ( * + , - . / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ( * + - . / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ( * + - . / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    ") ,",
                    ") ,",
                    ") ,",
                    ") ,",
                    ") ,",
                    ") ,",
                    ") ,",
                    ") ,",
                    ") ,",
                    ") ,",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    ".",
                    ".",
                    ".",
                    ".",
                    ".",
                    ".",
                    ".",
                    ".",
                    ".",
                    ".",
                    "(identifier)",
                    "(identifier)",
                    "(identifier)",
                    "(identifier)",
                    "(identifier)",
                    "(identifier)",
                    "(identifier)",
                    "(identifier)",
                    "(identifier)",
                    "(identifier)",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "case default",
                    "case default",
                    "case default",
                    "case default }",
                    "case default }",
                    "case default }",
                    ", :",
                    "case default }",
                    ":",
                    "case default }",
                    "(",
                    "(",
                    "(",
                    "{",
                    "{",
                    "{",
                    "case default }",
                    ", ;",
                    ";",
                    "(identifier) constant do register signal",
                    "(identifier) constant do register signal",
                    "(",
                    ")",
                    "(identifier) constant do register signal",
                    "(identifier)",
                    ", ;",
                    "(identifier) constant do register signal",
                    "(identifier)",
                    ", ;",
                    "(identifier) constant do register signal",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ case default | }",
                    "!= % & ) * + , - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & ) * + - / < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + - / < << <= == > >= >> OP_CONDITIONAL [ ] ^ _ |",
                    "!= % & * + , - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / : < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + , - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / < << <= = == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "!= % & * + - / ; < << <= == > >= >> OP_CONDITIONAL [ ^ _ |",
                    "module",
                    "(identifier)",
                    ";",
                    "interface",
                    "{",
                    "in out }",
                    "in out }",
                    "(identifier) constant do register signal",
                    "(identifier)",
                    ", ;",
                    "(identifier)",
                    "(identifier)",
                    ", ;",
                    "; in out }",
                    "in out }",
                    ", ;",
                    "in out }",
                    "bit integer matrix text vector",
                    "bit integer matrix text vector",
                    "(identifier) .",
                    ". ;",
                    "(identifier)",
                    ", ; =",
                    ", ;",
                    ", ;",
                    "bit integer matrix text vector",
                    "bit integer matrix text vector",
                    "bit integer matrix text vector",
                    "(identifier) ; constant do else register signal",
                    "(identifier) ; constant do register signal",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ; case default else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ; case default if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ; else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - ; if switch { } ~",
                    "(identifier) constant do else register signal",
                    "(identifier) constant do register signal",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "(",
                    "(",
                    "(",
                    "(",
                    "(",
                    "(",
                    "(identifier) constant do else register signal",
                    "(identifier) constant do else register signal",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - else if switch { } ~",
                    "(identifier) constant do else register signal",
                    "(identifier) constant do register signal",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "(",
                    "(",
                    "(",
                    "(",
                    "(",
                    "(",
                    "{",
                    "{",
                    "{",
                    "{",
                    "{",
                    "{",
                    "case default",
                    "case default",
                    "case default",
                    "case default",
                    "case default",
                    "case default",
                    "case default }",
                    "case default }",
                    "case default }",
                    "case default }",
                    "case default }",
                    "case default }",
                    "(identifier) constant do else register signal",
                    "(identifier) constant do register signal",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "(identifier) constant do else register signal",
                    "(identifier) constant do register signal",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    ";",
                    ";",
                    ";",
                    ";",
                    ";",
                    ";",
                    "(identifier) constant do else register signal",
                    "(identifier) constant do register signal",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - else if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    ", :",
                    ":",
                    "case default }",
                    "case default }",
                    "(identifier) constant do register signal",
                    "in out }",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default if switch { } ~",
                    "( (identifier) (integer-literal) (text-literal) (vector-literal) + - case default if switch { } ~",
                    "case default }",
                    "case default }",
                    "module",
                    "(identifier) .",
                    ". ;",
                    "(identifier)",
                    "(identifier)",
                    "(identifier) .",
                    ". ;",
                    ", ;",
                    ", ;",
                    ", ;",
                    ", ;",
                    ", ;",
                    ", ;",
            };

	// other
	private static final int RECOVERY_SYNC_LENGTH = 3;

	// ------------------------------------------------------------------------------------------------
	// --- non-generated stuff (initialization and static stuff)
	// ------------------------------------------------------------------------------------------------

	// static table, but has to be initialized at startup since element type indices aren't compile-time constants
	private static int[] elementTypeIndexToSymbolCode;

	/**
	 * This method initializes static tables on the first parse run -- we need element type
	 * indices to be initialized before doing this.
	 */
	private static void initializeStatic() {
		if (elementTypeIndexToSymbolCode != null) {
			return;
		}
		int maxElementTypeIndex = 0;
		for (IElementType token : SYMBOL_CODE_TO_ELEMENT_TYPE) {
		    if (token != null) {
                if (maxElementTypeIndex < token.getIndex()) {
                    maxElementTypeIndex = token.getIndex();
                }
		    }
		}
		elementTypeIndexToSymbolCode = new int[maxElementTypeIndex + 1];
		Arrays.fill(elementTypeIndexToSymbolCode, -1);
		for (int symbolCode = 0; symbolCode < SYMBOL_CODE_TO_ELEMENT_TYPE.length; symbolCode++) {
			IElementType token = SYMBOL_CODE_TO_ELEMENT_TYPE[symbolCode];
			if (token != null) {
    			elementTypeIndexToSymbolCode[token.getIndex()] = symbolCode;
			}
		}
	}

	private static int getSymbolCodeForElementType(IElementType elementType) {
		int index = elementType.getIndex();
		if (index >= 0 && index < elementTypeIndexToSymbolCode.length) {
			int symbolCode = elementTypeIndexToSymbolCode[index];
			if (symbolCode >= 0) {
				return symbolCode;
			}
		}
		throw new RuntimeException("unknown token: " + elementType);
	}

	// ------------------------------------------------------------------------------------------------
	// --- The main parser code. Code generation here mostly deals with IntelliJ vs. standalone.
	// ------------------------------------------------------------------------------------------------

    private ASTNode[] tokens;
    private int tokenPointer, tokenMarker;
    private ASTNode astRootNode;

	private boolean used = false;
	private int[] stateStack = new int[256];
	private Object[] parseTreeStack = new Object[256];
	private int stackSize = 0;
	private int state = START_STATE;

    public ASTNode parse(ASTNode[] tokens) {
        this.tokens = tokens;
        parse();
        return astRootNode;
    }

	private void parse() {

        // prevent re-use of this object since the internal state gets changed during parsing
		if (used) {
			throw new IllegalStateException("cannot re-use this parser object");
		}
		used = true;

		// initialize static parser information
		initializeStatic();


        // handle unrecoverable syntax errors
        tokenPointer = tokenMarker = 0;
        try {

            // Parse the input using the generated machine to build a parse tree. The state machine cannot execute the
            // accept action here since the input cannot contain EOF.
            while (!isAtEof()) {
           		if (consumeSymbol(getSymbolCodeForElementType(getTokenType()), null)) {
                	nextToken();
           		} else {
           			recoverFromError();
           		}
            }

            // Consume the EOF token. This should (possibly after some reductions) accept the input. If not, this causes
            // a syntax error (unexpected EOF), since the parser generator wouldn't emit a "shift EOF" action.
            {
                int originalState = state;
                if (!consumeSymbol(EOF_SYMBOL_CODE, null)) {
                    recoverFromError();
                    if (!consumeSymbol(EOF_SYMBOL_CODE, null)) {
                        throw new UnrecoverableSyntaxException(originalState);
                    }
                }
            }

        } catch (UnrecoverableSyntaxException e) {


            // Build a "code fragment" node that contains the parsed and partially reduced part (i.e. the parse tree
            // stack), then the exception. This will report the error properly and also consume the remaining tokens.
            List<Object> nodeBuilder = new ArrayList<>();
            nodeBuilder.add(Symbols.__PARSED_FRAGMENT);
            for (int i=0; i<stackSize; i++) {
                nodeBuilder.add(parseTreeStack[i]);
            }
            nodeBuilder.add(e);
            parseTreeStack[0] = nodeBuilder.toArray();
            stackSize = 1;

        }

		// At this point, the state stack should contain single element (the start state) and the associated parse
		// tree stack contains the root node as its single element. If anything in the input tried to prevent that,
		// consuming the EOF token would have failed.
		if (stackSize != 1) {
			// either the Lexer returned an explicit EOF (which it shouldn't) or this is a bug in the parser generator
			throw new RuntimeException("unexpected stack size after accepting start symbol");
		}

        tokenPointer = tokenMarker = 0;
        astRootNode = buildAst(parseTreeStack[0], null);


	}

	/**
	 * Consumes a symbol (token, nonterminal or EOF). This performs one or several actions until the symbol gets shifted
	 * (or, in the case of EOF, accepted).
	 *
	 * Returns true on success, false on syntax error. This method does not handle syntax errors itself.
	 */
	private boolean consumeSymbol(int symbolCode, Object symbolData) throws UnrecoverableSyntaxException {
		while (true) { // looped on reduce
			int action = ACTION_TABLE[state * ACTION_TABLE_WIDTH + symbolCode];
			if (action == Integer.MIN_VALUE) { // accept
				return true;
			} else if (action > 0) { // shift
				shift(symbolData, action - 1);
				return true;
			} else if (action < 0) { // reduce, then continue with the original symbol
				reduce(-action - 1);
			} else { // syntax error
				return false;
			}
		}
	}

	private void shift(Object data, int newState) {
		if (stackSize == stateStack.length) {
			stackSize = stackSize * 2;
			stateStack = Arrays.copyOf(stateStack, stackSize);
			parseTreeStack = Arrays.copyOf(parseTreeStack, stackSize);
		}
		stateStack[stackSize] = state;
		parseTreeStack[stackSize] = data;
		stackSize++;
		state = newState;
	}

	private void reduce(int alternativeIndex) throws UnrecoverableSyntaxException {

		// determine the reduction (nonterminal + alternative) to reduce
		int rightHandSideLength = ALTERNATIVE_INDEX_TO_RIGHT_HAND_SIDE_LENGTH[alternativeIndex];
		Object parseNodeHead = ALTERNATIVE_INDEX_TO_PARSE_NODE_HEAD[alternativeIndex];
		int nonterminalSymbolCode = ALTERNATIVE_INDEX_TO_NONTERMINAL_SYMBOL_CODE[alternativeIndex];


		// pop (rightHandSideLength) states off the state stack
		if (rightHandSideLength > 0) {
			stackSize -= rightHandSideLength;
			state = stateStack[stackSize];
		}

		// build a parse tree node from the nonterminal element type and the subtrees in the parse tree stack
		Object[] reduction = new Object[rightHandSideLength + 1];
		reduction[0] = parseNodeHead;
		System.arraycopy(parseTreeStack, stackSize, reduction, 1, rightHandSideLength);

		// shift the nonterminal (errors cannot occur here in LR(1) parsing)
		if (!consumeSymbol(nonterminalSymbolCode, reduction)) {
			throw new RuntimeException("syntax error while shifting a nonterminal... WTF?");
		}

	}


	private ASTNode buildAst(Object what, IElementType parentElementType) {
	    if (what == null) {
	        ASTNode node = getToken();
            nextToken();
            return node;
	    } else if (what instanceof Object[]) {
			Object[] reduction = (Object[]) what;
			IElementType elementType;
			boolean publicNode;
			if (reduction[0] instanceof ListNodeGenerationWrapper) {
				ListNodeGenerationWrapper listNodeGenerationWrapper = (ListNodeGenerationWrapper)reduction[0];
				elementType = listNodeGenerationWrapper.elementType;
				publicNode = (parentElementType == null || elementType != parentElementType);
			} else {
				elementType = (IElementType)reduction[0];
				publicNode = true;
			}
			List<ASTNode> childNodes = new ArrayList<>();
			for (int i = 1; i < reduction.length; i++) {
				childNodes.add(buildAst(reduction[i], elementType));
			}
			return new ASTNode(elementType, childNodes.toArray(new ASTNode[childNodes.size()]), publicNode);
		} else if (what instanceof List<?>) {
			// an object list has the same meaning as an object array (needed for error symbols)
			return buildAst(((List<?>)what).toArray(), parentElementType);
		} else if (what instanceof ErrorLocationIndicator) {
		    ErrorLocationIndicator errorLocationIndicator = (ErrorLocationIndicator)what;
			reportErrorForCurrentToken("expected one of: " + STATE_INPUT_EXPECTATION[errorLocationIndicator.state]);
			return null;
		} else if (what instanceof UnrecoverableSyntaxException) {
            reportErrorForCurrentToken(((UnrecoverableSyntaxException)what).getMessage());
            tokenPointer = tokens.length;
		}
	}


	private void recoverFromError() throws UnrecoverableSyntaxException {

		int originalState = state; // used for error messages

    	// First, attempt implicit reduce-on-error to reduce a nonterminal that was actually completed directly before
    	// the error, but not yet reduced since LR(1) would demand the right lookahead token to reduce. We want
    	// to reduce that nonterminal to give other IDE parts a better partial PSI to work with. However, we must
    	// make sure that we don't reduce a state away from the stack that could handle the error symbol, because
    	// we would prevent subsequent error recovery. Also, we obviously cannot reduce "the" alternative if there
    	// are multiple ones. Note that specifying %reduceOnError overrides any of these concerns, but doing so places
    	// the corresponding reductions into the parse table, so once we're here, we can ignore that modifier.
    	// Note that we might be able to reduce multiple times before we have to start error recovery, hence the loop.
    	outerLoop: while (true) {

    	    // look for a unique reduce action code in the action table
            int reduceActionCode = 0;
            for (int i = 0; i < ACTION_TABLE_WIDTH; i++) {
                int action = ACTION_TABLE[state * ACTION_TABLE_WIDTH + i];
                if (action < 0 && action != Integer.MIN_VALUE) {
                    if (reduceActionCode == 0) {
                        reduceActionCode = action; // found a reduce action
                    } else if (reduceActionCode != action) {
                        break outerLoop; // found a different reduce action, so we cannot reduce
                    }
                }
            }
			if (reduceActionCode == 0) {
				break;
			}

            // Make sure we don't remove a state from the stack that could consume %error. At depth
            // (rightHandSideLength) on the state stack lies the state to reveal by reducing (and before shifting
            // the nonterminal), so that state is NOT checked here -- even if it can handle %error, reducing won't
            // prevent that. Only the states above it on the stack are checked. As an implicit special case, we can
            // always reduce an alternative with a zero-length right hand side, no matter the current state and stack
            // contents.
            int alternativeIndex = -reduceActionCode - 1;
            int rightHandSideLength = ALTERNATIVE_INDEX_TO_RIGHT_HAND_SIDE_LENGTH[alternativeIndex];
            int probeState = state, depth = 0;
            while (depth < rightHandSideLength) {
                if (ACTION_TABLE[probeState * ACTION_TABLE_WIDTH + ERROR_SYMBOL_CODE] != 0) {
                    break outerLoop; // found error-handling state
                }
                depth++;
                probeState = stateStack[stackSize - depth];
            }

            // no state found that could recover, so let's reduce
            reduce(alternativeIndex);

    	}

		// Attempt error recovery. For now, this parser uses the same logic as Java CUP: find the first state from the
		// stack that can shift an error symbol, then throw away input terminals until parsing succeeds for
		// RECOVERY_SYNC_LENGTH terminals. This is okay-ish but it will never find recovery-capable states deeper in
		// the stack. For example, in a C-like language, if we allow a statement to consist of an error symbol, but
		// also allow a function to consist of an error symbol, then a syntax error in a statement will never try to
		// reduce the whole broken function to %error -- it will always insist on reducing only the broken statement
		// to %error.
		//
		// Note the edge cases: Both the current state (at the current stack size) and the start state (with an empty
		// stack) could be able to consume the error symbol.

		// dig up a recovery-capable state from the stack
		int originalStackSize = stackSize;
		while (ACTION_TABLE[state * ACTION_TABLE_WIDTH + ERROR_SYMBOL_CODE] == 0) {
			stackSize--;
			if (stackSize < 0) {
				// we didn't even find a recovery-capable state
				stackSize = originalStackSize;
				throw new UnrecoverableSyntaxException(originalState);
			}
			state = stateStack[stackSize];
		}

		// all symbols (terminals and nonterminals) we removed make up the first part of the erroneous content
		List<Object> errorNodeBuilder = new ArrayList<>();
        errorNodeBuilder.add(Symbols.__PARSED_FRAGMENT); // not an error-indicating element type, see next paragraph
		for (int i = stackSize; i < originalStackSize; i++) {
			errorNodeBuilder.add(parseTreeStack[i]);
		}

		// This special object is used to signal the exact location of the error to the PsiBuilder. We do not mark
		// the whole error node as an error because IntelliJ would then underline that whole node, making it harder
		// for the user to locate the error. For example, if the grammar allows to reduce the content for a whole
		// broken statement to %error, IntelliJ would underline the whole broken statement as an error, not just the
		// location where the error occurred.
		ErrorLocationIndicator errorLocationIndicator = new ErrorLocationIndicator();
		errorLocationIndicator.state = originalState;
		errorNodeBuilder.add(errorLocationIndicator);

		// shift the error symbol. The parse tree is the node builder, so we can add further discarded tokens below.
		if (!consumeSymbol(ERROR_SYMBOL_CODE, errorNodeBuilder)) {
			throw new RuntimeException("failed to push error symbol in state that should consume it");
		}

		// throw away further erroneous content until parsing works again for RECOVERY_SYNC_LENGTH steps
		while (true) {

			// make a backup of the state and stack
			int backupState = state;
			int backupStackSize = stackSize;
			int[] backupStateStack = Arrays.copyOf(stateStack, stackSize);
			Object[] backupParseTreeStack = Arrays.copyOf(parseTreeStack, stackSize);

			// Attempt to parse for RECOVERY_SYNC_LENGTH steps (stop early if we hit EOF). If we reach EOF, then we
			// must be able to consume that too
			beginSpeculativeTokenConsumption();
			boolean success = true;
			for (int i = 0; i < RECOVERY_SYNC_LENGTH && !isAtEof(); i++) {
           		if (consumeSymbol(getSymbolCodeForElementType(getTokenType()), null)) {
                	nextToken();
           		} else {
           			success = false;
           			break;
           		}
			}
			if (success && isAtEof()) {
				success = consumeSymbol(EOF_SYMBOL_CODE, null);
			}
			endSpeculativeTokenConsumption();

			// restore state and stack backup
			System.arraycopy(backupStateStack, 0, stateStack, 0, backupStackSize);
			System.arraycopy(backupParseTreeStack, 0, parseTreeStack, 0, backupStackSize);
			stackSize = backupStackSize;
			state = backupState;

			// Check if successful. If so, resume normal parsing. If not, discard a token.
			if (success) {
				return;
			}
			if (isAtEof()) {
				// Error recovery failed, so we'll signal a "giving up" syntax error and wrap the remainder of the
				// input in a dummy AST node. We don't bother restoring the original parser state since it's
				// irrelevant now. The PSI builder need not be reset here -- that happens automatically after the
				// catch block.
				stackSize = originalStackSize;
				throw new UnrecoverableSyntaxException(originalState);
			}
			errorNodeBuilder.add(null);
			nextToken();

		}

	}

    private static class UnrecoverableSyntaxException extends Exception {

        UnrecoverableSyntaxException(int state) {
            super("expected one of: " + STATE_INPUT_EXPECTATION[state]);
        }

    }

    private static class ErrorLocationIndicator {
        int state;
    }

	private static class ListNodeGenerationWrapper {

		IElementType elementType;

		ListNodeGenerationWrapper(IElementType elementType) {
			this.elementType = elementType;
		}

		public String toString() {
		    return "LIST(" + elementType + ")";
		}

	}

	// ------------------------------------------------------------------------------------------------
	// --- Separate IntelliJ vs. standalone compatibility layer
	// ------------------------------------------------------------------------------------------------


    private void beginSpeculativeTokenConsumption() {
        tokenMarker = tokenPointer;
    }

    private void endSpeculativeTokenConsumption() {
        tokenPointer = tokenMarker;
    }

    private ASTNode getToken() {
        return tokenPointer >= tokens.length ? null : tokens[tokenPointer];
    }

    private IElementType getTokenType() {
        return tokenPointer >= tokens.length ? null : tokens[tokenPointer].getElementType();
    }

    private boolean isAtEof() {
        return tokenPointer >= tokens.length;
    }

    private void nextToken() {
        if (tokenPointer < tokens.length) {
            tokenPointer++;
        }
    }

    private void reportErrorForCurrentToken(String errorMessage) {
        // TODO
    }


}
