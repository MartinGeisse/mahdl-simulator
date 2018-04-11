package name.martingeisse.mahdl.simulator.parser.psi;


public final class Optional<T extends PsiElement> extends ASTWrapperPsiElement {

    public Optional( ASTNode node) {
        super(node);
    }

    public T getIt() {
        return (T)InternalPsiUtil.getChild(this, 0);
    }

}
