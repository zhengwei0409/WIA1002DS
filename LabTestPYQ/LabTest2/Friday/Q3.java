package LabTestPYQ.LabTest2.Friday;

import java.util.PriorityQueue;

public class Q3 {
    public static void main(String[] args) {
        int[] arr1 =  {1, 2, 3, 4, 10, 6, 9, 8, 7, 5};
        int[] result = findMinSlidingWindow(arr1, 3);
        System.out.print("Output : [");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if(i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static int[] findMinSlidingWindow(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return new int[0];
        }

        int[] result = new int[arr.length - k + 1];

        int init = 0;
        int max = k;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (max <= arr.length) {
            for(int i = init; i < max; i++) {
                pq.offer(arr[i]);
            }
            result[init] = pq.poll();
            pq.clear();
            init++;
            max++;
        }

        return result;
        
    }
}
