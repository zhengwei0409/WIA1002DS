package S2W5.lab;

public class Node<E> {
    E element;
    Node<E> next;
    Node<E> previous;

    public Node (E element, Node<E> next, Node<E> prev) {
        this.element = element;
        this.next = next;
        this.previous = prev;
    }

    public Node (E element) {
        this(element,null,null);
    }
}
