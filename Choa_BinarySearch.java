public class Choa_BinarySearch {
    static int BinarySearch (int x, char[] A) { 
        int i = 0, j = A.length - 1; // i = low, j = high
        while (i <= j) {
            int m = (int) Math.floor((i + j) / 2); // m = mid of array
            if (A[m] == x) return m; 
            else if (x > A[m]) i = m + 1; 
            else j = m - 1; 
        }
        return -1; 
    }
    public static void main(String[] args) {
        char[] A = {'A', 'G', 'H', 'I', 'L', 'M', 'O', 'R', 'T'}; 
        char x = 'H', y = 'K'; 
        if (BinarySearch(x, A) == -1) System.out.println(x + " is not in the array.");
        else System.out.println(x + " is found at index: " + BinarySearch(x, A));
        if (BinarySearch(y, A) == -1) System.out.println(y + " is not in the array.");
        else System.out.println(y + " is found at index: " + BinarySearch(y, A)); 
    }
}