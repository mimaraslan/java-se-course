package com.mimaraslan._01_miras;

class MyBaseThread extends Thread {

    @Override
    public void run() {
        System.out.println("extends MyBaseThread is running: "
                + Thread.currentThread().getName());
    }

}

public class AppMain  {
    public static void main(String[] args) {

        MyBaseThread myBaseThread = new MyBaseThread();
        System.out.println("extends Main thread started");
        myBaseThread.start();
    }
}