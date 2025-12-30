
package asadasadasad;
import java.util.Stack;

public class Asadasadasad {

    static void printStack(Stack<String> stack) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i));
            if (i != 0) System.out.print(" -> ");
        }
        System.out.println();
    }

    static Stack<String> removeColor(Stack<String> original, String removeColor) {
        Stack<String> tempStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();

        while (!original.isEmpty()) {
            String color = original.pop();
            if (!color.equalsIgnoreCase(removeColor)) {
                tempStack.push(color);
            }
        }
        while (!tempStack.isEmpty()) {
            resultStack.push(tempStack.pop());
        }
        return resultStack;
    }
    public static void main(String[] args) {

        Stack<String> colorStack = new Stack<>();
        colorStack.push("Red");
        colorStack.push("Yellow");
        colorStack.push("Orange");
        colorStack.push("Green");
        colorStack.push("Yellow");

        System.out.print("Original Stack  : ");
        printStack(colorStack);
        String chosenColor = "Yellow";
        Stack<String> resultStack = removeColor(colorStack, chosenColor);
        System.out.print("After Stack : ");
        printStack(resultStack);
    }
}
