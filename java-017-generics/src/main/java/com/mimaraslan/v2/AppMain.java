package com.mimaraslan.v2;

import java.util.ArrayList;
import java.util.LinkedList;

public class AppMain {

    public static void main(String[] args) {

        Personel obj = new Personel();
        obj.ekranaYaz();
        System.out.println("-------------------------");

        obj.ekranaYaz(10, "Seren");
        System.out.println("-------------------------");
        obj.ekranaYaz(10.1f, "Seren");
        System.out.println("-------------------------");
        obj.ekranaYaz(10L, "Seren");
        System.out.println("-------------------------");
        obj.ekranaYaz(10.3, "Seren");
        System.out.println("-------------------------");

        obj.ekranaYaz(10, "Seren", "Aşkın");
        System.out.println("-------------------------");
        obj.ekranaYaz(10.1f, "Seren", "Aşkın");
        System.out.println("-------------------------");
        obj.ekranaYaz(10L, "Seren", "Aşkın");
        System.out.println("-------------------------");
        obj.ekranaYaz(10.3, "Seren", "Aşkın");
        System.out.println("-------------------------");


        LinkedList <Integer> ogrenciNoList = new LinkedList();
        ogrenciNoList.add(10);
        ogrenciNoList.add(20);
        ogrenciNoList.add(30);

        ArrayList <String> ogrenciAdList = new ArrayList();
        ogrenciAdList.add("Seren");
        ogrenciAdList.add("Aşkın");
        ogrenciAdList.add("Antalya");

        obj.ekranaYaz(ogrenciNoList, ogrenciAdList);





    }
}
