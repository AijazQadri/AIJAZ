package javaapplication30;

class Stack {
    int[] stack;
    int top;
    int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    void push(int val) {
        if (top == capacity - 1) {
            System.out.println("Overflow");
            return;
        }
        stack[++top] = val;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return stack[top--];
    }

    int find() {
        if (top == -1) {
            System.out.println("Empty Stack");
            return -1;
        }
        return stack[top];
    }
}

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(3);

        s.push(4);
        s.push(6);
        s.push(1);

        System.out.println(s.find());
    }
}