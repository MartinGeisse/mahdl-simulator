package name.martingeisse.mahdl.simulator.parser.psi;

public final class ASTNode {

	private final IElementType elementType;
	private final ASTNode[] children;
	private final boolean publicNode;
	private ASTNode parent;
	private PsiElement psi;

	public ASTNode(IElementType elementType, ASTNode[] children, boolean publicNode) {
		this.elementType = elementType;
		this.children = children;
		this.publicNode = publicNode;
	}

	public IElementType getElementType() {
		return elementType;
	}

	public ASTNode[] getChildren() {
		return children;
	}

	public PsiElement getPsi() {
	    if (!publicNode) {
	        throw new IllegalStateException("trying to get the PSI for a private node");
	    }
		if (psi == null) {
			psi = PsiFactory.createPsiElement(this);
		}
		return psi;
	}

	public void initializeTree() {
        if (!publicNode) {
            throw new IllegalStateException("the root AST node must be a public node");
        }
        if (parent != null) {
            throw new IllegalStateException("found parent node");
        }
        initializeChildren(this);
	}

	private void initializeChildren(ASTNode effectiveParent) {
        for (ASTNode child : children) {
            if (child.parent != null) {
                throw new IllegalStateException("found parent node");
            }
            if (child.publicNode) {
                child.parent = effectiveParent;
                child.initializeChildren(child);
            } else {
                child.initializeChildren(effectiveParent);
            }
        }
	}

}
