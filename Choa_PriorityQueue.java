import java.util.Comparator;
import java.util.PriorityQueue;
// Natural Ordering

public class Choa_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); 
        pq.add(50);
        pq.add(10);
        pq.add(30);
        
        System.out.println("Head: " + pq.peek()); // 10 smallest element

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // 10, 30, 50
        }
        System.err.println();
    }
}