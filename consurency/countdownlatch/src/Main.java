import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        CountDownLatch countDownLatch=new CountDownLatch(3);
        for(int i=0;i<3;i++){
            new Thread(()->{
                System.out.println(" :"+" thread is exicuted" +Thread.currentThread().threadId()+"count down"+countDownLatch.getCount());
                countDownLatch.countDown();
            }).start();


        }

        try {
            countDownLatch.await();
            System.out.println("count doun is"+countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}