import java.util.concurrent.Semaphore;

public class Main {
    //synchronizer

    public static void main(String[] args) {

        System.out.println("Hello, World!");
        Semaphore sm=new Semaphore(1);
        Incriment in=new Incriment("A",sm);
        Decriment dec=new Decriment("B",sm);
    }
}

class Shared{
    static  int count=0;
}

class  Incriment{
    String name;
    Semaphore semaphore;
    Incriment(String name,Semaphore emp) {
        this.name = name;
        this.semaphore = emp;
        new Thread(r1).start();

    }

        Runnable r1=()->{

            try {
                System.out.println(name +"is weating for permit");
                semaphore.acquire();
                System.out.println(name +"gets permit");
                for (int i=0;i<5;i++){
                    Shared.count++;
                    System.out.println(name+" count :"+Shared.count);
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name+"relese a permit ");
            semaphore.release();
        };

}

class  Decriment{
    String name;
    Semaphore semaphore;
    Decriment(String name,Semaphore emp) {
        this.name = name;
        this.semaphore = emp;
        new Thread(r2).start();
    }

        Runnable r2=()->{

            try {
                System.out.println(name +"is weating for permit");
                semaphore.acquire();
                System.out.println(name +"gets permit");
                for (int i=0;i<5;i++){
                    Shared.count--;
                    System.out.println(name+" count :"+Shared.count);
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name+"relese a permit ");
            semaphore.release();
        };

}