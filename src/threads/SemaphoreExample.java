package threads;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    private static Semaphore semaphore = new Semaphore(3); // сколько одновременно потоков могут пройти.

    public static void main(String[] args) {

        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            new Thread(() -> {
                try {
                    System.out.println("Thread " + Thread.currentThread().getName() + " ready to start working!");
                    semaphore.acquire();
                    System.out.println("Thread " + Thread.currentThread().getName() + " INSIDE!!!");
                    Thread.sleep(rand.nextInt(3000) + 1000);
                    System.out.println("Thread " + Thread.currentThread().getName() + " Semaphore is free!!!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            }).start();
        }
    }
}
