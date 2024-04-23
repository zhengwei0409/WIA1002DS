package S2W7.Lab;

import java.util.LinkedList;

public class MyQueue<E> {
    LinkedList<E> myList = new LinkedList<>();

    public MyQueue(E[] e) {
        for(E i : e) {
            myList.addLast(i);
        }
    }

    public MyQueue() {}

    public void enqueue(E e) {
        myList.addLast(e);
    }

    public E dequeue() {
        return myList.removeFirst();
    }

    public E getElement(int i) {
        return myList.get(i);
    }

    public E peek() {
        return myList.getFirst();
    }

    public int getSize() {
        return myList.size();
    }

    public boolean contains(E e) {
        return myList.contains(e);
    }

    public boolean isEmpty() {
        return myList.isEmpty();
    }

    public String toString() {
        return myList.toString();
    }
}
