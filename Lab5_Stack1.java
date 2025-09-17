// Choa, Theodore Kyle   |   2ITB
import java.util.Scanner;
import java.util.Stack;
public class Lab5_Stack1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> integers = new Stack<>();
        int n; 
        int SENTINEL = -1;

        System.out.println("Enter integers (-1 to stop): ");
        for (n = input.nextInt(); n > SENTINEL; n = input.nextInt()) integers.push(n); 

        System.out.print("Displaying in Reverse Order: ");
        while (!integers.isEmpty()) System.out.print(integers.pop() + "  ");
        input.close();
    }
}