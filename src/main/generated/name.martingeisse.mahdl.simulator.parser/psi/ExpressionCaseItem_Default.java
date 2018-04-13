package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ExpressionCaseItem_Default extends ExpressionCaseItem  {

    public ExpressionCaseItem_Default( ASTNode node) {
        super(node);
    }

        public ExtendedExpression getResultValue() {
            return (ExtendedExpression)InternalPsiUtil.getChild(this, 2);
        }
    
    }
