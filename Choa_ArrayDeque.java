import java.util.ArrayDeque;
import java.util.Queue;
public class Choa_ArrayDeque {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(); 
        queue.offer("Alice"); 
        queue.offer("Bob");
        queue.offer("Charlie"); 

        System.out.println("Queue: " + queue); // [Alice, Bob, Charlie]

        // Peek at head 
        System.out.println("Head: " + queue.peek()); // Alice

        // Remove elements
        System.out.println("Removed: " + queue.poll()); // Alice
        System.out.println("Removed: " + queue.poll()); // Bob
        System.out.println("Queue: " + queue); // Charlie
    }
}
