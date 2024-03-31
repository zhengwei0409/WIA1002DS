/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author zhengwei
 */
public class MinMaxTwoDArray {
    public static void main(String[] args) {
        Integer[][] list = {{4, 5, 6}, {1, 2, 3}};
        
        System.out.println("min : " + min(list));
        System.out.println("max : " + max(list));
    }
    
    public static <E extends Comparable<E>> E min(E[][] list) {
        E min = list[0][0];
        for(E i[] : list) {
            for(E j : i) {
                if(j.compareTo(min) < 0) {
                    min = j;
                }
            }
        }
        return min;
    }
    
    public static <E extends Comparable<E>> E max(E[][] list) {
        E max = list[0][0];
        for(E i[] : list) {
            for(E j : i) {
                if(j.compareTo(max) > 0) {
                    max = j;
                }
            }
        }
        return max;
    }
}
