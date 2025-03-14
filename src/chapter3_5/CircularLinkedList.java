package chapter3_5;

import chapter3_2.ListInterface;
import chapter3_3.ListNode;

public class CircularLinkedList<E> implements ListInterface<E> {
    private ListNode<E> rear;
    private int count;

    public CircularLinkedList() {
        count = 0;
        rear = new ListNode(-1); //dummy
        rear.next = rear; //circular
    }


    @Override
    public void insertElement(int index, E data) {

        if (index >= 0 && index <= count) {
            ListNode<E> prevNode = getNode(index - 1);
            ListNode<E> newNode = new ListNode(data, prevNode.next);
            prevNode.next = newNode;

            if (index == count) {
                rear = newNode;
            }

            count++;
        }
    }

    @Override
    public void addElement(E data) {
        ListNode<E> prevNode = rear;
        ListNode<E> newNode = new ListNode(data, rear.next);
        prevNode.next = newNode;
        rear = newNode;
        count++;
    }

    @Override
    public E removeElement(int index) {

        if (index >= 0 && index <= count - 1) {
            ListNode<E> prevNode = getNode(index - 1);
            E data = prevNode.next.getData();
            prevNode.next = prevNode.next.next;

            if (index == count) {
                rear = prevNode;
            }
            count--;
            return data;
        } else {
            return null;
        }
    }

    @Override
    public E getElement(int index) {
        if (index >= 0 && index <= count - 1) {
            return getNode(index).getData();
        } else return null;
    }

    public ListNode<E> getNode(int index) {
        if (index >= -1 && index <= count) {
            ListNode<E> currNode = rear.next; // dummy head
            for (int i = 0; i <= index; i++) {
                currNode = currNode.next;
            }
            return currNode;
        } else return null;
    }

    public final int NOT_FOUND = -12345;

    public int indexOf(E x) {
        ListNode<E> currNode = rear.next; //dummy head
        for (int i = 0; i < count - 1; i++) {
            currNode = currNode.next;
            if (((Comparable) (currNode.getData())).compareTo(x) == 0) return i;
        }
        return NOT_FOUND;
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void removeAll() {
        count = 0;
        rear = new ListNode(-1);
        rear.next = rear;

    }

    @Override
    public void printAll() {
        ListNode<E> head = rear.next; // 더미 헤드
        System.out.print("Print list (#items=" + count + ") ");
        for (ListNode<E> t = head.next; t != head; t = t.next)
            System.out.print(t.getData() + " ");
        System.out.println();
    }
}

