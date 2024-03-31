/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author zhengwei
 */
public class TestStringTokenizer {
    public static void main(String[] args) {
        
        try{
            
            Scanner r = new Scanner(new FileInputStream("text4.txt"));
            
            int cnt = 0;
            
            while(r.hasNextLine()) {
                
                StringTokenizer token = new StringTokenizer(r.nextLine(),"123456789");
                
                while(token.hasMoreTokens()) {
                    System.out.print(token.nextToken());
                    cnt++;
                }
                
                System.out.println();
                
            }
            
            System.out.println("Total number of characters: " + cnt);
            
            r.close();
            
        } catch (Exception e) {
            
        }
        
        
        
        
        
        
    }
}
