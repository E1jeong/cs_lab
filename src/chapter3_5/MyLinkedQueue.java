package chapter3_5;

public class MyLinkedQueue<E> extends CircularLinkedList<E> implements QueueInterface<E> {

    @Override
    public void enQueue(E x) {
        addElement(x);
    }

    @Override
    public E deQueue() {
        return removeElement(0);
    }

    @Override
    public E front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        return getNode(0).getData();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public void dequeueAll() {
        removeAll();
    }
}
