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
}

public class NewFeatures {
    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student("riteek",1,50),
                new Student("pappu",2,70),
                new Student("rahul",3,90)
        );
        list.stream()
                .map(s -> s.id+" "+s.marks+" "+s.name)
                .forEach(System.out::println);
    }
}