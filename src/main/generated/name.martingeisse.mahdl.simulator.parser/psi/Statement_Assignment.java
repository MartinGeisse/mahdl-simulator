package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Statement_Assignment extends Statement  {

    public Statement_Assignment( ASTNode node) {
        super(node);
    }

        public Expression getLeftSide() {
            return (Expression)InternalPsiUtil.getChild(this, 0);
        }
        public ExtendedExpression getRightSide() {
            return (ExtendedExpression)InternalPsiUtil.getChild(this, 2);
        }
    
    }
