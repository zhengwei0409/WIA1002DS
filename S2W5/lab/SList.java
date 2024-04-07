package S2W5.lab;


public class SList<E> {
    SNode<E> head;
    SNode<E> tail;
    int size = 0;

    public void appendEnd(E e) {
        SNode<E> node = new SNode<>(e);
        if(tail == null) head = tail = node;
        else {
            tail.next = node;
            tail = tail.next;
        }
        size++;
    }

    public E removeInitial() {
        if(tail == null) return null;
        else {
            SNode<E> temp = head;
            head = head.next;
            size--;
            if(head == null) 
                tail = null;
            return temp.element;
        }
    }

    public E removeLast() {
        if(tail == null) return null;
        else if(size == 1) {
            SNode<E> current = head;
            head = tail = null;
            size = 0;
            return current.element;
        } else {
            SNode<E> current = head;
            for(int i = 0; i < size - 1; i++)
                current = current.next;
            SNode<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    } 

    public boolean contains(E e) {
        SNode<E> current = head;
        while (current != null) {
            if(current.element.equals(e)) return true;
            current = current.next;
        }
        return false;
    }

    public void empty() {
        head = tail = null;
        size = 0;
        System.out.println("The list is empty");
    }

    public void display() {
        SNode<E> current = head;
        while (current!= null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }

}
