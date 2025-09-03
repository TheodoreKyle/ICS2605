public class Choa_DeleteArray {
    public static void main (String[] args) {
        int[] array = {22, 23, 25, 27, 30}; 
        int [] update_array = new int[array.length - 1];

        System.out.print("Original Elements: "); 
        for (int i : array) 
            System.out.print(i + "  "); 
        System.out.println();

        System.out.print("Updated Elements: ");  
        for (int i = 0, index = 0; i < array.length; i++) { 
            if (array[i] == 27)
                continue;
            update_array[index] = array[i]; 
            System.out.print(update_array[index] + "  ");
            index++; 
        }
    }
}