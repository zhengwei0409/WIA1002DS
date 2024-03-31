package Lab;

public class MyLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public void addFirst(E e) {
        Node<E> firstNode = new Node<>(e);
        firstNode.next = head;
        head = firstNode;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(E e) {
        if (tail == null) {
            head = tail = new Node<>(e);
        } else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }

    public void add(int index, E e) {
        if (index == 0)
            addFirst(e);
        else if (index >= size)
            addLast(e);
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
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

    public boolean contains(E e) {
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

    public E get(int index) {

        if(index < 0 || index >= size) return null;

        Node<E> current = head;

        for(int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.element;
    }

    public E getFirst() {
        return head.element;
    }

    public E getLast() {
        return tail.element;
    }

    public int indexOf(E e) {
        Node<E> current = head;
        int currentIndex = 0;
        while (current != null) {
            
            if(current.element.equals(e)) {
                return currentIndex;
            }

            currentIndex++;
            current = current.next;
        }

        return -1;

    }

    public int lastIndexOf(E e) {
        Node<E> current = head;
        Boolean hasFound = false;
        int currentIndex = 0, lastIndex = 0;

        while (current != null) {
            
            if(current.element.equals(e)) {
                lastIndex = currentIndex;
                hasFound = true;
            }

            currentIndex++;
            current = current.next;
        }

        if (hasFound) return lastIndex;
        else return -1;
    }

    public E set(int index, E e) {

        if(index < 0 || index >= size) return null;

        Node<E> current = head;

        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        E temp = current.element;
        current.element = e;
        return temp;
    }

    public void clear() {
        head = tail = null;
    }

    public void print() {

        Node<E> current = head;

        for(int i = 0; i < size; i++) {
            System.out.print(current.element + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void reverse() {
        String s = "";
        Node<E> current = head;

        for(int i = 0; i < size; i++) {
            s = current.element + " " + s;
            current = current.next;
        }
        
        System.out.println(s);
    }

    public E getMiddleValue() {
        Node<E> current = head;

        for(int i = 0; i < size / 2; i++) {
            current = current.next;
        }

        return current.element;
    }
}
