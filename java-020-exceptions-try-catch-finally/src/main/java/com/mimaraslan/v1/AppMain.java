package com.mimaraslan.v1;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {

        try {
            // code
            int sonuc = 2/0;
            System.out.println(sonuc);
            if (true){

            }
        } catch (Exception e) {
            // code
            // logs
            System.out.println("Hata: " + e);
            System.out.println("Hata: " + e.getMessage());
        }

        System.out.println("-------------------------------");

        try {
            // code
            int sonuc = 2/0;
            System.out.println(sonuc);
            if (true){

            }
        } catch (Exception e) {
            // code
            // logs
            System.out.println("Hata: " + e);
            System.out.println("Hata: " + e.getMessage());
        } finally {
            // scope her zaman calisacak kodlar
            System.out.println("Teşekkür ederiz. : " + new Date());
        }

        System.out.println("-------------------------------");


        try {
         //   int sonuc = 2/0;
            throw new ArithmeticException("ArithmeticException meydana geldi.");
        } catch (Exception e) {
            System.out.println("Hata: " + e);
        } finally {
            System.out.println("Teşekkür ederiz.");
        }

        System.out.println("-------------------------------");


        try {
           sifiraBolmeHatasi();
        } catch (Exception e) {
            System.out.println("Hata: " + e);
        } finally {
            System.out.println("Teşekkür ederiz.");
        }



    }

    private static void sifiraBolmeHatasi() {
          int sonuc = 2/0;
      //  throw new ArithmeticException("ArithmeticException meydana geldi.");
    }
}