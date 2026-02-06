import java.util.*;

public class Arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array");
        
//int n = sc.nextInt();
int n =5;
        // Create an array to store the elements (fixed size of 5)
        long[] A = new long[n];

        // Read the elements of the array
        System.out.println("enter array element");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextLong();
        }

        // Calculate the sum of the elements
        long sum = 0;
        for (int i=0;i<n;i++) {
            sum +=A[i];
        }

        // Print the sum
        System.out.println(sum);

        // Close the scanner
        sc.close();
    }
}

