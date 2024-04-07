package S2W5.lab;

public class Q3 {
    public static void main(String[] args) {
        DLinkedList<Integer> list = new DLinkedList<>();

        list.addFirst(1);
        list.add(1, 10);
        list.addLast(100);
        list.add(2, 2);

        list.remove(3);

        list.iterateForward();
        list.iterateBackword();

        System.out.println("Size of linked list: " + list.getSize());

        list.clear();

        System.out.println("Size of linked list: " + list.getSize());

    }
    

}
