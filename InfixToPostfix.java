import java.util.Stack;

public class InfixToPostfix{
    public static void main(String[] args) {
        String infixExpression = "(A+B)*C-(D^E+F/G*H)-I";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }

    // Function to check if a character is an operator (+, -, *, /, ^)
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Function to get the precedence of an operator
    public static int Prec(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1; // Invalid operator
        }
    }

    // Function to convert infix expression to postfix expression
    public static String infixToPostfix(String infix) {
        String prefix="" ;
        Stack<Character> Stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                prefix+=c;
            } else if (c == '(') {
                Stack.push(c);
            } else if (c == ')') {
                while (!Stack.isEmpty() && Stack.peek() != '(') {
                    prefix+=(Stack.pop());
                }
                    Stack.pop(); // Pop '(' Element
            } else if (isOperator(c)) {
                while (!Stack.isEmpty() && Prec(Stack.peek()) >= Prec(c)) {
                    prefix+=Stack.pop();
                }
                Stack.push(c);
            }
        }

        while (!Stack.isEmpty()) {
            prefix+=Stack.pop();
        }

        return prefix.toString();
    }
}
