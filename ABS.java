 interface InnerABS {
    void show();
    double age=10.5;
    int show3();
}
class output implements InnerABS{
public void show(){
    System.out.println("age is :"+ age);
}
public int show3(){
return (int)age;
}
}
public class ABS {
    public static void main(String[] args) {
            InnerABS obj=new output();
    obj.show();
    System.out.println(obj.show3());
}
    }

