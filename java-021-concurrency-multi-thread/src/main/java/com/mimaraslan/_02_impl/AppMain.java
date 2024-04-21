package com.mimaraslan._02_impl;

class MyBaseThread implements Runnable {

    @Override
    public void run() {
        System.out.println("implements MyBaseThread is running: "
                + Thread.currentThread().getName());
    }

}

public class AppMain  {
    public static void main(String[] args) {

        MyBaseThread myBaseThread = new MyBaseThread();
        System.out.println("implements Main thread started");

        Thread thread = new Thread(myBaseThread);
        thread.start();
    }
}