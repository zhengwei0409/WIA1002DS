package S2W5.tutorial;

public class Q1 {
    /* (credited to github.com/samweihong/WIA1002-Data-Structure/)
     * a)
     * Line 10 - 13:
     * If index is 0, replace the head's element with e and return this new element.
     * However, it is expected that the head's initial element is returned.
     * Line 14 - 21:
     * Otherwise, replace the (index)th node's element with e and return this new element.
     * To do so, current is set to be the node before the (index)th node.
     * Then, the node after current is accessed to replace its element with e.
     * However, it is expected that the (index)th's initial element is returned.
     *
     * b)
     * Replace the (index)th node's element with e and return its initial element.
     * However, if the index is beyond the bounds, a node with element e will be added to the respective end and null will be returned.
    */
    
    /*
    c)
    public E xyz(int index, E e) {
        if (index < 0) {
            addFirst(e);
            return null;
        }
        if (index >= size) {
            addLast(e);
            return null;
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        E element = current.element;
        current.element = e;
        return element;
    }

    */

}
