class Encapsulation {
    private int age; 
 public void setValue(int age){
    if(age>18){
    this.age=age;
    }
    
    }
    public int getValue(){
        return age;
    }
}

class Encapsulation2 extends Encapsulation{
}
public class ENC {
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        obj.setValue(20);
        System.out.println("you are eligible for vote :"+obj.getValue());
        
    }
}
