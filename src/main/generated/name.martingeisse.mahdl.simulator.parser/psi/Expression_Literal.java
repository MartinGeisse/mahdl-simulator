package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Expression_Literal extends Expression  {

    public Expression_Literal( ASTNode node) {
        super(node);
    }

        public Literal getLiteral() {
            return (Literal)InternalPsiUtil.getChild(this, 0);
        }
    
    }
