import java.util.*;
class Student{
    String name;
    long id;
    int marks;

    Student(String name,long id,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
//
//    @Override
//    public String toString() {
//        return "Name: "+name+"\nId: "+id+"\nMarks: "+marks;
//    }
}

public class NewFeatures {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("riteek", 1, 50),
                new Student("pappu", 2, 70),
                new Student("rahul", 3, 70)
        );
//        long count =list.stream().filter(s -> s.marks > 50).count();
//    System.out.println(count);
        students.stream().filter(s->s.marks>30).forEach(System.out::println);
    }
}