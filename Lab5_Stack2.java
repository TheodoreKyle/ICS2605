// Choa, Theodore Kyle   |   2ITB
import java.util.Stack; 
public class Lab5_Stack2 {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        int maxvalue = 100, top = -1; 
        // Step 1
        if (names.size() < maxvalue) {
            names.push("Josh"); names.push("Mon"); names.push("Rufo"); 
            names.push("Alvin"); names.push("Marte"); names.push("Dennis"); top += 6;
        }

        // Step 2
        names.pop(); names.pop(); names.pop(); top -= 3;
        System.out.println(names.peek());
        names.push("Alvin"); names.push("Marte"); names.push("Dennis"); top += 3;

        // Step 3
        names.push("Lloyd"); top += 1; 

        // Step 4
        System.out.println(names.peek());

        // Step 5 
        names.pop(); names.pop(); names.pop(); names.pop(); top -= 4;
        names.push("Alon"); top += 1; 
        names.push("Marte"); names.push("Dennis"); names.push("Lloyd"); top += 3;

        // Step 6 
        System.out.println(names);
        if (top > 99) System.out.println("Stack Overflow");
    }
}