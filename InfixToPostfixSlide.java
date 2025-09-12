import java.util.Stack;
public class InfixToPostfixSlide {

    // precedence function
    private static int precedence(char op) {
        switch (op) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3; 
        }
        return -1;
    }

    // check if operand
    private static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    // main conversion method
    public static String infixToPostfix(String X) {
        int n = X.length();
        char[] Y = new char[n]; // postfix output
        int k = 0;

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            char token = X.charAt(i);

            if (isOperand(token)) {
                Y[k++] = token; // if operand, add to output
            } else {
                // while stack not empty and precedence(token) <= precedence(top of stack)
                while (!s.isEmpty() && precedence(token) <= precedence(s.peek())) {
                    Y[k++] = s.pop();
                }
                s.push(token); // push current operator
            }
        }

        // pop remaining operators
        while (!s.isEmpty()) {
            Y[k++] = s.pop();
        }

        return new String(Y, 0, k);
    }

    public static void main(String[] args) {
        String infix = "A+B/C-D*E"; 
        String postfix = infixToPostfix(infix);
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix); // Expected: ABC/+DE*-
    }
}
