package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ImplementationItem_DoBlock extends ImplementationItem  {

    public ImplementationItem_DoBlock( ASTNode node) {
        super(node);
    }

        public DoBlockTrigger getTrigger() {
            return (DoBlockTrigger)InternalPsiUtil.getChild(this, 2);
        }
        public Statement getStatement() {
            return (Statement)InternalPsiUtil.getChild(this, 4);
        }
    
    }
