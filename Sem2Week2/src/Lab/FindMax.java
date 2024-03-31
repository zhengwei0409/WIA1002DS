/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author zhengwei
 */
public class FindMax {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        String[] arr2 = {"red","green","blue"};
        Circle[] arr3 = {new Circle(3), new Circle(2.9), new Circle(5.9)};
        
        System.out.println("Max : " + max(arr1));
        System.out.println("Max : " + max(arr2));
        System.out.println("Max : " + max(arr3));
    }
    
    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];
        
        for(E i : list) {
            if(i.compareTo(max) > 0) {
                max = i;
            }
        }
        
        return max;
    }
    
}
