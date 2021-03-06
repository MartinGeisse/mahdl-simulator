package name.martingeisse.mahdl.simulator.parser.psi;

public class ASTWrapperPsiElement extends PsiElement {

	private final ASTNode node;
	private PsiElement[] children;

	public ASTWrapperPsiElement(ASTNode node) {
		this.node = node;
	}

	public ASTNode getNode() {
		return node;
	}

	public PsiElement[] getChildren() {
		if (children == null) {
			ASTNode[] childNodes = node.getChildren();
			children = new PsiElement[childNodes.length];
			for (int i = 0; i < childNodes.length; i++) {
				children[i] = childNodes[i].getPsi();
			}
		}
		return children;
	}

}
