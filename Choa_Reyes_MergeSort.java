public class Choa_Reyes_MergeSort {
    static void mergeSort(int[] A, int p, int r) {  
        if (p < r) {
            int q = (int) Math.floor((p + r) / 2);
            mergeSort(A, p, q); 
            mergeSort(A, q + 1, r);
            Merge(A, p, q, r);
        }
    }
    static void Merge(int[] A, int p, int q, int r) {
        int sub1 = q - p + 1;
        int sub2 = r - q;
        int[] L = new int[sub1]; 
        int[] R = new int[sub2];
        for (int i = 0; i < sub1; i++) L[i] = A[p + i];
        for (int j = 0; j < sub2; j++) R[j] = A[q + 1 + j];


        System.out.print("Left: ");
        for (int x : L) System.out.print(x + "  ");
        System.out.print("    Right: ");
        for (int x : R) System.out.print(x + "  ");
        System.out.println();


        int i = 0, j = 0, k = p;
        while (i < sub1 && j < sub2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            }
            else {
                A[k] = R[j];
                j++;
            }
            k++;  
        }
        while (i < sub1) {
            A[k] = L[i];
            i++; k++;
        }
        while (j < sub2) {
            A[k] = R[j];
            j++; k++;
        }
        System.out.print("Result after merging: ");
        for (int idx = p; idx <= r; idx++)
            System.out.print(A[idx] + "  ");
        System.out.println("\n");
    }
    public static void main (String[] args) {
        int[] A = {25, 79, 14, 8, 61, 30};
        mergeSort(A, 0, A.length - 1);
    }
}

/* Procedure:
1. Divide the array into 2 halves. 
2. Recursively sort each half.
3. Merge the two sorted halves back together into a single sorted array.
4. Continue this process until the entire array is sorted. 
*/