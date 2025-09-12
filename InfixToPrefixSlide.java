import java.util.Stack;
public class InfixToPrefixSlide {

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

    // convert infix to prefix
    public static String infixToPrefix(String X) {
        int n = X.length();
        char[] Y = new char[2 * n];  // output
        int k = 0;

        Stack<Character> optr = new Stack<>(); // operator stack
        Stack<Character> rev = new Stack<>();  // reversed output

        // process from right to left
        for (int i = n - 1; i >= 0; i--) {
            char token = X.charAt(i);

            if (isOperand(token)) {
                rev.push(token);
            } else {
                while (!optr.isEmpty() && precedence(token) < precedence(optr.peek())) {
                    rev.push(optr.pop());
                }
                optr.push(token);
            }
        }

        // move remaining operators to rev
        while (!optr.isEmpty()) {
            rev.push(optr.pop());
        }

        // pop from rev into Y (this reverses it again)
        while (!rev.isEmpty()) {
            Y[k++] = rev.pop();
        }

        return new String(Y, 0, k);
    }

    // test
    public static void main(String[] args) {
        String infix = "A+B/C-D*E";
        String prefix = infixToPrefix(infix);
        System.out.println("Infix: " + infix);
        System.out.println("Prefix: " + prefix); // Expected: -+A/BC*DE
    }
}
