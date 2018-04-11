package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Expression_InstancePort extends Expression  {

    public Expression_InstancePort( ASTNode node) {
        super(node);
    }

        public InstanceReferenceName getInstanceName() {
            return (InstanceReferenceName)InternalPsiUtil.getChild(this, 0);
        }
        public InstancePortName getPortName() {
            return (InstancePortName)InternalPsiUtil.getChild(this, 2);
        }
    
    }
