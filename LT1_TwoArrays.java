public class LT1_TwoArrays {
    public static void main (String[] args) {
        int[] A = {40, 35, 60, 12}; 
        int[] B = {20, 8, 5, 70, 15}; 
        int[] C = new int[A.length + B.length]; 
        System.arraycopy(A, 0, C, 0, A.length);
        System.arraycopy(B, 0, C, A.length, B.length); 

        System.out.print("Combined Array: ");
        for (int a = 0; a < C.length; a++) System.out.print(C[a] + "  "); 
        System.out.println("\n");

        int a, key; 
        for (int b = 1; b < C.length; b++) {
            key = C[b];
            a = b - 1;
            while (a >= 0 && C[a] > key) {
                C[a + 1] = C[a]; 
                a = a - 1;
                System.out.println("Inside while loop: " + C[0] + "  " + C[1] + "  " +  C[2] + "  " + C[3] + "  " + C[4] + "  " + C[5] + "  " + C[6] + "  " + C[7] + "  " + C[8]);
            }
            C[a + 1] = key;
            System.out.println(); 
            System.out.println("Insertion Sort: " + C[0] + "  " + C[1] + "  " +  C[2] + "  " + C[3] + "  " + C[4] + "  " + C[5] + "  " + C[6] + "  " + C[7] + "  " + C[8]); 
        }
        System.out.println("\nTheodore Kyle Choa   |   2ITB");  
    }
}