package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ImplementationItem_SignalLikeDefinitionGroup extends ImplementationItem  {

    public ImplementationItem_SignalLikeDefinitionGroup( ASTNode node) {
        super(node);
    }

        public SignalLikeKind getKind() {
            return (SignalLikeKind)InternalPsiUtil.getChild(this, 0);
        }
        public DataType getDataType() {
            return (DataType)InternalPsiUtil.getChild(this, 1);
        }
        public ListNode<SignalLikeDefinition> getDefinitions() {
            return (ListNode<SignalLikeDefinition>)InternalPsiUtil.getChild(this, 2);
        }
    
    }
