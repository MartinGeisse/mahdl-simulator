package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class StatementCaseItem_Value extends StatementCaseItem  {

    public StatementCaseItem_Value( ASTNode node) {
        super(node);
    }

        public ListNode<Expression> getSelectorValues() {
            return (ListNode<Expression>)InternalPsiUtil.getChild(this, 1);
        }
        public ListNode<Statement> getStatements() {
            return (ListNode<Statement>)InternalPsiUtil.getChild(this, 3);
        }
    
    }
