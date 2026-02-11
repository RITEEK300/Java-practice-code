abstract class Abs {
    String name;
    long rollNumber;
    int age;
    long number;   // changed from int to long

    abstract void student();
}

class Rohit extends Abs {
    
    public void student() {
        System.out.println("Student data:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
    }

    public void setValue(String name, long rollNumber, int age, long number) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.number = number;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Rohit r = new Rohit();
        r.setValue("Rohit", 101, 20, 9885763210L);  // L for long
        r.student();
    }
}
