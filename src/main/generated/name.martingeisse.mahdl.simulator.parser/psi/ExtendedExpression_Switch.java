package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ExtendedExpression_Switch extends ExtendedExpression  {

    public ExtendedExpression_Switch( ASTNode node) {
        super(node);
    }

        public Expression getSelector() {
            return (Expression)InternalPsiUtil.getChild(this, 2);
        }
        public ListNode<ExpressionCaseItem> getItems() {
            return (ListNode<ExpressionCaseItem>)InternalPsiUtil.getChild(this, 5);
        }
    
    }
