package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Literal_Text extends Literal  {

    public Literal_Text( ASTNode node) {
        super(node);
    }

        public LeafPsiElement getValue() {
            return (LeafPsiElement)InternalPsiUtil.getChild(this, 0);
        }
    
    }
