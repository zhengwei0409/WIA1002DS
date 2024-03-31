
package Tutorial;

public class Q1Main {
    public static void main(String[] args) {
        Telephone[] arr = {new Telephone("03",79676300), new Telephone("03", 79676301),
                            new Telephone("03", 79676302), new Telephone("03", 79676303),
                            new Telephone("03", 79676304)};
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].makeFullNumber());
        }
    }
}
