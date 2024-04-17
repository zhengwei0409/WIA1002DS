import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyStack<Integer> myStack = new MyStack<>();

        System.out.print("Enter an Integer value : ");
        int j = sc.nextInt();

        for(int i = 1; i <= j; i++) {
            myStack.push(i);
        }

        System.out.println("Stack size : " + myStack.getSize());

        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop() + " ");
        }

        // The values are printed in reversed order because the top value of stack is printed first and so on.
        System.out.println();
        sc.close();
    }
}
