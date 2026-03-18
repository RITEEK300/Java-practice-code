import java.util.Arrays;
import java.util.List;

class  Student2 {
    String name;
    int id;
    double marks;
    Student2(String name,int id,double marks){
        this.name=name;
        this.id=id;
        this.marks=marks;
    }

    @Override
    public String toString() {
       return name+" "+id+" "+marks;
    }
}
public class PracticeProgram {
    public static void main(String[] args) {
        List<Student2> students= Arrays.asList(
                new Student2("riteek",20,70),
                new Student2("pappu",30,90)

        );
        students.stream().filter(s->s.marks>30).forEach(System.out::println);
    }
}
