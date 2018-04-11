package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class StatementCaseItem_Default extends StatementCaseItem  {

    public StatementCaseItem_Default( ASTNode node) {
        super(node);
    }

        public ListNode<Statement> getStatements() {
            return (ListNode<Statement>)InternalPsiUtil.getChild(this, 2);
        }
    
    }
