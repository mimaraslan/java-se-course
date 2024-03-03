package com.mimaraslan;

public class App_If {
    public static void main(String[] args) {

        System.out.println("---IF------");
        int sayi = 3;

        if (5 < sayi) {
            System.out.println("Benim sayım: " + sayi);
        }


        System.out.println("---IF ELSE------");
        int yas = 14;

        if (18 <= yas) {
            System.out.println("SAĞLIYOR, yas durumu: " + yas);
        } else {
            System.out.println("SAĞLAMIYOR, yas: " + yas);
        }


        System.out.println("---IF ELSE-IF  ELSE------");

        int puan = 14;

     //      85 ve 100
        if (puan >84   &&  puan <= 100) {  // SART 1
            System.out.println("5");

        } else if (puan > 69  &&  puan <85  ) {  // SART 2
            System.out.println("4");

        } else if (puan >= 55 && puan < 70) {  // SART 3
            System.out.println("3");

        } else if (puan >= 45 && puan < 55 ) {  // SART 3
            System.out.println("2");

        } else {  // HICBIRI DEGILSE
            System.out.println("1");

        }


    }
}