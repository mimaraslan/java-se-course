package com.mimaraslan;

import com.mimaraslan.bahce.Ayi;
import com.mimaraslan.base.Hayvan;
import com.mimaraslan.veteriner.Kedi;
import com.mimaraslan.veteriner.Kopek;
import com.mimaraslan.veteriner.Kus;
import com.mimaraslan.veteriner.Van;

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

        System.out.println("====================");


        Hayvan hayvanObj; // Nesne referansı - Nesne demek değildir!!!

        hayvanObj = new Hayvan();
        hayvanObj.hareketeGec();

        hayvanObj = new Kedi();
        ((Kedi) hayvanObj).hareketeGec();
        System.out.println("------------------" + hayvanObj);

        hayvanObj = new Kopek();
        System.out.println("------------------" + hayvanObj);

        hayvanObj = new Kus();
        ((Kus) hayvanObj).yemYe();
        System.out.println("------------------" + hayvanObj);

        hayvanObj = new Hayvan();

        if (hayvanObj instanceof Hayvan)
            System.out.println(hayvanObj);

        System.out.println("--------------------");

        hayvanObj = new Van();
        ((Van) hayvanObj).yemekYe();
        System.out.println("------------------" + hayvanObj);


        Kedi kediObj;
        kediObj = new Van();
        kediObj.sesVer();
        System.out.println("------------------" + kediObj);

        if (kediObj instanceof Object)
            System.out.println(kediObj);

    }
}
