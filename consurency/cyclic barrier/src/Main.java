import javax.xml.namespace.QName;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        CyclicBarrier cb=new CyclicBarrier(3,()->{
            System.out.println("all task finihed");
        });
       new MyThread("A",cb);
       new MyThread("B",cb);
        new MyThread("C",cb);
    }


}

class MyThread{
    CyclicBarrier cb;
    String name;

    MyThread(String name, CyclicBarrier cb){
        this.name= name;
        this.cb=cb;
        new Thread(r1).start();


    }

    Runnable r1=()->{
        try {
            System.out.println(name + " is working on the task...");
            cb.await();
            System.out.println(name+"i am waiting "+Thread.currentThread().threadId());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

    };
}