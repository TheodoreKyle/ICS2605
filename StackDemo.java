class StackArray {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor
    StackArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push element
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Pop element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek element
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        System.out.println("Stack is empty");
        return -1;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
}

public class StackDemo {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(20);
        stack.push(25);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek()); 
    }
}