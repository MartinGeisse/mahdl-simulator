package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class SignalLikeDefinition_WithInitializer extends SignalLikeDefinition  {

    public SignalLikeDefinition_WithInitializer( ASTNode node) {
        super(node);
    }

        public LeafPsiElement getIdentifier() {
            return (LeafPsiElement)InternalPsiUtil.getChild(this, 0);
        }
        public ExtendedExpression getInitializer() {
            return (ExtendedExpression)InternalPsiUtil.getChild(this, 2);
        }
    
    }
