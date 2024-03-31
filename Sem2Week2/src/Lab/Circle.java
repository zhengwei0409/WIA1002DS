/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author zhengwei
 */
public class Circle implements Comparable<Circle> {
    
    private double radius;
    
    @Override
    public int compareTo(Circle o) {
        if(this.radius > o.radius) return 1;
        else if(this.radius < o.radius) return -1;
        else return 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
        
    public String toString() {
        return Double.toString(radius);
    }
}
