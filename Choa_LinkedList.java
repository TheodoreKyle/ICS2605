import java.util.LinkedList;
public class Choa_LinkedList {
    static void push(LinkedList<String> list2, String name) { list2.add(name); }
    static void pop(LinkedList<String> list2) { list2.removeLast(); }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Linked List: " + list);
        System.out.println();

        // Accessing Elements
        System.out.println("First Element: " + list.getFirst()); // First Element
        System.out.println("Last Element: " + list.getLast()); // Last Element
        System.out.println();

        // Removing Elements
        list.remove("Banana"); 
        System.out.println("After Removal: " + list);
        System.out.println("------------------------------------------------\n");

        LinkedList<String> list2 = new LinkedList<>();
        push(list2, "One");
        push(list2, "Two");
        push(list2, "Three");  
        System.out.println("List: " + list2);   
        pop(list2); 
        pop(list2);
        System.out.println("List After Removal: " + list2);
    }
}