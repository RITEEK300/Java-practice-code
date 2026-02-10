 import java.util.*;

public class PracticeArray {
    static void Num(int n){
        System.out.println(n*10);
    }
    static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int arr[]={1,2,3,4,5,6};
        PrintArray(arr);
        int arr2[]=arr;
        PrintArray(arr2);
        arr2[0]=0;
        arr[1]=0;
        PrintArray(arr);
        PrintArray(arr2);
        int n=10;
        Num(n);
        System.out.println(n);

    }
}
