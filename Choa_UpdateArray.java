public class Choa_UpdateArray {
    public static void main (String[] args) {
        int[] array = {22, 23, 25, 27, 30}; 

        System.out.print("Original Elements: "); 
        for (int i : array) 
            System.out.print(i + "  "); 
        System.out.println(); 
        
        System.out.print("Updated Elements: "); 
        for (int i : array) {
            if (i == 25) 
                i = 100; 
            System.out.print(i + "  ");
        }
    }
}