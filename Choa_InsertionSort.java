public class Choa_InsertionSort {
    static void insertionSort(int[] A) {
        int i, el;
        for (int j = 1; j < A.length; j++) {
            el = A[j];
            i = j - 1;
            while (i >= 0 && A[i] > el) {
                A[i + 1] = A[i];
                i = i - 1; 
                System.out.println("Inside while loop: " + A[0] + "  " + A[1] + "  " +  A[2] + "  " + A[3] + "  " + A[4] + "  " + A[5]);
            }
            System.out.println();
            A[i + 1] = el;
            System.out.println("Lap " + j + ": " + A[0] + "  " + A[1] + "  " +  A[2] + "  " + A[3] + "  " + A[4] + "  " + A[5]);
        }  
    }
    public static void main (String[] args) {
        int[] A = {25, 79, 14, 8, 61, 30};
        insertionSort(A);  
    }
}


/* Notes
   Procedure:
   1. Start from the second element of the array (Consider the first element as sorted).
   2. Take the current element (key) and compare it with the elements in the sorted position.
   3. Shift all larger elements one position to the right.
   4. Insert the key in its correct position.
   5. Repeat until the entire array is sorted.
 */
