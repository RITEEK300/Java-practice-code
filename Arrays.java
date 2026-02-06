import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter rows:");
        int row = sc.nextInt();

        System.out.println("Enter columns:");
        int colom = sc.nextInt();

        float[][] arr = new float[row][colom];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextFloat();
            }
        }
        

        System.out.println("Array elements:");
        for (float[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }
}
