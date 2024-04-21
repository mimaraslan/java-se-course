package com.mimaraslan.v4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiTryCatch {

    public static void main(String[] args) {

        int sayi1 = 0;
        int sayi2 = 0;
        int toplam = 0;
        Float bolme;

        Scanner scanner = new Scanner(System.in);

        boolean hataDurumuFlag = true;

        do {

            try {
                System.out.print("LÜtfen 1. sayiyi giriniz: ");
                sayi1 = scanner.nextInt();

                System.out.print("LÜtfen 2. sayiyi giriniz: ");
                sayi2 = scanner.nextInt();

                toplam = sayi1 + sayi2;
                System.out.println("Toplam: " + toplam);

                // TODO bolmeyi sağlıklı yapınız
                bolme = (float)  sayi1 / (float) sayi2;
                System.out.println("Bölme: " + bolme);

             //   hataDurumuFlag = false;

            } catch (ArithmeticException e){
                System.out.println("Hata Durumu: " + e);
            } catch (InputMismatchException e){
                System.out.println("Hata Durumu: " + e);
             //   hataDurumuFlag = false;
            } catch (RuntimeException e){
                System.out.println("Hata Durumu: " + e);
              //  hataDurumuFlag = false;
            } catch (Exception e){
                System.out.println("Hata Durumu: " + e);
               // hataDurumuFlag = false;
            } finally {
                hataDurumuFlag = false;
                System.out.println("---------------------");
            }



        } while (hataDurumuFlag); // false


    }
}
