package com.mimaraslan._01_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {
/*
        Integer myNumber1;
        Integer myNumber2;
        Integer myNumber3;

        Integer [] myNumbers;
*/

        /*
        List <Integer> myList; // Nesne referansi

        myList = new ArrayList<>();

        System.out.println(myList);


        myList = new LinkedList<>();

        System.out.println(myList);
        */

        ArrayList <Integer> myList1 = new ArrayList<>();

        myList1.add(10); // index 0
        myList1.add(8);  // index 1
        myList1.add(20); // index 2
        myList1.add(7);  // index 3
        myList1.add(7);  // index 4
        myList1.add(7);  // index 5
        myList1.add(null);  // index 6

        System.out.println("Liste1 elemanları: "+ myList1);

        System.out.println("-----------------------------");

        ArrayList <String> myList2 = new ArrayList<>();
        myList2.add("Burak"); // index 0
        myList2.add("Emre");  // index 1
        myList2.add("Uğur");  // index 2
        myList2.add("Emre");  // index 3
        myList2.add("Emre");  // index 4
        myList2.add("Emre");  // index 5
        myList2.add("Emre");  // index 6
        myList2.add(null);    // index 7



        System.out.println("Liste2 elemanları: "+myList2);

        System.out.println("-----------------------------");

        System.out.println("Liste1 içinde arama: "+myList1.contains(7));
        System.out.println("Liste2 içinde arama: "+myList2.contains("Öykü"));
        System.out.println("Liste2 içinde arama: "+myList2.contains("Emre"));

        System.out.println("-----------------------------");

        System.out.println("Liste1 ve Liste2 equals eşit mi? : " +
                            myList1.equals(myList2));



        ArrayList <String> myList3 = new ArrayList<>();
        myList3.add("Burak"); // index 0
        myList3.add("Emre");  // index 1
        myList3.add("Uğur");  // index 2
        myList3.add("Emre");  // index 3
        myList3.add("Emre");  // index 4
        myList3.add("Emre");  // index 5
        myList3.add("Emre");  // index 6
        myList3.add(null);    // index 7

        System.out.println("Liste2 ve Liste3 equals eşit mi? : " +
                myList2.equals(myList3));

        System.out.println("Liste2 ve Liste3 == eşit mi? : " +
                (myList2 == myList3) );

        ArrayList <String> myList4 = new ArrayList<>(100);

        System.out.println("Liste1 boyutu eleman sayisi : " + myList1.size() );
        System.out.println("Liste2 boyutu eleman sayisi : " + myList2.size() );
        System.out.println("Liste3 boyutu eleman sayisi : " + myList3.size() );
        System.out.println("Liste4 boyutu eleman sayisi : " + myList4.size() );


        System.out.println("Liste1 dolu mu? : " + !myList1.isEmpty() );
        System.out.println("Liste2 dolu mu? : " + !myList2.isEmpty() );
        System.out.println("Liste3 dolu mu? : " + !myList3.isEmpty() );
        System.out.println("Liste4 dolu mu? : " + !myList4.isEmpty() );


        myList3.add("Abdullah");
        myList3.add("Kaan");
        myList3.add("Öykü");
        myList3.add("Kürşat");

        System.out.println("myList2.size: "+ myList2.size());
        System.out.println("myList3.size: "+ myList3.size());

        System.out.println(myList2);
        System.out.println(myList3);

        myList3.removeAll(myList2);
        System.out.println("Fark: "+ myList3);

        System.out.println("Hash code1: " + myList1.hashCode());
        System.out.println("Hash code2: " + myList2.hashCode());
        System.out.println("Hash code3: " + myList3.hashCode());
        System.out.println("Hash code4: " + myList4.hashCode());

        myList4.add(0,"Barış");
        System.out.println(myList4);
        System.out.println("Hash code4: " + myList4.hashCode());

        myList4.add("Gözde");
        System.out.println(myList4);
        System.out.println("Hash code4: " + myList4.hashCode());

        myList4.add(1,"Dilşat");
        System.out.println(myList4);
        System.out.println("Hash code4: " + myList4.hashCode());

        myList4.add(1,"Mustafa");
        System.out.println(myList4);
        System.out.println("Hash code4: " + myList4.hashCode());


        myList4.remove(1);
        System.out.println(myList4);
        System.out.println("Hash code4: " + myList4.hashCode());

        myList4.clear();
        System.out.println(myList4);
        System.out.println("Hash code4: " + myList4.hashCode());
    }
}
