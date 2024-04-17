
public class TestMyStack {

    public static void main(String[] args) {
        MyStack<Character> myStack = new MyStack<>();

        myStack.push('a');
        myStack.push('b');
        myStack.push('c');

        System.out.println(myStack);

        System.out.printf("'b' is in stack? %s\n", myStack.search('b'));
        System.out.printf("'k' is in stack? %s\n", myStack.search('k'));

        MyStack<Integer> myStack2 = new MyStack<>();

        myStack2.push(1);
        myStack2.push(2);
        myStack2.push(3);

        System.out.println(myStack2);

        System.out.printf("'6' is in stack? %s\n", myStack2.search(6));

    }
    
}