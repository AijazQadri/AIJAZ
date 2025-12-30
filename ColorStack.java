import java.util.Scanner;

class ColorStack {
    String[] stack;
    int top;
    int size;

    ColorStack(int size) {
        this.size = size;
        stack = new String[size];
        top = -1;
    }

    void push(String color) {
        if (top < size - 1) {
            stack[++top] = color;
        }
    }

    String pop() {
        if (top == -1) {
            return null;
        }
        return stack[top--];
    }

    void display() {
        if (top == -1) {
            System.out.println("Empty Stack");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]);
            if (i != top) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}

public class ColorBallStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        ColorStack stack = new ColorStack(n);

        for (int i = 0; i < n; i++) {
            stack.push(sc.nextLine());
        }

        String removeColor = sc.nextLine();

        System.out.print("Original Stack: ");
        stack.display();

        ColorStack temp = new ColorStack(n);

        while (stack.top != -1) {
            String color = stack.pop();
            if (!color.equalsIgnoreCase(removeColor)) {
                temp.push(color);
            }
        }

        while (temp.top != -1) {
            stack.push(temp.pop());
        }

        System.out.print("Updated Stack: ");
        stack.display();

        sc.close();
    }
}
