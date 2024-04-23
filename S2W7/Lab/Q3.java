package S2W7.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyQueue<Integer> share = new MyQueue<>();
        MyQueue<Integer> price = new MyQueue<>();
        int profit = 0, totalShareBought = 0;


        while (true) {
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            String userInput = sc.nextLine();

            if(userInput.isEmpty()) {break;}
            
            // Regular expression pattern to match "Buy / Sell x shares at $y each" format
            String pattern = "(Buy|Sell) (\\d+) shares at \\$(\\d+) each";

            // Compile the pattern into a regex Pattern object
            Pattern regexPattern = Pattern.compile(pattern);

            // Create a Matcher object to match the input string against the pattern
            Matcher matcher = regexPattern.matcher(userInput);

            // Check if the input string matches the pattern
            if (matcher.matches()) {
                // Extract values using group() method of Matcher
                if(matcher.group(1).equals("Buy")) {
                    share.enqueue(Integer.parseInt(matcher.group(2)));
                    totalShareBought += share.peek();
                    price.enqueue(Integer.parseInt(matcher.group(3)));
                    System.out.println("Buying.....");
                } else {

                    int sellQuantity = Integer.parseInt(matcher.group(2));
                    int sellPrice = Integer.parseInt(matcher.group(3));
                    MyQueue<Integer> tempShareQueue = new MyQueue<>();
                    System.out.println("Selling......");
                    if(totalShareBought < sellQuantity) {System.out.println("Not enough share to sell");}
                    
                    else {
                        
                        while (sellQuantity > 0) {
                            if(sellQuantity < share.peek()) {
                                profit += calculateProfit(totalShareBought, sellPrice, price.peek());
                                tempShareQueue.enqueue(share.dequeue() - sellQuantity);
                                while (!share.isEmpty()) {
                                    tempShareQueue.enqueue(share.dequeue());
                                }
                                share = tempShareQueue;
                                break;
                            } else {
                                profit += calculateProfit(totalShareBought, sellPrice, price.peek());
                                sellQuantity -= share.dequeue();
                                price.dequeue();
                            }
                        }
                        
                    }
                    System.out.println("Current Capital Gain/Loss : $" + profit);
                }
                System.out.println("Queue for share : " + share);
                System.out.println("Queue for price : " + price);
                
            } else {
                System.out.println("Invalid input format.");
            }
        }
        
        System.out.println("Final capital Gain/Loss : $" + profit);

        sc.close();
    }

    public static int calculateProfit(int share, int sellPrice, int boughtPrice) {
        return share * (sellPrice - boughtPrice);
    }
}
