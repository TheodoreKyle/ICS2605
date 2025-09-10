import java.util.*;
public class SearchLab3 {

    // Linear search - returns index of first match or -1 if not found
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Iterative binary search - array must be sorted
    // returns index of target or -1 if not found
    public static int binarySearch(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements (n): ");
        int n = Integer.parseInt(scanner.nextLine().trim());

        int[] arr = new int[n];
        System.out.print("Choose input mode: 1 - random, 2 - manual: ");
        int mode = Integer.parseInt(scanner.nextLine().trim());

        if (mode == 1) {
            Random r = new Random();
            for (int i = 0; i < n; i++) arr[i] = r.nextInt(100); // 0..99
        } else {
            System.out.println("Enter " + n + " integers separated by space:");
            String[] tokens = scanner.nextLine().trim().split("\\s+");
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(tokens[i]); 
        }

        System.out.print("Enter target value to search for: ");
        int target = Integer.parseInt(scanner.nextLine().trim());

        // Linear search on unsorted array
        long startLinear = System.nanoTime();
        int linIdx = linearSearch(arr, target);
        long endLinear = System.nanoTime(); 
        System.out.println("Linear search index: " + linIdx);
        System.out.println("Linear search time: " + (endLinear - startLinear) + "ns");

        // Binary search requires sorted array
        Arrays.sort(arr); 
        long startBinary = System.nanoTime();
        int binIdx = binarySearch(arr, target);
        long endBinary = System.nanoTime();
        System.out.println("Binary search index: " + binIdx);
        System.out.println("Binary search time: " + (endBinary - startBinary) + "ns"); 

        scanner.close();
    }
}