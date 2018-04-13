package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Expression_Conditional extends Expression  {

    public Expression_Conditional( ASTNode node) {
        super(node);
    }

        public Expression getCondition() {
            return (Expression)InternalPsiUtil.getChild(this, 0);
        }
        public Expression getThenBranch() {
            return (Expression)InternalPsiUtil.getChild(this, 2);
        }
        public Expression getElseBranch() {
            return (Expression)InternalPsiUtil.getChild(this, 4);
        }
    
    }
