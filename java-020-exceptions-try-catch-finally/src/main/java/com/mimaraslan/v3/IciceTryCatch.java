package com.mimaraslan.v3;

public class IciceTryCatch {

    static int sayi1 = 10;
    static int sayi2 = 0;
    static int toplam = 0;
    static int bolme = 0;


    public static void main(String[] args) {




        try {

            hesapYap();
 /*         try {
                bolme = sayi1 / sayi2;
                System.out.println(bolme);
            } catch (ArithmeticException e) {
                System.out.println("IC Hata: " + e);
            }
*/
            toplam = sayi1 + sayi2;
            System.out.println("DIS Toplama sonucu: "+ toplam);

            bolme = sayi1 / sayi2;
            System.out.println("DIS bolme sonucu: "+ bolme);

        }catch (Exception e) {
            System.out.println("DIS Hata: " + e);
        } finally {

        }



    }

    private static void hesapYap() {
        try {
            bolme = sayi1 / sayi2;
            System.out.println(bolme);
        } catch (ArithmeticException e) {
            System.out.println("IC Hata: " + e);
        }
    }


}
