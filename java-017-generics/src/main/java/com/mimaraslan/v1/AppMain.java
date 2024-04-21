package com.mimaraslan.v1;

import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args) {

        ArrayList   myArrayList1 = new ArrayList();

        myArrayList1.add("A");
        myArrayList1.add(10);
        myArrayList1.add(true);

        ArrayList <String>   myArrayList2 = new ArrayList();
        myArrayList2.add("B");


        PersonelList           myPersonelList1 = new PersonelList();

        PersonelList <String>  myPersonelList2 = new PersonelList();
        myPersonelList2.listeyeEkle("Emre");
        myPersonelList2.listeyeEkle("Barış");
        myPersonelList2.listeyeEkle("Dilşat");
        System.out.println(myPersonelList2.listeyiGetir());

        PersonelList <Integer> myPersonelList3 = new PersonelList();
        myPersonelList3.listeyeEkle(100);
        myPersonelList3.listeyeEkle(123);
        myPersonelList3.listeyeEkle(987);
        System.out.println(myPersonelList3.listeyiGetir());


        PersonelList <Float> myPersonelList4 = new PersonelList();
        myPersonelList4.listeyeEkle(14.53f);

        PersonelList <Character> myPersonelList5 = new PersonelList();
        myPersonelList5.listeyeEkle('A');


        PersonelList <Personel>  myPersonelList6 = new PersonelList();
        Personel personel1 = new Personel();
        personel1.setYasi(20);
        personel1.setAdi("Eyüp");
        personel1.setSoyadi("Özteriş");
        myPersonelList6.listeyeEkle(personel1);

        myPersonelList6.listeyeEkle(new Personel(25, "Batıkan", "Tizer"));

        // TODO BUNU YAPMAYA CALIS - ODEV toString olmadan yazınız.
        System.out.println(myPersonelList6.listeyiGetir());


    }
}