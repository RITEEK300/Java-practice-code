interface A{
    void show();
}
interface B{
    void display();
}
class multiple implements A,B{
    public void show(){
        System.out.println("i am class A");
    }
    public void display(){
        System.out.println("i am calas B");
    }
}

public class MultipleInharitance {
public static void main(String[] args) {
    multiple obj=new multiple();
    obj.show();obj.display();
}
    
}
