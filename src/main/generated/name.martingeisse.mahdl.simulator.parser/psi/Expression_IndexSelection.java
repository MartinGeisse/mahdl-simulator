package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Expression_IndexSelection extends Expression  {

    public Expression_IndexSelection( ASTNode node) {
        super(node);
    }

        public Expression getContainer() {
            return (Expression)InternalPsiUtil.getChild(this, 0);
        }
        public Expression getIndex() {
            return (Expression)InternalPsiUtil.getChild(this, 2);
        }
    
    }
