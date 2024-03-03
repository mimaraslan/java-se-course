package com.mimaraslan;

public class Method_01 {


   /*
    f (2x + 3)  = y
       2*1 + 3  = 5
          */
   static int  f(int x) {
      return  2*x + 3;
    }



  //  f()     g()     h()


    public static void main(String[] args) {

        /*
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        */

       /*
        for (int i = 0; i < 3; i++) {
            System.out.println("---------------------------------");
        }
        */

        cizgiCiz();

        int y = f(1);
        System.out.println(y);

        cizgiCiz();
    }

    private static void cizgiCiz() {
        System.out.println("---------------------");
    }


}