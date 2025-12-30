
package assad;
class StackADT {
    int max = 10;
    int top;
    int stack[];

    StackADT() {
        stack = new int[max];
        top = -1;
    }
    void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(stack[top--] + " popped from stack");
    }
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }

    void isEmpty() {
        if (top == -1)
            System.out.println("Stack is empty");
        else
            System.out.println("Stack is not empty");
    }
    void isFull() {
        if (top == max - 1)
            System.out.println("Stack is full");
        else
            System.out.println("Stack is not full");
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
public class Assad {

    public static void main(String[] args) {

        StackADT stack = new StackADT();

        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        System.out.println("\n--- Five Stack Operations ---");

        stack.display();   
        stack.pop();       
        stack.peek();      
        stack.isEmpty();   
        stack.isFull();    
    }
}
