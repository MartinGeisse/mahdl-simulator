package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Expression_RangeSelection extends Expression  {

    public Expression_RangeSelection( ASTNode node) {
        super(node);
    }

        public Expression getContainer() {
            return (Expression)InternalPsiUtil.getChild(this, 0);
        }
        public Expression getFrom() {
            return (Expression)InternalPsiUtil.getChild(this, 2);
        }
        public Expression getTo() {
            return (Expression)InternalPsiUtil.getChild(this, 4);
        }
    
    }
