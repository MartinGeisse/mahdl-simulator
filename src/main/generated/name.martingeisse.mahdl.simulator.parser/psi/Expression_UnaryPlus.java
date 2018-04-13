package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Expression_UnaryPlus extends Expression implements UnaryOperation {

    public Expression_UnaryPlus( ASTNode node) {
        super(node);
    }

        public Expression getOperand() {
            return (Expression)InternalPsiUtil.getChild(this, 1);
        }
    
    }
