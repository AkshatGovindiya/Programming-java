import java.util.Stack;

public class InfixToPrefix {

    // Function to check if the given character is an operator
    public  static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    // Function to get the precedence of an operator
    public static int getPrecedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Function to convert infix to prefix
    public static String infixToPrefix(String infix) {
        String prefix ="";
        Stack<Character> stack = new Stack<>();

        for (int i = infix.length() - 1; i >= 0; i--) {
            char c = infix.charAt(i);

            // If the character is an operand, add it to the prefix expression
            if (!isOperator(c) && c != '(' && c != ')') {
                prefix+=c;
            }
            else if (c == ')') {
                stack.push(c);
            }
            else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix+=stack.pop();
                }
                stack.pop();
            } 
            else {
                while (!stack.isEmpty() && getPrecedence(stack.peek()) > getPrecedence(c)) {
                    prefix+=stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            prefix+=stack.pop();
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "A+B-C/D";
        String prefixExpression = infixToPrefix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Prefix Expression: " + prefixExpression);
    }
}
