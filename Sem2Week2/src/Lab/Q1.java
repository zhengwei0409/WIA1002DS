/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author zhengwei
 */
public class Q1 {
    
    public static void main(String[] args) {
        
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        
        strObj.setE("Hello");
        intObj.setE(88);
        
        System.out.println("strObj: " + strObj.getE());
        System.out.println("intObj: " +intObj.getE());
    }
    
    
    
    
}
