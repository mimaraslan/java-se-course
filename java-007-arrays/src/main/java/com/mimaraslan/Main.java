package com.mimaraslan;

public class Main {


    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 15;
        int sayi3 = 20;
        int sayi4 = 25;
/*
         int [] sayilar = {10, 15, 20, 35};
         int[] sayilar = {10, 15, 20, 35};
         int sayilar [] = {10, 15, 20, 35};
         int sayilar[] = {10, 15, 20, 35};
*/
        int [] sayilar = {10, 15, 20, 35};
        for (int i = 0; i < sayilar.length ; i++) {
            System.out.print(sayilar[i] + "   ");
        }

        System.out.println("\n-----TEK BOYUTLU---------------");

        short myArray [] = new short[4];
      /*  myArray[0] = 21;
        myArray[1] = 22;
        myArray[2] = 23;
        myArray[3] = 24;
        */

        /*
        short a = 10;
        short b = 20;
        int c = a+b;
        */
        /*
        byte a = 10;
        byte b = 20;
        int c = a+b;
        */
         /*
        short a = 10;
        byte b = 20;
        int c = a+b;
        */

        for (short i = 0; i < myArray.length; i++) {
            myArray[i] = (short) (i+21);
            System.out.println(myArray[i]);
        }


        System.out.println("---COKLU BOYUTLU DIZILER-------");

        System.out.println("----1D---");
/*
         int []     myNumberArr = new int[3];
        for (int i = 0; i < 3; i++) {
            myNumberArr[i] = i;
            System.out.println(myArray[i]);
            //    System.out.println("i: "+ i  );
         }
*/

        System.out.println("----2D---");

        //  int [][]   myNumberArr = new int[3][5];
/*
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i: "+ i    + "      "  + "j:" + j);
            }
        }
*/
        System.out.println("----3D---");

      //  int [][][] myNumberArr = new int[3][4][2];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.println("i: "+ i    + "   "  + "j:" + j + "    "  + "k:" + k);
                }
        }


        }

    }


}