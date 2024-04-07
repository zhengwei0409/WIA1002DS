package S2W5.lab;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentManagementSystem<E> {
    SNode<E> head;
    SNode<E> tail;
    int size = 0;

    public void add(E e) {
        SNode<E> node = new SNode<>(e);
        if(tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
        size++;
    }

    public void removeElement(E e) {
        if(tail == null) throw new NullPointerException("The list is empty");
        if (size == 1) head = tail = null;
        if (!this.contains(e)) throw new NoSuchElementException("Student not found");
        if (head.element.equals(e)) {
            head = head.next;
        } 
        else if(tail.element.equals(e)) {
            System.out.println(size);
            SNode<E> current = head;
            for(int i = 0; i < size - 2; i++)
                current = current.next;
            tail = current;
            tail.next = null;
        }
        else {
            SNode<E> current = head;
            while (current.next != null) {
                if(current.next.element.equals(e)) {
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
        }
        size--;
    }

    public void printList() {
        SNode<E> current = head;
        System.out.print(current.element);
        while (current.next != null) {
            current = current.next;
            System.out.print(", " + current.element);
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public boolean contains(E e) {
        if(tail == null) return false;
        else {
            SNode<E> current = head;
            while (current != null) {
                if(current.element.equals(e)) {
                    return true;   
                }
                current = current.next;
            }
            return false;
        }
    }

    public void replace(E e, E eNew) {
        if(tail == null) throw new NullPointerException("List is empty");
        if(!this.contains(e)) throw new NoSuchElementException("Student not found");
        SNode<E> current = head;
        while (current != null) {
            if(current.element.equals(e)) {
                current.element = eNew;
                return;
            }
            current = current.next;
        }
    }

}


class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem<String> studentSystem = new StudentManagementSystem<>();

        System.out.println("Enter your student name list. Enter 'n' to end.....");
        while (true) {
            String name = sc.nextLine();
            if(name.equalsIgnoreCase("n")) break;
            else studentSystem.add(name);
        }
        System.out.println();
        
        System.out.println("You have entered the following students' name :");
        studentSystem.printList();
        System.out.println();

        System.out.println("The number of students entered is : " + studentSystem.getSize());
        System.out.println();

        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        String userInput = sc.nextLine();
        System.out.println();
        if(userInput.equalsIgnoreCase("r")) {
            System.out.println("Enter the existing student name that u want to rename : ");
            String oldName = sc.nextLine();
            System.out.println();
            System.out.println("Enter the new name : ");
            String newName = sc.nextLine();
            System.out.println();

            studentSystem.replace(oldName, newName);

            System.out.println("The new student list is : ");
            studentSystem.printList();
            System.out.println();
        }

        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        userInput = sc.nextLine();
        if(userInput.equalsIgnoreCase("y")) {
            System.out.println("Enter a student name to remove :");
            userInput = sc.nextLine();
            studentSystem.removeElement(userInput);
            System.out.println();

            System.out.println("The number of updated student is : " + studentSystem.getSize());
            System.out.println("The updated students list is :");
            studentSystem.printList();
            System.out.println();
        }


        System.out.println("All student data captured complete. Thank you!");

        sc.close();

    }
    
}