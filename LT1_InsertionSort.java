public class LT1_InsertionSort {
    public static void main (String [] arg) {
        int[] array = {40, 35, 60, 12, 20, 8, 5}; 
        int a, key, total = 0; 
        for (int b = 1; b < array.length; b++) {
            int comparison = 0; 
            key = array[b];
            a = b - 1;
            while (a >= 0 && array[a] > key) {
                array[a + 1] = array[a]; 
                a = a - 1;
                System.out.println("Inside while loop: " + array[0] + "  " + array[1] + "  " +  array[2] + "  " + array[3] + "  " + array[4] + "  " + array[5] + "  " + array[6]); 
                comparison++; 
            }
            total += comparison;
            array[a + 1] = key;
            System.out.println(); 
            System.out.println("Sorted Array: " + array[0] + "  " + array[1] + "  " +  array[2] + "  " + array[3] + "  " + array[4] + "  " + array[5] + "  " + array[6]);
            System.out.println("Number of Comparisons: " + comparison + "\n");   
        }
        System.out.println("Total Number of Comparisons: " + total + "\n"); 
        System.out.println("Theodore Kyle Choa   |   2ITB"); 
    }
}