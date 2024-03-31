/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author zhengwei
 */
public class CompareMax {
    
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        
        if(y.compareTo(max) > 0) {
            max = y;
        }
        
        if(z.compareTo(max) > 0) {
            max = z;
        }
        
        return max;
        
    }
    
}
