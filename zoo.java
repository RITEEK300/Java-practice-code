import java.util.Scanner;
public class zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String word= sc.next();
      int countz=0 ,counto=0;
      for(int i=0;i<word.length();i++){
        char s= word.charAt(i);
        if(s=='z'){
            countz++;
        }
        else if(s=='o'){
            counto++;
        }
        else {
            break;
        }
        if(countz==2*counto){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    
      }
      sc.close();
    }
}
