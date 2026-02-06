
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[]args){
        
        int a;
        System.out.println("enter array size");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        int arr[]=new int[a];
        System.out.println("entre array elments");
        for(int i=0;i<a;i++){
            arr[i]=obj.nextInt();
           
        }
       Arrays.sort(arr);
        System.out.println("array elments");
        for(int b:arr){
            System.out.println(b+" ");
        }
        obj.close();

}}
