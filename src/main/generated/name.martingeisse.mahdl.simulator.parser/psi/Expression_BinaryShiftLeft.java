package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Expression_BinaryShiftLeft extends Expression implements BinaryOperation {

    public Expression_BinaryShiftLeft( ASTNode node) {
        super(node);
    }

        public Expression getLeftOperand() {
            return (Expression)InternalPsiUtil.getChild(this, 0);
        }
        public Expression getRightOperand() {
            return (Expression)InternalPsiUtil.getChild(this, 2);
        }
    
    }
