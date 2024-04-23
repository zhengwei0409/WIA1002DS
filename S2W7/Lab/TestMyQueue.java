package S2W7.Lab;

public class TestMyQueue {
    public static void main(String[] args) {
        String[] initialize = {"Durian", "Blueberry"};
        MyQueue<String> myQueue = new MyQueue<>(initialize);

        myQueue.enqueue("Apple");
        myQueue.enqueue("Orange");
        myQueue.enqueue("Grapes");
        myQueue.enqueue("Cherry");

        System.out.println("My Fruit Queue: " + myQueue);
        System.out.println("Top item: " + myQueue.peek());
        System.out.println("Queue size: " + myQueue.getSize());

        myQueue.dequeue();

        System.out.println("Item at index position 2: " + myQueue.getElement(2));
        System.out.println("Does the queue contains Cherry? " + myQueue.contains("Cherry"));
        System.out.println("Does the queue contains Durian? " + myQueue.contains("Durian"));
        System.out.println("Is queue empty: " + myQueue.isEmpty());
    }
}
