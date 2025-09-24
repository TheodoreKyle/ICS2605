import java.util.*;
public class Choa_Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println("Queue: " + queue);
        
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie"); 
        
        // [Alice, Bob, Charlie]
        System.out.println("Queue: " + queue);

        // Peek (head without removing)
        System.out.println("Head: " + queue.peek()); // Alice

        // Remove head
        System.out.println("Removed: " + queue.poll()); 
        System.out.println("Queue: " + queue);

        // Remove again
        System.out.println("Removed: " + queue.remove());
        // Final queue
        System.out.println("Queue: " + queue); // Charlie
    }
}