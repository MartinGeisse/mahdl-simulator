package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PortDefinitionGroup_Valid extends PortDefinitionGroup  {

    public PortDefinitionGroup_Valid( ASTNode node) {
        super(node);
    }

        public PortDirection getDirection() {
            return (PortDirection)InternalPsiUtil.getChild(this, 0);
        }
        public DataType getDataType() {
            return (DataType)InternalPsiUtil.getChild(this, 1);
        }
        public ListNode<PortDefinition> getDefinitions() {
            return (ListNode<PortDefinition>)InternalPsiUtil.getChild(this, 2);
        }
    
    }
