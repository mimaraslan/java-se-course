package com.mimaraslan.v3;

public class AppMain {

    public static void main(String[] args) {

        Personel <Integer, String>    personel1 =
                new Personel <> (100, "Abdullah");

        Personel <Float, String>   personel2 =
                new Personel <> (14.43f, "Fatih");

        Personel <Double, String>   personel3 =
                new Personel <> (14.43, "Fatih");

        Personel <Long, String>   personel4 =
                new Personel <> (1453L, "Fatih");

        Personel <Short, String>   personel5 =
                new Personel <> ((short)32767, "Fatih");

        Personel <Byte, String>   personel6 =
                new Personel <> ((byte)127, "Fatih");


        personel1.yazdir();
        personel2.yazdir();
        personel3.yazdir();
        personel4.yazdir();
        personel5.yazdir();
        personel6.yazdir();

    }
}
