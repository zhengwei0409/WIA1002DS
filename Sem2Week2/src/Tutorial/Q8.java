/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

import java.util.ArrayList;

/**
 *
 * @author zhengwei
 */
public class Q8 {
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
        display(numOfCars);
        display(milesPerHour);
    }
    
    public static void display(ArrayList<?> arr) {
        for(int i = 0; i < arr.size(); i++) {
            System.out.printf("%s ", arr.get(i));
        }
    }
}
