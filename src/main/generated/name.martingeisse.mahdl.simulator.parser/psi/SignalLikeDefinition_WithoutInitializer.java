package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class SignalLikeDefinition_WithoutInitializer extends SignalLikeDefinition  {

    public SignalLikeDefinition_WithoutInitializer( ASTNode node) {
        super(node);
    }

        public LeafPsiElement getIdentifier() {
            return (LeafPsiElement)InternalPsiUtil.getChild(this, 0);
        }
    
    }
