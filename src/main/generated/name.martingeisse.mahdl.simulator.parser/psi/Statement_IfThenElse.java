package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Statement_IfThenElse extends Statement  {

    public Statement_IfThenElse( ASTNode node) {
        super(node);
    }

        public Expression getCondition() {
            return (Expression)InternalPsiUtil.getChild(this, 2);
        }
        public Statement getThenBranch() {
            return (Statement)InternalPsiUtil.getChild(this, 4);
        }
        public Statement getElseBranch() {
            return (Statement)InternalPsiUtil.getChild(this, 6);
        }
    
    }
