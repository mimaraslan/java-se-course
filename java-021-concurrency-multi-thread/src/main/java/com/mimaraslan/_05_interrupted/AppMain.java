package com.mimaraslan._05_interrupted;

import java.util.Random;

public class AppMain {

    public static long sayac = 0;

    public static void main(String[] args) {

        Random randomNo = new Random();

        long startTime = System.currentTimeMillis();

        final var mainThread = Thread.currentThread();

        new Thread( ()-> {

            for (int i = 0; i < 100; i++) {
                 sayac++;   // sayac = sayac + 1 ;
             //    System.out.println("Selam: " + i);

                    try {
                        int mySleepTime = randomNo.nextInt(10);
                        Thread.sleep(mySleepTime);
                        System.out.println("Next int value: " + mySleepTime);
                    } catch (InterruptedException e){
                       // throw new RuntimeException();
                        System.out.println("Hata: " + e);
                    }

                System.out.println("Sayac: " + sayac);


                    if (sayac == 25) {
                        mainThread.interrupt();
                        break;
                    }
            }

        }).start();




        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

       // System.out.println("startTime   : " + startTime);
      //  System.out.println("endTime     : " + endTime);
       // System.out.println("Elapsed time: " + elapsedTime);

    }

}
