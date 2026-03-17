@FunctionalInterface
interface Operation{
    int sum(int a,int b);
}

public class FunctionalInterfaceDemo {
    static void main() {
        Operation obj=new Operation() {
            @Override
            public int sum(int a,int b) {
                return a+b;
            }
        };
        System.out.println(obj.sum(1,2));
    }
}
