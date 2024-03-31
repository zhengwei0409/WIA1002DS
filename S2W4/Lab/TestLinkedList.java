package Lab;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> myLinkedList = new MyLinkedList<>();

        myLinkedList.addFirst('a');
        myLinkedList.add(1, 'b');
        myLinkedList.add(2, 'c');
        myLinkedList.add(3, 'd');
        myLinkedList.addLast('e');

        myLinkedList.print();
        myLinkedList.reverse();

        System.out.println("Number of element in the list: " + myLinkedList.size);
        System.out.println("First value: " + myLinkedList.getFirst());
        System.out.println("Last value: " + myLinkedList.getLast());

        System.out.println("Element removed: " + myLinkedList.remove(2));

        System.out.printf("Index Location for b: %s\n", myLinkedList.indexOf('b'));
        System.out.printf("Index Location for c: %s\n", myLinkedList.indexOf('c'));

        System.out.printf("The list contains 'c'? %s\n", myLinkedList.contains('c'));

        myLinkedList.set(0, 'j');
        myLinkedList.set(1, 'a');
        myLinkedList.set(2, 'v');
        myLinkedList.set(3, 'a');
        myLinkedList.print();
    }
}
