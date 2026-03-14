interface A2{
    void show();
}
interface B2{
    void display();
}
class multiple implements A2,B2{
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
