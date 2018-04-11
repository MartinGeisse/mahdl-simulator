package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class DataType_Matrix extends DataType  {

    public DataType_Matrix( ASTNode node) {
        super(node);
    }

        public Expression getFirstSize() {
            return (Expression)InternalPsiUtil.getChild(this, 2);
        }
        public Expression getSecondSize() {
            return (Expression)InternalPsiUtil.getChild(this, 5);
        }
    
    }
