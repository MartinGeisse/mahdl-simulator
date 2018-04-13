package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Statement_Block extends Statement  {

    public Statement_Block( ASTNode node) {
        super(node);
    }

        public ListNode<Statement> getBody() {
            return (ListNode<Statement>)InternalPsiUtil.getChild(this, 1);
        }
    
    }
