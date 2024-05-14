package S2W10.Lab;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(substitudeAI("flabbergasted"));
        System.out.println(substitudeAI("Astronaut"));
    }
    
    public static String substitudeAI(String str) {
        // base case 
        if(str.isEmpty()) {
            return "";
        }

        Character firstChar = str.charAt(0);
        if(firstChar == 'a') {
            firstChar = 'i';
        }

        // recursive call
        return firstChar + substitudeAI(str.substring(1));


    }
}
