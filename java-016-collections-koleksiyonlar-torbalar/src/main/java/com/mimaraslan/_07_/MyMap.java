package com.mimaraslan._07_;

import java.util.*;

public class MyMap {

    public static void main(String[] args) {


        Map <String, String> mapList1 = new HashMap();
                     // Key,  Value
        mapList1.put( "Ankara", "06");
        mapList1.put( "Konya", "42");
        mapList1.put( "İzmir", "35");
        mapList1.put( "Trabzon", "61");
        mapList1.put( null, "01");
        mapList1.put( "Ağrı", null);
        mapList1.put( null, null);


        System.out.println("HashMap: "+ mapList1);

        System.out.println("-----------------------");

        Map <String, String> mapList2 = new LinkedHashMap<>();
                       // Key,  Value
        mapList2.put( "Ankara", "06");
        mapList2.put( "Konya", "42");
        mapList2.put( "İzmir", "35");
        mapList2.put( "Trabzon", "61");
        mapList2.put( null, "01");
        mapList2.put( "Ağrı", null);
        mapList2.put( null, null);


        System.out.println("LinkedHashMap: "+ mapList2);


        System.out.println("-----------------------");

        Map <String, String> mapList3 = new TreeMap<>();
        // Key,  Value
        mapList3.put( "Ankara", "06");
        mapList3.put( "Konya", "42");
        mapList3.put( "İzmir", "35");
        mapList3.put( "Trabzon", "61");
     //   mapList3.put( null, "01");  // Key null olamaz!!!
        mapList3.put( "Ağrı", null);
        mapList3.put( "Ankara", "06");
    //    mapList3.put( null, null); // Key null olamaz!!!
        mapList3.put( "Ankara", "06");


        System.out.println("LinkedHashMap: "+ mapList3);



        System.out.println("-----------------------");

        // FIXME plaka nolarının önündeki sıfır kaybedilmeden
        //  olacak sıralanacak
        Map <String, String> mapList4 = new TreeMap<>();
                    // Key,  Value
        mapList4.put( "06", "Ankara");
        mapList4.put( "42", "Konya");
        mapList4.put( "35", "İzmir");
        mapList4.put( "61","Trabzon");
        //  mapList4.put( null, "Adana");  // Key null olamaz!!!
          mapList4.put( "04", "Ağrı");
        mapList4.put( "06", "Ankara");
        //  mapList4.put( null, null); // Key null olamaz!!!
        mapList4.put(  "06", "Ankara");
        mapList4.remove("35");

        System.out.println("LinkedHashMap: "+ mapList4);

        System.out.println("KEYS--------------------");

        for (String anahtar : mapList4.keySet()){
            System.out.println(anahtar);
        }

        System.out.println("VALUES--------------------");

        for (String deger : mapList4.values()){
            System.out.println(deger);
        }

        System.out.println("KEYS AND VALUES--------------------");

        for (String anahtar : mapList4.keySet()){
            System.out.println(anahtar+ " " + mapList4.get(anahtar));
        }

        System.out.println("-----------------------");

        Map <String, String> mapList5 = new Hashtable<>();
        // Key,  Value
        mapList5.put( "Ankara", "06");
        mapList5.put( "Konya", "42");
        mapList5.put( "İzmir", "35");
        mapList5.put( "Adana", "01");
        mapList5.put( "Çankırı", "18");
        mapList5.put( "Kastamonu", "37");
        mapList5.put( "Trabzon", "61");
       // mapList5.put( null, "01"); // Key null olamaz!!!
       // mapList5.put( "Ağrı", null);// Value null olamaz!!!
       // mapList5.put( null, null); // Key null olamaz!!!



        System.out.println("Hashtable: "+ mapList5);

        // TODO sort yapılacak!
        // A'den Z'ye   Z'den A'ya
        // 0'dan 9'a    9'dan 0'a

    }
}
