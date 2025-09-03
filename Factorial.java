public class Factorial {
    public static int factorialR(int n) {
        if (n == 0) return 1; 
        else return n * factorialR(n - 1); 
    }
    public static void main (String[] args) { 
        System.out.println(factorialR(4));  // Recursion - Factorial
        System.out.println(); 

        int prev2 = 0, prev1 = 1; 
        System.out.println(prev2); 
        System.out.println(prev1);
        for (int fibo = 0; fibo < 18; fibo++) {
            int newFibo = prev1 + prev2; 
            System.out.print(newFibo + "  "); 
            prev2 = prev1; 
            prev1 = newFibo; // Recursion - Fibonacci
        } 
    } 
}