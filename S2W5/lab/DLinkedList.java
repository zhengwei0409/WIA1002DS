package S2W5.lab;

import java.util.NoSuchElementException;

public class DLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size = 0;

    public int getSize() {
        return size;
    }

    public void addFirst(E e) {
        Node<E> tmp = new Node<E>(e, head, null);
        if(head != null) head.previous = tmp;
        head = tmp;
        if(tail == null) tail = head;
        size++;
        System.out.println("adding: " + e);
    }

    public void addLast(E e) {
        Node<E> tmp = new Node<E>(e, null, tail);
        if(tail != null) tail.next = tmp;
        tail = tmp;
        if(tail == null) head = tail;
        size++;
        System.out.println("adding: " + e);
    }

    public void add(int index, E e) {
        if(index < 0 || index > size) throw new IndexOutOfBoundsException();
        if(index == 0) addFirst(e);
        else if(index == size) addLast(e);
        else {
            Node<E> temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            Node<E> insert = new Node<E>(e, temp, temp.previous);
            temp.previous.next = insert;
            temp.previous = insert;
            size++;
        }
    }

    public E removeLast() {
        if(size == 0) throw new NoSuchElementException();
        Node<E> temp = tail;
        tail = tail.previous;
        tail.next = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return tail.element;
    }

    public E removeFirst() {
        if(size == 0) throw new NoSuchElementException();
        Node<E> temp = head;
        head = head.next;
        head.previous = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }

    public E remove(int index) {
        E element = null;
        if(index < 0 || index > size) throw new IndexOutOfBoundsException();
        if(index == 0) element = removeFirst();
        else if (index == size - 1) element = removeLast();
        else {
            Node<E> temp = head;
            for(int i = 0; i < index; i++) {
                temp = temp.next;
            }
            element = temp.element;
            temp.next.previous = temp.previous;
            temp.previous.next = temp.next;
            temp.previous = null;
            temp.next = null;
            size--;
        }
        return element;
    }

    public void iterateForward() {

        System.out.println("iterating forward...");
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void iterateBackword() {
        System.out.println("iterating backward...");
        Node<E> temp = tail;
        while (temp != null) {
            System.out.print(temp.element + " ");
            temp = temp.previous;
        }
        System.out.println();
    } 

    public void clear() {
        Node<E> temp = head;
        while (head != null) {
            temp = head.next;
            head.previous = head.next = null;
            head = temp;
        }
        temp = null;
        tail.previous = tail.next = null;
        size = 0;
    }

}
