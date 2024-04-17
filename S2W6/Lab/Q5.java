public class Q5 {
    /*
     * refer to the youtube channel - Abdul Bari (Tower of Hanoi)
     * Then you will understand the code
     */
    public static void main(String[] args) {
        MyStack<Integer> source = new MyStack<>();
        MyStack<Integer> destination = new MyStack<>();
        MyStack<Integer> auxiliary = new MyStack<>();

        int numberOfDisk = 5;

        for(int i = numberOfDisk; i > 0; i--) {
            source.push(i);
        }

        MyStack<Integer> result = towerOfHanoi(numberOfDisk, source, destination, auxiliary);

        System.out.println("Destination rod : " + result);
    }

    public static MyStack<Integer> towerOfHanoi(int numberOfDisk, MyStack<Integer> source,  MyStack<Integer> destination, MyStack<Integer> auxiliary) {
        if(numberOfDisk > 0) {
            towerOfHanoi(numberOfDisk - 1, source, auxiliary, destination);
            destination.push(source.pop());
            towerOfHanoi(numberOfDisk - 1, auxiliary, destination, source);
        }

        return destination;
    }
}
