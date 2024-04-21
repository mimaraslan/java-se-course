package com.mimaraslan.v1;

import java.util.List;
import java.util.stream.Stream;

public class AppMain {
    public static void main(String[] args) {

        Stream <String> bosKayit = Stream.empty();
        System.out.println(bosKayit);
        System.out.println("-----------------------");

        Stream <String> tekKayit = Stream.of("Ramazan");
        System.out.println(tekKayit);
        System.out.println("-----------------------");

        Stream <String> cokluKayit = Stream.of("Ramazan", "İlyas", "Emre", "Eyüp");
        System.out.println(cokluKayit);
        System.out.println("-----------------------");


        //List<String> ogrenciListesi = new ArrayList<>();
        List<String> ogrenciListesi = List.of("Ramazan", "İlyas", "Emre", "Eyüp");
        System.out.println("OgrenciListesi: " + ogrenciListesi);
        System.out.println("-----------------------");

        Stream <String> ogrencilerStream = ogrenciListesi.stream();
       // ogrencilerStream.forEach( System.out::println);
        ogrencilerStream.forEach( ogrenci -> System.out.println(ogrenci));

        System.out.println("-----------------------");

        var kelimeDizisi = new String[] {"Barış", "İbrahim", "Hasan", "Dilşat", "Seren", "Emre"};

        for (String kelime : kelimeDizisi) {
            System.out.println(kelime);
        }

    }
}