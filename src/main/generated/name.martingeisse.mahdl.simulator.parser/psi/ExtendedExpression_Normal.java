package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ExtendedExpression_Normal extends ExtendedExpression  {

    public ExtendedExpression_Normal( ASTNode node) {
        super(node);
    }

        public Expression getExpression() {
            return (Expression)InternalPsiUtil.getChild(this, 0);
        }
    
    }
