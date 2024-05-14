package S2W10.Lab;

public class Q2 {
    public static void main(String[] args) {
        stringPermutation("ABC", 0);
    }

    public static void stringPermutation(String str, int left) {
        // base case
        if(left == str.length() - 1 ) {
            System.out.println(str);
        } else {
            for(int i = left; i < str.length(); i++) {
                stringPermutation(swap(str, left, i), left + 1);
            }
        }
    }

    public static String swap(String str, int i, int j) {

        char temp;
        char[] arr = str.toCharArray();
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);

    }
}
