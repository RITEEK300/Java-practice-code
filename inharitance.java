 class Input {

    int roll, mark;
    String name;

    Input() {
        System.out.println("entr your roll number");

    }

}

class ankit extends Input

{
    void output() {
        roll = 1;
        name = "ankit";
        
        mark = 89;
        System.out.println(roll + " " + name + " " + mark);
    }
}
class riteek extends Input

{
    void output() {
        roll = 2;
        name = "riteek";
        mark = 39;
        System.out.println(roll + " " + name + " " + mark);
    }
}
class rohit extends Input

{
    void output() {
        roll = 3;
        name = "rohit";
        mark = 99;
        System.out.println(roll + " " + name + " " + mark);
    }
}

public class inharitance {
    public static void main(String[] args) {
        // rohit r = new rohit();
        // // r.input();
        // r.output();r.riteek();
        Input obj=new Input();
         
    }
}
