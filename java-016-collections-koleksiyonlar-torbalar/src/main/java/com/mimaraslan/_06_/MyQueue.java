package com.mimaraslan._06_;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MyQueue {

    public static void main(String[] args) {

        Queue <String> myQueue = new ArrayBlockingQueue<> (25);
        myQueue.add("Abdullah");
        myQueue.add("Fevzi");
        myQueue.add("İsmail");
        myQueue.add("Furkan");
        myQueue.add("Gözde");
        myQueue.add("Veysel");
        myQueue.add("Barış");
        myQueue.add("Barış");
        myQueue.add("Abdullah");
        myQueue.add("Barış");
        myQueue.add("Öykü");
        //  myQueue.add(null); // olmaz!!!!

        System.out.println(myQueue);


        System.out.println("------------------");

        Queue <String> myQueue2 = new PriorityQueue<> (25);
        myQueue2.add("Abdullah");
        myQueue2.add("Fevzi");
        myQueue2.add("İsmail");
        myQueue2.add("Furkan");
        myQueue2.add("Gözde");
        myQueue2.add("Veysel");
        myQueue2.add("Barış");
        myQueue2.add("Barış");
        myQueue2.add("Abdullah");
        myQueue2.add("Barış");
        myQueue2.add("Öykü");
       //  myQueue2.add(null); // olmaz!!!!

        System.out.println(myQueue2);

    }
}
