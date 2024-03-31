/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author zhengwei
 * @param <T>
 */
//public class Q1 {
//    public static void main(String[] args) {
//        Container.main(args);
//    }
//}

public class Container<T> {
    
    private T t;
    
    public Container() {};
    
    public void add(T var1) {
        t = var1;
    }
    
    public T retrieve() {
        return t;
    }
    
    public static void main(String[] args) {
        Container<Integer> container1 = new Container<>();
        container1.add(50);
        Container<String> container2 = new Container<>();
        container2.add("Java");
        
        System.out.println("Container1 : " + container1.retrieve());
        System.out.println("Container2 : " + container2.retrieve());
    }
}
