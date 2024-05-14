package S2W10.Lab;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(exponent(10, 3));
    }

    public static long exponent(int x, int m) {
        // base case
        if(m == 1) {
            return x;
        }

        // recursive call
        return x * exponent(x, m - 1);
    }
}
