package name.martingeisse.mahdl.simulator.parser.psi;


import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;

public final class ListNode<T extends PsiElement> extends ASTWrapperPsiElement {

    private final IElementType[] elementTypes;
    private final Class<T> elementClass;

    public ListNode( ASTNode node, IElementType[] elementTypes, Class<T> elementClass) {
        super(node);
        this.elementTypes = elementTypes;
        this.elementClass = elementClass;
    }

    public <S extends PsiElement> ListNode<S> cast(Class<S> subclass) {
        if (!elementClass.isAssignableFrom(subclass)) {
            throw new ClassCastException(subclass.getName() + " is not a subclass of " + elementClass.getName());
        }
        return (ListNode)this;
    }

    public final List<T> getAll() {
        List<T> list = new ArrayList<>();
        addAllTo(list);
        return list;
	}

	public final void addAllTo(List<T> list) {
        foreach(list::add);
	}

    
    public final void foreach(Consumer<T> consumer) {
        InternalPsiUtil.foreachChild(this, child -> {
                            IElementType childType = child.getNode().getElementType();
                for (IElementType elementType : elementTypes) {
                    if (childType == elementType) {
                        consumer.accept(elementClass.cast(child));
                        return;
                    }
                }
                        if (child instanceof ListNode<?> && child.getNode().getElementType() == getNode().getElementType()) {
                ListNode<?> typedChild = (ListNode<?>)child;
                typedChild.cast(elementClass).foreach(consumer);
            }
        });
    }

}
