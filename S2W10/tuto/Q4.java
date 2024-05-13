package S2W10.tuto;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int n) {
        // base case
        if(n == 1) {
            return 1;
        }

        // recursive call
        return n + sum(n-1);
    }
}
