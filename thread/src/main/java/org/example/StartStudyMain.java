package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class StartStudyMain {
   public static AtomicInteger z = new AtomicInteger(1);
    public static void main(String[] args) throws InterruptedException{

        final StartStudyMain start = new StartStudyMain();

        Thread thread1 = new Thread(() ->
        {
            for (int i = 1; i < 500000; i++) {
                start.z.incrementAndGet();


            }
        }
        );
        thread1.start();
        Thread thread2 = new Thread(() ->
        {
            for (int i = 0; i < 500000; i++) {
                start.z.incrementAndGet();

            }

        }
        );


        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(start.z);





    }
}
