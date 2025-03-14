package chapter3_4;

public interface StackInterface<E> {
    public void push(E newItem);

    public E pop();

    public E peek();

    public boolean isEmptyStack();

    public void popAll();
}
