// class pen {
//     static String name;
//     static String type;
//     int arr[];

//     protected pen(int arr2[]) {
//         arr = arr2;

//         System.out.println(name + " " + type);
//         for (int i = 0; i < arr.length; i++)
//             System.out.println(arr[i]);
//     }
// }
class Test{
    int a ; static String name;
       void show(){
        System.out.println("i am normal method");
    }
    void show(int a){
        System.out.println("i am normal method show "+a);
    }

    {
        System.out.println("hello java i am instance");
    }
    static{
        System.out.println("hello i am static "+name);
    }
    Test(){
        System.out.println("hello i am constructor");
    }
}
class Test2 {
    static int x = 10;
}

public class Class {
    public static void main(String[] args) {
    //     pen.name = "rahul";
    //     pen.type = "Gel pen";

    //     pen obj = new pen(new int[]{1,2,3,4,5});
    Test obj=new Test();
    Test obj2=new Test();
    obj.a=20;
    obj.name="rohit";
    obj.show(9);
    obj2.show(2);
    obj.show();
     Test2 a = new Test2();
        Test2 b = new Test2();

        b.x = 20;

        System.out.println(a.x); // 20
    }
}

    


