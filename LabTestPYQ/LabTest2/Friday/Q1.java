package LabTestPYQ.LabTest2.Friday;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        CrazyDiamondStack<String> stack = new CrazyDiamondStack<>();
        System.out.println(stack);
        stack.push("Cinderella");
        stack.push("Echoes");
        stack.push("Earth Wind and Fire");
        stack.push("The Hand");
        stack.push("Heaven's Door");
        System.out.println(stack);
        System.out.println();

        for (int i = 0; i < 4; i++)
            System.out.print(stack.pop() + " > ");
        System.out.println();
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println();
        stack.push("Harvest");
        stack.push("The Lock");
        stack.push("Pearl Jam");
        stack.push("Surface");
        stack.push("Love Deluxe");
        stack.push("Highway Star");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println();
        stack.push("Killer Queen");
        stack.push("Sheer Heart Attack");
        stack.push("Bites the Dust");
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println();
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " > ");
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack);

    }

}

class TheHandStack<TH> {

    private final ArrayList<TH> stack = new ArrayList<>();

    public void push(TH element) {
        stack.add(element);
    }

    public TH pop() {
        return stack.remove(0);
    }

    public TH peek() {
        return stack.get(0);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}

class CrazyDiamondStack<CD> {
    private final TheHandStack<CD> stack1 = new TheHandStack<>();
    private final TheHandStack<CD> stack2 = new TheHandStack<>();

    public void push(CD o) {
        stack1.push(o);
    }

    public CD pop() {
        if (stack1.size() == 0) {
            return null;
        }
        int size1 = stack1.size();
        for (int i = 0; i < size1 - 1; i++) {
            stack2.push(stack1.pop());
        }

        CD popped = stack1.pop();

        int size2 = stack2.size();
        for (int i = 0; i < size2; i++) {
            stack1.push(stack2.pop());
        }

        return popped;
    }

    public CD peek() {
        if (stack1.size() == 0) {
            return null;
        }
        int size1 = stack1.size();
        for (int i = 0; i < size1 - 1; i++) {
            stack2.push(stack1.pop());
        }

        CD peeked = stack1.peek();
        stack2.push(stack1.pop());

        int size2 = stack2.size();
        for (int i = 0; i < size2; i++) {
            stack1.push(stack2.pop());
        }

        return peeked;
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public int size() {
        return stack1.size();
    }

    @Override
    public String toString() {
        ArrayList<CD> array = new ArrayList<>();

        int sizeOri = stack1.size() - 1;
        int loop = 1;

        while (sizeOri >= 0) {
            for (int i = 0; i < sizeOri; i++) {
                stack2.push(stack1.pop());
            }

            array.add(stack1.peek());
            for (int i = 0; i < loop; i++) {
                stack2.push(stack1.pop());
            }
            loop++;

            int size2 = stack2.size();
            for (int i = 0; i < size2; i++) {
                stack1.push(stack2.pop());
            }

            sizeOri--;
        }

        return array.toString();

    }
}
