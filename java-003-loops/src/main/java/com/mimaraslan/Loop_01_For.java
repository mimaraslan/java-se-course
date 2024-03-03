package com.mimaraslan;

public class Loop_01_For {
    public static void main(String[] args) {
/*
        int a = 10;

        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
*/

/*
                int b = 20;

                // BASLANGIC      SINIR            ARTIS_MIKTARI
        for (   int i = 0;        i < 8 ;           i++) {
            System.out.println(b);
        }
*/

        String firstName = "Uğur";
        String lastName = "Semiz";

             // BASLANGIC      SINIR            ARTIS_MIKTARI
        for (   int counter = 1;        counter <= 5 ;           counter++) {
            System.out.println( counter + " - " +  firstName +  ' ' +  lastName);
        }

        System.out.println("-------------------------------");


        for (int i = 0;   i < 3;  i++) {
            System.out.println(i);
        }

/*
        i++

        i = i+1
*/
        System.out.println("-----KADEMLI ARTTIRMA------");

        for (int i = 0;   i < 100;  i=i+4) {  // i += 4
            System.out.println(i);
        }
        System.out.println("------AZALTMA---------");

        for (int i = 50;   0 <= i ;  i--) {
            System.out.println(i);
        }

        System.out.println("------KADEMELI AZALTMA---------");

        for (int i = 50;   0 <= i ;  i= i-8) {  // i -= 8
            System.out.println(i);
        }

    }
}