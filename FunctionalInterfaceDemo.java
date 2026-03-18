@FunctionalInterface
interface Operation{
    int sum(int a,int b);
}

public class FunctionalInterfaceDemo {
   public static void main(String[] args) {
        Operation obj= Integer::sum;
        System.out.println(obj.sum(1,2));
    }
}
