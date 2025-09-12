public class Stack<T> {
    private int maxStkSize = 100; // default size
    private int top = -1;         // top index
    private Object[] stk;         // use Object[] because generics can't be arrays

    // Default constructor
    public Stack() {
        stk = new Object[maxStkSize];
    }

    // Constructor with size
    public Stack(int n) {
        if (n > 0) maxStkSize = n;
        stk = new Object[maxStkSize];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == maxStkSize - 1;
    }

    // Push element
    public void push(T value) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
        } else {
            stk[++top] = value;
        }
    }

    // Pop element
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return null;
        } else {
            return (T) stk[top--];
        }
    }

    // Peek top element
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        } else {
            return (T) stk[top];
        }
    }

    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

    // Test
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>(10);

        intStack.push(5);
        intStack.push(43);
        intStack.push(-6);
        intStack.push(28);

        intStack.display(); // 5 43 -6 28

        System.out.println("Top element: " + intStack.peek());

        intStack.pop();
        intStack.display(); // 5 43 -6

        // Example with Strings
        Stack<String> stringStack = new Stack<>(5);
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.display(); // Hello World
    }
}
