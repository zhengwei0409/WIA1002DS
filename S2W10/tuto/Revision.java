package S2W10.tuto;

public class Revision {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }

    // factorial
    public static int calculateFactorial(int i) {
        // base case 
        if(i == 1) {
            return 1;
        }

        // recursive call
        return i * calculateFactorial(i-1);
    }
}
