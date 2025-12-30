import java.util.Scanner;

class Stack {
    int[] stack = new int[10];
    int top = -1;

    void push(int x) {
        if (top == 9) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = x;
            System.out.println(x + " pushed");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--] + " popped");
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    void isEmpty() {
        System.out.println(top == -1 ? "Stack is empty" : "Stack is not empty");
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();

        for (int i = 0; i < 10; i++) {
            s.push(sc.nextInt());
        }

        s.pop();
        s.peek();
        s.display();
        s.isEmpty();
        s.push(100);

        sc.close();
    }
}
