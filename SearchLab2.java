import java.util.*;
public class SearchLab2 {

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

    // Prints only first and last few elements (preview)
    private static void printArrayPreview(int[] arr) { 
        int n = arr.length;
        int limit = Math.min(10, n); // show at most 10
        System.out.print("Array preview: [");
        for (int i = 0; i < limit; i++) {
            System.out.print(arr[i] + (i < limit - 1 ? ", " : ""));
        }
        if (n > 20) {
            System.out.print(", ..., ");
            for (int i = n - limit; i < n; i++) {
                System.out.print(arr[i] + (i < n - 1 ? ", " : ""));
            }
        }
        System.out.println("]");
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
            for (int i = 0; i < n; i++) arr[i] = r.nextInt(100); 
            System.out.println("Random array (unsorted)");
            printArrayPreview(arr);
        } else {
            System.out.println("Enter " + n + " integers separated by space:");
            String[] tokens = scanner.nextLine().trim().split("\\s+");
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(tokens[i]);
        }

        System.out.print("Enter target value to search for: ");
        int target = Integer.parseInt(scanner.nextLine().trim());

        // Measure linear search time
        long startLinear = System.nanoTime();
        int linIdx = linearSearch(arr, target);
        long endLinear = System.nanoTime();
        System.out.println("Linear search index: " + linIdx);
        System.out.println("Linear search time: " + (endLinear - startLinear) + " ns");

        // Sort for binary search
        Arrays.sort(arr);
        System.out.println("Sorted array preview:");
        printArrayPreview(arr);

        // Measure binary search time
        long startBinary = System.nanoTime();
        int binIdx = binarySearch(arr, target);
        long endBinary = System.nanoTime();
        System.out.println("Binary search index: " + binIdx);
        System.out.println("Binary search time: " + (endBinary - startBinary) + " ns");

        scanner.close();
    }
}