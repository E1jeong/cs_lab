package chapter3_5;

public interface QueueInterface<E> {
    public void enQueue(E x);

    public E deQueue();

    public E front();

    public boolean isEmpty();

    public void dequeueAll();
}

