import java.util.Scanner;
public class August_8_2025 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);


        // Array: Create and Initialize
        // data_type[] array_name = {element, };


        // 1st way of declaring and initiating
        // Accessing each element
        int Age[] = {22, 23, 25, 27, 30, 32};
        System.out.println("First Element: " + Age[0]);
        System.out.println("Second Element: " + Age[1]);
        System.out.println("Third Element: " + Age[2]);
        System.out.println("Fourth Element: " + Age[3]);
        System.out.println("Fifth Element: " + Age[4]);


        // 2nd way
        int[] age = new int[6];
        age[0] = 22;
        age[1] = 23;
        age[2] = 25;
        age[3] = 27;
        age[4] = 30;
        age[5] = 32;
        System.out.println("\nFirst Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4] + "\n");


        // Displaying using loop
        for (int i = 0; i < age.length; i++)
            System.out.print(age[i] + "  ");
        System.out.println();


        // Access and Display Each Elements
        // Basic Operations
        // Displaying, Search ("Found the Element 30 Position: 5"), Insertion (Using input of 5 different values), Delete


        for (int i = 0; i < Age.length; i++) {
            if (Age[i] == 30)
                System.out.println("\nFound the Element 30 Position: " + (i + 1) + "\n");
        }


        int[] array_input = new int[5];
        System.out.print("Old Elements: ");
        for (int i = 0; i < array_input.length; i++)
            System.out.print(array_input[i] + "  ");


        System.out.println();
        for (int i = 0; i < array_input.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            array_input[i] = in.nextInt();
           
        }
        for (int i = 0; i < array_input.length; i++)
            System.out.println("Index [" + i + "]: " + array_input[i]);
       
        in.close();
    }
}