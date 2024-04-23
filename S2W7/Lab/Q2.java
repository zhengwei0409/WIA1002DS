package S2W7.Lab;

public class Q2 {
    public static boolean isPalindrome(String i) {
        MyQueue<Character> myQueue = new MyQueue<>();

        for(int j = 0; j < (i.length()+1) / 2; j++ ) {
            myQueue.enqueue(i.charAt(j));
        }

        for(int j = i.length() - 1; j >= (i.length()+1) / 2; j--) {
            if(!myQueue.dequeue().equals(i.charAt(j))) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String string1 = "solana";
        String string2 = "bnb";
        String string3 = "civic";

        System.out.println("Is string1 palindrome? " + isPalindrome(string1));
        System.out.println("Is string2 palindrome? " + isPalindrome(string2));
        System.out.println("Is string2 palindrome? " + isPalindrome(string3));
    }
}
