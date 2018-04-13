package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Expression_Parenthesized extends Expression  {

    public Expression_Parenthesized( ASTNode node) {
        super(node);
    }

        public Expression getExpression() {
            return (Expression)InternalPsiUtil.getChild(this, 1);
        }
    
    }
