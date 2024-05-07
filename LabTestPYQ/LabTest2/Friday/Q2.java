package LabTestPYQ.LabTest2.Friday;

import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {
        final String[][] actionArray = {
                { "Travel Three Kingdoms", "Travel Suzume Door", "Travel JOJOLands", "Ask", "Travel FaceBook",
                        "Travel JOJOLands", "Travel Trading World", "Ask", "Destroy JOJOLands", "Ask",
                        "Travel FaceBook", "Ask", "Travel Trading World", "Travel Three Kingdoms", "Ask",
                        "Destroy Three Kingdoms", "Ask" },
                { "Travel Morioh", "Travel Colosseum", "Travel Cape Canaveral", "Ask", "Travel Morioh",
                        "Travel Sardinia", "Destroy Morioh", "Destroy Devil's Palm", "Ask", "Travel Cape Canaveral",
                        "Ask", "Travel Colosseum", "Destroy Sardinia", "Ask", "Travel Naples", "Destroy Colosseum",
                        "Ask" },
                { "Ask", "Travel Jade Garden", "Travel Cafe Deux Magots", "Ask", "Travel Trattoria Trussardi",
                        "Travel Jade Garden", "Travel Cafe Deux Magots", "Travel Trattoria Trussardi", "Ask",
                        "Destroy Trattoria Trussardi", "Ask", "Travel Libeccio", "Travel Cafe Deux Magots",
                        "Travel Jade Garden", "Travel Savage Garden", "Destroy Libeccio", "Ask",
                        "Destroy Savage Garden", "Destroy Cafe Deux Magots", "Ask" }
        };

        for (int i = 0; i < actionArray.length; i++) {
            System.out.printf("Case %d\n", i + 1);
            DisplayAnswers(actionArray[i]);
            System.out.println();
        }
    }

    public static void DisplayAnswers(String[] actions) {

        final Stack<String> stack1 = new Stack<>();
        final Stack<String> stack2 = new Stack<>();

        for (String i : actions) {
            String[] arr = i.split(" ");
            StringBuilder dimension = new StringBuilder();
            for (int j = 1; j < arr.length; j++) {
                dimension.append(arr[j] + " ");
            }
            if (arr.length == 1) {
                if (stack1.isEmpty()) {
                    System.out.println("In Original Dimension");
                } else {
                    System.out.println(stack1.peek());
                }
            }
            else if (arr[0].equals("Travel")) {
                stack1.push(dimension.toString());
            } else {
                // destroy
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }

                while (!stack2.isEmpty() && !stack2.peek().equals(dimension.toString())) {
                    stack1.push(stack2.pop());
                }

                stack2.clear();

            }
        }

    }

}
