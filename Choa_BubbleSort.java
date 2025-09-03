public class Choa_BubbleSort {
    public static void main (String[] args) {
        int[] A = {25, 79, 14, 8, 61, 30};
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = A.length - 1; j > i; j--) {
                if (A[j] < A[j - 1]) {
                    A[j] = A[j] + A[j - 1];
                    A[j - 1] = A[j] - A[j - 1];
                    A[j] = A[j] - A[j - 1];
                }
            }
            System.out.println("Lap " + (i + 1) + ": " + A[0] + "  " + A[1] + "  " + A[2] + "  " + A[3] + "  " + A[4] + "  " + A[5]);  
        }
    }
}