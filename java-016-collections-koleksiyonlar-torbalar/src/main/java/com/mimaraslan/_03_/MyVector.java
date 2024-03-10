package com.mimaraslan._03_;

import java.util.Vector;

public class MyVector {

    public static void main(String[] args) {

        Vector vectorList = new Vector<>();

        vectorList.add(10);
        vectorList.add("Barış");
        vectorList.add(null);
        vectorList.add(14.53);
        vectorList.add(1.23f);
        vectorList.add(Boolean.TRUE);

        System.out.println(vectorList);
        System.out.println(vectorList.size());
        System.out.println(vectorList.firstElement());
        System.out.println(vectorList.lastElement());
     //   System.out.println(vectorList.getFirst());
     //   System.out.println(vectorList.getLast());
        System.out.println(vectorList.capacity());
        System.out.println(vectorList.isEmpty());
        System.out.println(vectorList.subList(1,4));

        System.out.println("------------------------------");
        for (int i = 0; i < vectorList.size(); i++) {
            if(vectorList.get(i) != null) {
                System.out.println("index: " + i + "  " + vectorList.get(i).getClass());
            }else {
                System.out.println("index: " + i + "\tbu değer null ");
            }
        }


    }

}
