package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class DoBlockTrigger_Clocked extends DoBlockTrigger  {

    public DoBlockTrigger_Clocked( ASTNode node) {
        super(node);
    }

        public Expression getClockExpression() {
            return (Expression)InternalPsiUtil.getChild(this, 0);
        }
    
    }
