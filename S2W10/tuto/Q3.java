package S2W10.tuto;

public class Q3 {
    public static void main(String[] args) {
        String i = "string";
        System.out.println(reverse(i));
    }

    public static String reverse(String string) {
        
        // base case
        if(string.length() <= 1 || string == null) {
            return string;
        }

        // recursive call
        return reverse(string.substring(1)) + string.charAt(0);
    }
}
