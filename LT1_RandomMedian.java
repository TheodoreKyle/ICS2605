import java.util.*; 
public class LT1_RandomMedian {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in); 
        int n;
        double median; 
        int[] unsorted, sorted; 
        System.out.print("Enter the number of elements for the array: ");
        n = in.nextInt(); 
        unsorted = new int[n]; sorted = new int[n]; 

        // Creating random numbers and copying to sorted array
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = (int)(Math.random() * 100 ) + 1; // +1 to make it numbers from 1 - 100
            sorted[i] = unsorted[i];  
        } 

        System.out.print("Original Array: "); 
        for (int i = 0; i < unsorted.length; i++) System.out.print(unsorted[i] + "  ");
        System.out.println();

        System.out.print("Sorted Array: ");
        for (int a = 0; a < sorted.length; a++) {  
            for (int b = sorted.length - 1; b > a; b--) {
                if (sorted[b] < sorted[b - 1]) {
                    sorted[b] = sorted[b] + sorted[b - 1];
                    sorted[b - 1] = sorted[b] - sorted[b - 1];
                    sorted[b] = sorted[b] - sorted[b - 1];
                }
            }
            System.out.print(sorted[a] + "  ");   
        }
        System.out.println();
        System.out.print("Median: "); 
        if (n % 2 == 0) median = (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0;  
        else median = sorted[n / 2]; 
        System.out.print(median);  
        in.close(); 
        System.out.println("\nTheodore Kyle Choa   |   2ITB"); 
    }
}
// This is a comment