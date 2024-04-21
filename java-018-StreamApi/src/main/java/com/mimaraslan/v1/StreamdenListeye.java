package com.mimaraslan.v1;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamdenListeye {

    public static void main(String[] args) {

        Stream <String> myStream = Stream.of("Barış", "Emre", "İbrahim", "Emre", "Hasan", "Dilşat",
                "İlyas", "Çağdaş", "Seren", "Emre", "Şener");
        TreeSet <String> myTreeSet = myStream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(myTreeSet);
        System.out.println("--------------------------------");


        Stream <String> myStream2 = Stream.of("Barış", "Emre", "İbrahim", "Emre", "Hasan", "Dilşat",
                "İlyas", "Çağdaş", "Seren", "Emre", "Şener");
        TreeSet <String> myTreeSet2 = myStream2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(myTreeSet2);
        System.out.println("--------------------------------");


        Stream <String> myStream3 = Stream.of("Barış", "Emre", "İbrahim", "Emre", "Hasan", "Dilşat",
                "İlyas", "Çağdaş", "Seren", "Emre", "Şener");
/*
        myStream3
                .sorted()
                .forEach(System.out::println);
*/


        TreeSet <String> myTreeSet3 = myStream3.collect(Collectors.toCollection(TreeSet::new));

        System.out.println(myTreeSet3);

        // HATA VERIR CUNKU KULLANILDI. Stream tek kullanımlıktır.
       //  TreeSet <String> myTreeSet4 = myStream3.collect(Collectors.toCollection(TreeSet::new));
       //   System.out.println(myTreeSet4);

        System.out.println("--------------------------------");


        Stream <String> myStream4 = Stream.of("Barış", "Emre", "İbrahim", "Emre", "Hasan", "Dilşat",
                "İlyas", "Çağdaş", "Seren", "Emre", "Şener");

        myStream4
                .sorted()
                .distinct()
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        Stream <String> myStream5 = Stream.of("Barış", "Emre", "İbrahim", "Emre", "Hasan", "Dilşat",
                "İlyas", "Çağdaş", "Seren", "Emre", "Şener");

        myStream5
               // .sorted()
               // .distinct()
                .filter(isim -> isim.contains("e"))
                .forEach(System.out::println);

        System.out.println("----myStream6----------------------------");

        Stream <String> myStream6 = Stream.of("Barış", "Emre", "İbrahim", "Emre", "Hasan", "Dilşat",
                "İlyas", "Çağdaş", "Seren", "Emre", "Şener");

     myStream6
                // .sorted()
                // .distinct()
                .filter(isim -> !isim.contains("e") || isim.startsWith("S"))
                .forEach(System.out::println);

        System.out.println("----myStream7----------------------------");

        Stream <String> myStream7 = Stream.of("Barış", "Emre", "İbrahim", "Emre", "Hasan", "Dilşat",
                "İlyas", "Çağdaş", "Seren", "Emre", "Şener");

        HashSet <String> myHashSet = myStream7
                .filter(isim -> !isim.contains("e") || isim.startsWith("S"))
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(myHashSet);

        // TODO myHashSet bunu foreach ile yazdır.

        System.out.println("--------------------------------");


    }

}
