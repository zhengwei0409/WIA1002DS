/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author zhengwei
 */
public class Q5n6 {
    public static void main(String[] args) {
        Duo<String,Integer> sideShape = new Duo<>("ILoveU",1314);
        Duo<Double,Double> points = new Duo<>(520.0,1314.0);
    }
}


class Duo<A, B> {
    A first;
    B second;
    
    public Duo(A a, B b) {
        first = a;
        second = b;
    }
    
}
