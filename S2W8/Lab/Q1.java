package S2W8.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
/*
 * Note:
 * 1. PriorityQueue in Java does not guarantee a specific order when printed directly using toString().
 * 2. PriorityQueue also does not guarantee the order of its elements when using iteration methods like iterator() or forEach().
 * 3. To get the elements in sorted order, you should use the poll() method to extract elements one by one from the PriorityQueue until it is empty.
 */
public class Q1 {
    public static void main(String[] args) {

        Integer[] arr =  {4, 8, 1, 2, 9, 6, 3, 7};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(arr));

        // Display all the elements inside this priority queue.
        System.out.println(pq);

        // retrieve and remove the first element in this priority queue
        System.out.println("First element: " + pq.poll());

        // add new element 5 into the priority queue
        pq.add(5);

        // convert the priority queue into an array and display.
        System.out.println("Priority queue converted to an array: " + Arrays.toString(pq.toArray()));

        // retrieve the first element in the priority queue.
        System.out.println("First element: " + pq.peek());

        // check if the priority queue consists of element “1”
        System.out.println("Containts element 1 ? " + pq.contains(1));

        // get the current size of the priority queue
        System.out.println("Current size of pq: " + pq.size());

        // display while removing the elements in the queue until it is empty.
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();

        // Sort the priority queue in reversing order.
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : arr) {
            pq2.add(i);
        }
        while (!pq2.isEmpty()) {
            System.out.print(pq2.poll() + " ");
        }
    }
} 
