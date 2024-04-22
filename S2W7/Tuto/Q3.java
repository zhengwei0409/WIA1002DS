package S2W7.Tuto;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        Scanner keyIn = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            if (keyIn.nextBoolean())
                System.out.print(i + " ");
            else
                q.offer(i);
        }
        while (!q.isEmpty())
            System.out.print(q.poll() + " ");

        System.out.println();

        keyIn.close();
    }

    // a) 1 4 5 2 3
    // b) Impossible, 4 cannot follow by 2
    // c) i)   true true true true true
    //    ii)  false false false false false
    //    iii) true true true true false
}
