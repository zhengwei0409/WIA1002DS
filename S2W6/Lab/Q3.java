public class Q3 {
    
    public int sumOfStack(MyStack<Integer> s) {
        if(s.isEmpty()) return 0;

        int sum = 0;

        while (!s.isEmpty()) {
            sum += s.pop();
        }

        return sum;
    }
}
