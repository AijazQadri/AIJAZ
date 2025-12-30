
package aasad;

import java.util.Stack;

public class Aasad {

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return -1;
    }

    static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    postfix += stack.pop();
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch))
                    postfix += stack.pop();
                stack.push(ch);
            }
        }

        while (!stack.isEmpty())
            postfix += stack.pop();
        return postfix;
    }
    public static void main(String[] args) {
        String infix = "(A+B)*(C-D)";
        String postfix = infixToPostfix(infix);

        System.out.println("Infix Expression   : " + infix);
        System.out.println("Postfix Expression : " + postfix);
    }
}
