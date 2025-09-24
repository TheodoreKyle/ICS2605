import java.util.Comparator;
import java.util.PriorityQueue;

public class Choa_CustomComparator {
    public static void main(String[] args) {
        // Custom comparator for reverse order (largest element first)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(50);
        pq.add(10);
        pq.add(30);

        System.out.println("Head: " + pq.peek()); // 50 (largest element)

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // 50, 30, 10
        }
    }
}