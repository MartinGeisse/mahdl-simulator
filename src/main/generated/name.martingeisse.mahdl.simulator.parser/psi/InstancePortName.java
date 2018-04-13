package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class InstancePortName extends ASTWrapperPsiElement  {

    public InstancePortName( ASTNode node) {
        super(node);
    }

        public LeafPsiElement getIdentifier() {
            return (LeafPsiElement)InternalPsiUtil.getChild(this, 0);
        }
    
    }
