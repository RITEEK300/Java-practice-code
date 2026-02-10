class Demo {
      
    void demo() {
     int b=30;
        System.out.println("hello i am super class :" + b);
    }
}

class DemoChild extends Demo {
    double a;
    void show() {
        System.out.println("hello i am sub class :" + a);
          super.demo();
       
    }
}

public class Demo2 {
    public static void main(String[] args) {
        DemoChild obj = new DemoChild();
        obj.a = 20.23;
        obj.a = 230.23;
        // obj.b=30;

        obj.show();
    }
}
