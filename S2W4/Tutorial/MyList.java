package Tutorial;

public class MyList<E> {
    Node<E> head;
    Node<E> tail;
    int size = 0;

    // part h
    public void addLast(E c) {
        if (tail == null) {
            head = tail = new Node<E>(c);
        } else {
            tail.next = new Node<E>(c);
            tail = tail.next;
        }
        size++;
    }

    public void add(int index, E d) {
        // if index == 0 , addFirst(d)
        // else if index >= size , addLast(d)
        Node<E> current = head;
        for(int i = 1; i < index; i++) {
            current = current.next;
        }
        Node<E> temp = current.next;
        current.next = new Node<E>(d);
        (current.next).next = temp;
        size++;
    }

    public E removeFirst() {
        if(size == 0) return null;
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if(head == null) tail = null;
            return temp.element;
        }
    }

    // Question 3
    public E removeLast() {
        if(size == 0) return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for(int i = 1; i < size - 1; i++) {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E remove(int index) {
        if(index < 0 || index >= size) return null;
        else if (index == 0) return removeFirst();
        else if (index == size - 1) return removeLast();
        else {
            Node<E> current = head;
            for(int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = temp.next;
            size--;
            return temp.element;
        }
    }

    // Question2 
    public boolean contain(E e) {
        Node<E> current = head;

        while (current != null) {
            if(current.element.equals(e)) {
                System.out.println(current.element);
                return true;
            }
            current = current.next;
        }

        return false;
    }
}
