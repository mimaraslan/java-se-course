package com.mimaraslan._03_multi;

class MyBaseThread extends Thread {

    @Override
    public void run() {
        System.out.println("extends MyBaseThread is running: "
                + Thread.currentThread().getName());
    }

}

public class AppMain  {
    public static void main(String[] args) {

        MyBaseThread myBaseThread1 = new MyBaseThread();
        MyBaseThread myBaseThread2 = new MyBaseThread();
        MyBaseThread myBaseThread3 = new MyBaseThread();
        MyBaseThread myBaseThread4 = new MyBaseThread();

        System.out.println("extends Main thread started");
        myBaseThread1.setName("FB");
        myBaseThread2.setName("GS");
        myBaseThread3.setName("BJK");
        myBaseThread4.setName("TS");

        myBaseThread1.setPriority(Thread.MAX_PRIORITY); // 10
        myBaseThread2.setPriority(Thread.MIN_PRIORITY);
        myBaseThread3.setPriority(Thread.NORM_PRIORITY);
        myBaseThread4.setPriority(Thread.NORM_PRIORITY);

        myBaseThread1.start();
        myBaseThread2.start();
        myBaseThread3.start();
        myBaseThread4.start();

    }
}