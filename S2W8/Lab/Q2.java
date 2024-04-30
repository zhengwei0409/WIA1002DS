package S2W8.Lab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Q2 {
    public static void main(String[] args) {

        String[] arr1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        String[] arr2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};

        PriorityQueue<String> pq1 = new PriorityQueue<>(Arrays.asList(arr1));
        PriorityQueue<String> pq2 = new PriorityQueue<>(Arrays.asList(arr2));

        // find the union
        HashSet<String> unionSet = new HashSet<>(); // HashSet in Java is a collection.
        unionSet.addAll(pq1);
        unionSet.addAll(pq2);
        PriorityQueue<String> unionPQ = new PriorityQueue<>(unionSet);
        System.out.println("\nUnion of PQ1 & PQ2 : ");
        while (!unionPQ.isEmpty()) {
            System.out.print(unionPQ.poll()+ " ");
        }

        // find the different
        HashSet<String> differentSet = new HashSet<>(pq1);
        differentSet.removeAll(pq2);
        PriorityQueue<String> differentPQ = new PriorityQueue<>(differentSet);
        System.out.println("\nDifferent of PQ1 & PQ2 : ");
        while (!differentPQ.isEmpty()) {
            System.out.print(differentPQ.poll()+ " ");
        }

        // find the intersection
        HashSet<String> intersectionSet = new HashSet<>(pq1);
        intersectionSet.retainAll(pq2);
        PriorityQueue<String> intersectionPQ = new PriorityQueue<>(intersectionSet);
        System.out.println("\nIntersection of PQ1 & PQ2 : ");
        while (!intersectionPQ.isEmpty()) {
            System.out.print(intersectionPQ.poll()+ " ");
        }


    }
}
