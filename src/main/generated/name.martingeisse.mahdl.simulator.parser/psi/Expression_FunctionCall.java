package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Expression_FunctionCall extends Expression  {

    public Expression_FunctionCall( ASTNode node) {
        super(node);
    }

        public LeafPsiElement getFunctionName() {
            return (LeafPsiElement)InternalPsiUtil.getChild(this, 0);
        }
        public ListNode<Expression> getArguments() {
            return (ListNode<Expression>)InternalPsiUtil.getChild(this, 2);
        }
    
    }
