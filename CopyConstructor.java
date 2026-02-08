class A {
    int age;
    String name;

    A(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(name + " " + age);
    }

    // Copy constructor
    A(A a) {
        this.age = a.age;
        this.name = a.name;
        System.out.println(name + " " + age);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        A obj = new A(10, "riteek");
        A obj2 = new A(obj);
    }
}
