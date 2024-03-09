package com.mimaraslan;

import com.mimaraslan.bahce.Ayi;
import com.mimaraslan.base.Hayvan;
import com.mimaraslan.veteriner.Kedi;
import com.mimaraslan.veteriner.Kopek;
import com.mimaraslan.veteriner.Kus;

public class AppMain {

    public static void main(String[] args) {

        Kedi kedi = new Kedi();
        System.out.println("------------------");
        Kopek kopek = new Kopek();
        System.out.println("------------------");
        Kus kus = new Kus();
        System.out.println("------------------");

        kedi.sesVer();
        kopek.sesVer();
        kus.sesVer();

        System.out.println("--------------------");

        if (kedi instanceof Hayvan) {
            System.out.println("Evet: " + kedi);
        }else{
            System.out.println("Hayır: " + kedi);
        }

        System.out.println("--------------------");

        Hayvan hayvan = new Hayvan();
      //  hayvan.sesVer();

        System.out.println("--------------------");

        Ayi ayi = new Ayi();
        ayi.sesVer();


    }
}
