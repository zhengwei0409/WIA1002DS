package S2W8.Tuto;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Q3 {
    public static void main(String[] args) {
        /*
         * Answer :
         * a) peek() give us : C++
         * b) C++
         *    Fortran
         *    Java
         *    Python
         * c) Fortran
         *    Python
         *    Java // idk why python followed by java
         * d) Fortran
         *    Python
         * e) Priority queue contains Ruby or not?: false
         * f) Fortran 
         *    Python
         */

        PriorityQueue<String> pQueue = new PriorityQueue<String>();

        pQueue.offer("C++");
        pQueue.offer("Python");
        pQueue.offer("Java");
        pQueue.offer("Fortran");


        Iterator<String> itr1 = pQueue.iterator();
        while (itr1.hasNext())
            System.out.println(itr1.next());
        
        pQueue.poll();
        System.out.println("After poll():"); 
        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next()); 
        
        pQueue.remove("Java");

        Object[] arr = pQueue.toArray();
        for(Object i : arr) {
            System.out.println(i);
        }
    }
}
