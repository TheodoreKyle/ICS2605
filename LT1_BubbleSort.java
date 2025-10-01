public class LT1_BubbleSort {
    public static void main (String[] args) {
        int total = 0; 
        int[] array = {40, 35, 60, 12, 20, 8, 5}; 
        for (int a = 0; a < array.length - 1; a++) {
            int comparison = 0;  
            for (int b = array.length - 1; b > a; b--) { 
                if (array[b] < array[b - 1]) {
                    int temp = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = temp; 
                    comparison++;
                } 
            }
            total += comparison; 
            System.out.println("Lap " + (a + 1) + ": " + array[0] + "  " + array[1] + "  " + array[2] + "  " + array[3] + "  " + array[4] + "  " + array[5] + "  " + array[6]);
            System.out.println("Number of Comparisons: " + comparison + "\n");
        }
        System.out.println("\nTotal Number of Comparisons: " + total + "\n");
        System.out.println("Theodore Kyle Choa   |   2ITB");  
    }
}