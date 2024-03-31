
package Lab;

import java.io.FileInputStream;
import java.util.Scanner;

/*
    replace(char oldChar, char newChar)
    replaceAll(String regex, String replacement)

Alternative:
    - use StringTokenizer(String,delimiter)
    - delimiter can be a string containing one or more characters that act as separators between tokens or regular expression
*/

public class Q2 {
    
    public static void main(String[] args) {
        try{
            
            // text 1
            
            Scanner sc = new Scanner(new FileInputStream("text1.txt"));
            
            int charCount = 0;
            
            System.out.println("Characters from text1.txt without the special characters :");
            while(sc.hasNextLine()) {
                String[] char1 = sc.nextLine().split(",");
                charCount += char1.length;
                
                for (String i : char1) {
                    System.out.print(i);
                }
                
                System.out.println();
            }
            
            System.out.println("Number of characters retrieved from text1.txt : " + charCount);
            
            System.out.println();
            
            // text 2
            
            sc = new Scanner(new FileInputStream("text2.txt"));
            
            charCount = 0;
            
            System.out.println("Characters from text2.txt without the special characters :");
            
            while(sc.hasNextLine()) {
                String[] char2 = sc.nextLine().replace(" ", "").split(",");
                charCount += char2.length;

                for (String i : char2) {
                    System.out.print(i);
                }
                
                System.out.println();
            }
            
            System.out.println("Number of characters retrieved from text2.txt : " + charCount);
            
            System.out.println();
            
            
            // text 3
            
            sc = new Scanner(new FileInputStream("text3.txt"));
            
            charCount = 0;
            
            System.out.println("Characters from text3.txt without the special characters :");
            
            while(sc.hasNextLine()) {
                String[] char3 = sc.nextLine().replace(" ", "").split(";");
                charCount += char3.length;

                for (String i : char3) {
                    System.out.print(i);
                }
                
                System.out.println();
            }
            
            System.out.println("Number of characters retrieved from text3.txt : " + charCount);
            
            System.out.println();
            
            // text4
            
            sc = new Scanner(new FileInputStream("text4.txt"));
            
            charCount = 0;
            
            System.out.println("Characters from text4.txt without the special characters :");
            
            while(sc.hasNextLine()) {
                String[] char3 = sc.nextLine().replaceAll("[0-9]", "").split("");
                charCount += char3.length;

                for (String i : char3) {
                    System.out.print(i);
                }
                
                System.out.println();
            }
            
            System.out.println("Number of characters retrieved from text4.txt : " + charCount);
            
            System.out.println();
            
            sc.close();
            
        } catch(Exception e) {
            
        }

    }
 
}
