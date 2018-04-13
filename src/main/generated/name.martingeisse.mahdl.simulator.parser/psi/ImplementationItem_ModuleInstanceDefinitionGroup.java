package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ImplementationItem_ModuleInstanceDefinitionGroup extends ImplementationItem  {

    public ImplementationItem_ModuleInstanceDefinitionGroup( ASTNode node) {
        super(node);
    }

        public QualifiedModuleName getModuleName() {
            return (QualifiedModuleName)InternalPsiUtil.getChild(this, 0);
        }
        public ListNode<ModuleInstanceDefinition> getDefinitions() {
            return (ListNode<ModuleInstanceDefinition>)InternalPsiUtil.getChild(this, 1);
        }
    
    }
