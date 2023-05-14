package threads;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    private static CountDownLatch cdl = new CountDownLatch(5);
    private static Random rand = new Random();

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " подошёл к точке вызова.");
                    cdl.await();
                    System.out.println(Thread.currentThread().getName() + " проснулся.");
                    Thread.sleep(rand.nextInt(13000) + 1000);
                    System.out.println(Thread.currentThread().getName() + " поработал и устал.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        performSomeAction();
    }

    private static void performSomeAction() throws InterruptedException {
        long count = cdl.getCount();

        for (long i = count; i > 0; i--) {
            Thread.sleep(1000);
            System.out.println("Count " + i);
            cdl.countDown();
        }
    }
}

