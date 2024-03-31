/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author zhengwei
 */
public class MyArray {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};
        String[] names = {"Jane","Tom","Bob"};
        Character[] characters = {'a','b','c'};
        
        listAll(numbers);
        listAll(names);
        listAll(characters);
        
    }
    
    public static <T> void listAll(T[] array) {
        for(T i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
