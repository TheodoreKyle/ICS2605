public class Fibonacci {
    public static int F(int n) {
        if (n <= 1) return n;
        else return F(n - 1) + F(n - 2); 
    }
    public static void main (String[] args) {
        System.out.print(F(19));
    }
}