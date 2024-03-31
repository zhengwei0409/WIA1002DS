
package Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    Thursday, 18 June 2021
    It’s me again. Finally, it’s the end of the term and the DS class has finished!
    I have performed very well in the class. I am happy about it.
    From DS, I learn that DS is actually not that difficult.
    Therefore, my target grade is still to get A+.
    I think I did very well in this course.
    However, the course structure could have been done better.

*/

public class Q1 {
    public static void main(String[] args) {
        
        // read the original letter
        try {
            Scanner sc = new Scanner(new FileInputStream("zhengwei_23005014.txt"));
            
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }
        
        // append the new text to the letter
        try {
            
            
            Scanner sc = new Scanner(System.in);
            
            PrintWriter write = new PrintWriter(new FileOutputStream("zhengwei_23005014.txt", true));
            
            write.println();
            
            System.out.print("Enter date: ");
            write.println(sc.nextLine());
            
            write.println();
            
            while(true) {
                System.out.println("Enter text [q to exit] : ");
                String line = sc.nextLine();
                if(line.equals("q")) {
                    break;
                } 
                write.println(line);
            }

            sc.close();
            write.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }
        
        // display the final letter
        try {
            Scanner sc = new Scanner(new FileInputStream("zhengwei_23005014.txt"));
            
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }
        
    }
}
