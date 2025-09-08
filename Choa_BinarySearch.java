public class Choa_BinarySearch {
    static int BinarySearch (int x, char[] A) { 
        int i = 0, j = A.length - 1; // i = low, j = high
        while (i <= j) {
            int m = (int) Math.floor((i + j) / 2); // m = mid of array
            for (int a = i; a <= j; a++) System.out.print(A[a] + " ");
            System.out.println();  

            if (A[m] == x) return m; // O(1)
            else if (x > A[m]) i = m + 1; // going to the right of middle element
            else j = m - 1; // going to the left of middle element
        }
        return -1;  
    }
    public static void main(String[] args) {
        char[] A = {'A', 'G', 'H', 'I', 'L', 'M', 'O', 'R', 'T'};  
        char x = 'K';   
        int result = BinarySearch(x, A);
        if (result == -1) System.out.println(x + " is not in the array."); 
        else System.out.println(x + " is found at index: " + result);   
    }
}

/* y = 'K'; 
int resultX = BinarySearch(x, A);
    if (resultX != -1) 
        System.out.println(x + " is found at index: " + resultX);
    else 
        System.out.println(x + " is not in the array."); 

    int resultY = BinarySearch(y, A);
    if (resultY != -1) 
        System.out.println(y + " is found at index: " + resultY); 
    else 
        System.out.println(y + " is not in the array."); */ 