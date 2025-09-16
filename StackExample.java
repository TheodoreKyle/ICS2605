import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> s = new Stack<>(); 

        // Push elements
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Stack after pushes: " + s);

        // Peek element
        System.out.println("Top element (peek): " + s.peek());

        // Pop element
        System.out.println("Popped element: " + s.pop());
        System.out.println("Stack after pop: " + s);

        // Search element
        System.out.println("Position of 10: " + s.search(10));

        // Check if empty
        System.out.println("Is stack empty? " + s.isEmpty());

        
    }
}
