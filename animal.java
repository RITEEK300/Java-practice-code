

abstract class animal {
void legs(){
    System.out.println("all animal have four legs");

}
abstract void eat();

abstract void sound();
}
class dog extends animal{

   public void eat(){
System.out.println("eting meat");
    }
    public void sound(){
System.out.println("bow bow......");

}}
class cow extends animal{
    public void eat(){
        System.out.println("eating grass");
    }
    public void sound(){
System.out.println("hmmm hmmm....");

}}
class test{
public static void main(String[]args){
dog d=new dog();
cow c=new cow();
c.legs(); c.sound(); c.eat();
d.legs(); d.sound(); d.eat();
}
}
