package S2W10.tuto;

public class Q5 {
    public static void main(String[] args) {
        printSeparateDigit(4567);
    }

    public static void printSeparateDigit(int n) {
        if(n < 10) {
            System.out.print(n + " ");;
        } else {
            printSeparateDigit(n / 10);
            System.out.print((n%10) + " ");
        }
    }
}
