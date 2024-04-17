
import java.util.ArrayList;

public class MyStack<E> {

    private ArrayList<E> list = new ArrayList<>(); 

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        return list.remove(list.size() - 1); // we also can use list.removeLast()
    }

    public E peek() {
        return list.get(list.size() - 1); // we also can use list.getLast()
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }

    public boolean search(E o) {
        return list.contains(o);
    }
}
