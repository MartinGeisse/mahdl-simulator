package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class DataType_Vector extends DataType  {

    public DataType_Vector( ASTNode node) {
        super(node);
    }

        public Expression getSize() {
            return (Expression)InternalPsiUtil.getChild(this, 2);
        }
    
    }
