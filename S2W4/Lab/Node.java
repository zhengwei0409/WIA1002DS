package Lab;

public class Node<E> {
    E element;
    Node<E> next;

    public Node() {
        element = null;
    }

    public Node(E o) {
        element = o;
    }
}