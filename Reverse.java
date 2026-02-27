import java.util.Scanner;

public class Reverse {
    // int a = 10;
    // int b = 20;

    // public static void main(String[] args) {
    //     Reverse r = new Reverse();
    //     System.out.println(r.a + " " + r.b);
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
     int rev=0;   
        while(n>0){
rev=rev*10+n%10;
n=n/10;
        }
System.out.println(rev);
    }
}
