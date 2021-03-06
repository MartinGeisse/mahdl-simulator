package name.martingeisse.mahdl.simulator.parser.psi;

public final class LeafPsiElement extends PsiElement {

	private static final PsiElement[] NO_CHILDREN = new PsiElement[0];

	private final ASTNode node;

	public LeafPsiElement(ASTNode node) {
		this.node = node;
	}

	public ASTNode getNode() {
		return node;
	}

	public PsiElement[] getChildren() {
		if (getNode().getChildren().length > 0) {
			throw new RuntimeException("LeafPsiElement was created for ASTNode with children");
		}
		return NO_CHILDREN;
	}

}
