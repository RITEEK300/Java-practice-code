public class inharitance {
    int roll ,mark;
    String name;
    void input()
    {
        System.out.println("entr your roll number");

    }
    
}
class ankit extends inharitance

{
    void output()
    {
        roll=1; name="riteek"; mark=89;
        System.out.println(roll+" "+name+" "+mark);
    }
public static void name(String[]args) {
    ankit r=new ankit();
    r.input();
r.output();}
}
        