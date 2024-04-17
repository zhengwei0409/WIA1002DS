public class Q4 {
    public static void main(String[] args) {
        try {
            System.out.println("Is \"radar\" palindrome? " + isPalindrome("radar"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isPalindrome(String s) throws Exception {
        if(s.length() > 15) throw new Exception("String length exceeds maximum limit (15 characters)");

        MyStack<Character> myStack = new MyStack<>();

        for(int i = 0; i < s.length(); i++) {
            myStack.push(s.charAt(i));
        }

        StringBuilder reverseString = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            reverseString.append(myStack.pop());
        }

        return s.equals(reverseString.toString());
    }
}
