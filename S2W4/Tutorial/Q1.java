package Tutorial;

public class Q1 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //part a
        Node<Character> node1 = new Node<>('a');
        Node<Character> node2 = new Node<>('z');

        Node<Character> head = node1;
        Node<Character> tail = node2;

        //part b
        /*
            head:    tail:
            node1    node2
        */

        //part c
        node1.next = node2;

        //part d
        Node<Character> firstNode = new Node<>('f');
        firstNode.next = head;
        head = firstNode;

        /*

         head:                 tail:
         firstNode -> node1 -> node2

        */

        //part e
        /*
        
        - If the linked-list is empty, the new node becomes the head and the tail.
        - If the linked-list is not empty, the new node becomes the head, 
        and its next reference points to the old head.
        
        */

        // part f
        /*
        
        1. Create a new node firstNode.
        2. Set firstNode's next pointer to the current head.
        3. Update head to point to firstNode.

        */

        // part g
        // already done it in part d


    }
}