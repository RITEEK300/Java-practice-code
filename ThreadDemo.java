import java.nio.channels.Pipe.SourceChannel;

class temp extends Thread {
    public void run() {
        for(int i=1;i<=5;i++){
    System.out.println("riteek");
        }

    }
}
public class ThreadDemo {

    public static void main(String[] args) {
        temp t=new temp();
        t.start();
        
           for(int i=1;i<=5;i++){
    System.out.println("pappu");

        }
        System.out.println();
    }
}