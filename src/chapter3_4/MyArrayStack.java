package chapter3_4;

import chapter3_2.MyArrayList;

public class MyArrayStack<E> extends MyArrayList<E> implements StackInterface<E> {

    int top; // stack top pointer

    public MyArrayStack() {
        top = 0;
    }

    public MyArrayStack(int size) {
        super(size);
    }

    @Override
    public void push(E newItem) {

        if (isFull()) {
            System.out.println("stack is full");
            return;
        }
        addElement(newItem);
        top++;
    }

    @Override
    public E pop() {
        if (top == 0) {
            System.out.println("stack is empty");
            return null;
        }
        return removeElement(top - 1);
    }

    @Override
    public E peek() {
        if (top == 0) {
            System.out.println("stack is empty");
            return null;
        }
        return getElement(top - 1);
    }

    @Override
    public boolean isEmptyStack() {
        return top == 0;
    }

    @Override
    public void popAll() {
        printAll();
    }

    public boolean isFull() {
        return top == getCapacity();
    }
}
