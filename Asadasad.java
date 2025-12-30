package asadasad;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLL {
    Node top;

    StackLL() {
        top = null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed into stack");
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow! Cannot pop");
            return;
        }
        System.out.println(top.data + " popped from stack");
        top = top.next;
    }
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Asadasad {

    public static void main(String[] args) {

        StackLL stack = new StackLL();
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Stack Using Linked List ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
