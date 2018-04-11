package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class QualifiedModuleName extends ASTWrapperPsiElement  {

    public QualifiedModuleName( ASTNode node) {
        super(node);
    }

        public ListNode<LeafPsiElement> getSegments() {
            return (ListNode<LeafPsiElement>)InternalPsiUtil.getChild(this, 0);
        }
    
    }
