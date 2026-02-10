class RuntimePoly{
    void show(){
        System.out.println("i am parent public class show mehthod"); 
    }
//     void show(int a){
//         System.out.println("i am single para methdo"+a);
//     }
//     void show(double d){
//         System.out.println("i ma double method"+d);
//     }
//     void show(String n,String r){
//         System.out.println("i am String mehthod :"+r+n);
//     }
 }
class RuntimePoly2 extends RuntimePoly{
    @Override
    void show(){

        System.out.println("i am child class show method");
         super.show();
    }
}





public class Poly {
    public static void main(String[] args) {
        RuntimePoly obj =new RuntimePoly2();
        obj.show();
        obj.show();
        // obj.show(2.4);
        // obj.show("riteek","doble");
        // obj.show(10);
        // obj.show();

        
    }
}