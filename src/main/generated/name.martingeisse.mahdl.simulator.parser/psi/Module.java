package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Module extends ASTWrapperPsiElement  {

    public Module( ASTNode node) {
        super(node);
    }

        public Optional<LeafPsiElement> getNativeness() {
            return (Optional<LeafPsiElement>)InternalPsiUtil.getChild(this, 0);
        }
        public QualifiedModuleName getModuleName() {
            return (QualifiedModuleName)InternalPsiUtil.getChild(this, 2);
        }
        public ListNode<PortDefinitionGroup> getPortDefinitionGroups() {
            return (ListNode<PortDefinitionGroup>)InternalPsiUtil.getChild(this, 6);
        }
        public ListNode<ImplementationItem> getImplementationItems() {
            return (ListNode<ImplementationItem>)InternalPsiUtil.getChild(this, 8);
        }
    
    }
