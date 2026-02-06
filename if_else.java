import java.util.Scanner;

public class if_else {
    public static void main(String[]args){
int psw;
        System.out.println("enter your password");
        try (Scanner obj = new Scanner(System.in)) {
            psw=obj.nextInt();
        }
        if(psw==123){
            System.out.println("correct password");
            int balance=5600;
System.out.println("your bank balance"+balance);
        }
        else
        System.out.println("worng password");

    }
}
