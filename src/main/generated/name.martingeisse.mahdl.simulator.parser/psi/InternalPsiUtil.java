package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.function.Consumer;

public final class InternalPsiUtil {

	// prevent instantiation
	private InternalPsiUtil() {
	}

	public static PsiElement getChild(PsiElement parent, int childIndex) {
		PsiElement[] children = parent.getChildren();
		if (childIndex < 0 || childIndex >= children.length) {
			return null;
		}
		return children[childIndex];
	}

	public static void foreachChild(PsiElement parent, Consumer<PsiElement> consumer) {
		PsiElement[] children = parent.getChildren();
		for (PsiElement child : children) {
			consumer.accept(child);
		}
	}

}

