package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Statement_Switch extends Statement  {

    public Statement_Switch( ASTNode node) {
        super(node);
    }

        public Expression getSelector() {
            return (Expression)InternalPsiUtil.getChild(this, 2);
        }
        public ListNode<StatementCaseItem> getItems() {
            return (ListNode<StatementCaseItem>)InternalPsiUtil.getChild(this, 5);
        }
    
    }
