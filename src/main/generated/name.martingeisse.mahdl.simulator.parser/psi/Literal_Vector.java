package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Literal_Vector extends Literal  {

    public Literal_Vector( ASTNode node) {
        super(node);
    }

        public LeafPsiElement getValue() {
            return (LeafPsiElement)InternalPsiUtil.getChild(this, 0);
        }
    
    }
