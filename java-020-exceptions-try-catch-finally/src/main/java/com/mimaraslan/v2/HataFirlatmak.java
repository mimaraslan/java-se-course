package com.mimaraslan.v2;

public class HataFirlatmak {

    public static void main(String[] args) {

        try {
            int sonuc = urunlerinSayisiniAlUnchecked(250);
            //   int sonuc = urunlerinSayisiniAlChecked(250);
            System.out.println("Ürün Sayısı: " + sonuc);
        } catch (Exception e) {
            System.out.println("Hata: " + e);
           // throw new RuntimeException();   // Buna koda gerek yok!
        } finally {
            System.out.println("Teşekkürler.");
        }

    }

    // Unchecked
    private static int urunlerinSayisiniAlUnchecked(int siloNo) {

        int urutilenUrunSayisi = 123;

        if ( siloNo < 1  ||  siloNo > 25   ) {
            throw new ArithmeticException("Silo sayısını lütfen doğru giriniz!");
        } else {
            return urutilenUrunSayisi;
        }
    }

    // Checked
    private static int urunlerinSayisiniAlChecked(int siloNo) throws Exception {

        int urutilenUrunSayisi = 123;

        if ( siloNo < 1  ||  siloNo > 25   ) {
            throw new ArithmeticException("Silo sayısını lütfen doğru giriniz!");
        } else {
            return urutilenUrunSayisi;
        }
    }

}
