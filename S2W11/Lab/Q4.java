package S2W11.Lab;

public class Q4 {
    public static void main(String[] args) {
        Integer[] arr = {10, 34, 2, 56, 7, 67, 88, 42};
        insertionSort(arr);
        for(Integer i : arr) {
            System.out.print(i + " ");
        }
    }

    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        for(int i = 1; i < arr.length; i++) {
            T currentElement = arr[i];
            int k;
            for(k = i - 1; k >= 0 && arr[k].compareTo(currentElement) > 0; k--) {
                arr[k+1] = arr[k];
            }

            arr[k+1] = currentElement;
        }
    }
}
