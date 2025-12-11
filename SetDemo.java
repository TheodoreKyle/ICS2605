import java.util.*;
public class SetDemo {
    public static void main(String[] args) {

        // HashSet (no order)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Banana");
        hashSet.add("Apple"); // duplicate (ignored)

        System.out.println("HashSet (no order): " + hashSet);

        // LinkedHashSet (keeps insertion order)
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Dog");
        linkedSet.add("Cat");
        linkedSet.add("Bird");

        System.out.println("LinkedHashSet (insertion order): " + linkedSet);

        // TreeSet (sorted order)
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);

        System.out.println("TreeSet (sorted): " + treeSet);

        // =============================
        // Set Operations
        // =============================
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        // Union
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);

        // Intersection
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        // Difference (A - B)
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);

        System.out.println("\nSet A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Union (A ∪ B): " + union);
        System.out.println("Intersection (A ∩ B): " + intersection);
        System.out.println("Difference (A - B): " + difference);

        // Membership test
        System.out.println("\nDoes Set A contain 2? " + setA.contains(2));

        // Remove example
        setA.remove(4);
        System.out.println("Set A after removing 4: " + setA);
    }
}
