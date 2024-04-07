package S2W5.lab;


public class SNode<E> {
    E element;
    SNode<E> next;

    public SNode() {}

    public SNode(E e) {
        element = e;
    }
}
