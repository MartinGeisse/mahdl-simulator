package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ExpressionCaseItem_Value extends ExpressionCaseItem  {

    public ExpressionCaseItem_Value( ASTNode node) {
        super(node);
    }

        public ListNode<Expression> getSelectorValues() {
            return (ListNode<Expression>)InternalPsiUtil.getChild(this, 1);
        }
        public ExtendedExpression getResultValue() {
            return (ExtendedExpression)InternalPsiUtil.getChild(this, 3);
        }
    
    }
