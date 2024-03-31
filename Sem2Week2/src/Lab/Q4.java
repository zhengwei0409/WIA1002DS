/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author zhengwei
 */
public class Q4 {
    
    public static void main(String[] args) {
        
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
        
    }
    
    public static <T extends Comparable<T>> String minmax(T[] array) {
        T min = array[0], max = array[0];
        
        for(T i : array) {
            if(i.compareTo(min) < 0) {
                min = i;
            } else if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        
        // The toString() method is implicitly called on min and max to get 
        // their string representations
        return String.format("Min = %s Max = %s", min,max);
    }
}
