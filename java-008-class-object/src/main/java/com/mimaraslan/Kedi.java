package com.mimaraslan;

// sinif bir kaliptir
public class Kedi {  // scope  kapsam

    // declaration - deklere - bildiri bildirmek
   int yas = 0;
   String rengi = "Belirtilmedi";

   // Constructor - yapıcı - hazırlayıcı - ilk hazirlik bir kere
    public Kedi(int yas, String rengi) {
        this.yas = yas;
        this.rengi = rengi;
    }

    // Setter
    // calisama aninda degistirme imkani saglar
    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }


    public int getYas() {
        return yas;
    }

    public String getRengi() {
        return rengi;
    }

    public static void main(String[] args) {

        Kedi kedi1 = new Kedi(5, "Siyah");
        Kedi kedi2 = new Kedi(10, "Sari");
        Kedi kedi3 = new Kedi(15, "Beyaz");

        System.out.println("Kedi1 özellikleri --> Yaş: " + kedi1.yas + "   Rengi: " + kedi1.rengi);
        System.out.println("Kedi2 özellikleri --> Yaş: " + kedi2.yas + "   Rengi: " + kedi2.rengi);
        System.out.println("Kedi3 özellikleri --> Yaş: " + kedi3.yas + "   Rengi: " + kedi3.rengi);

        Kedi kedi4 = new Kedi(17, "");
        kedi4.setRengi("Alacali");
        System.out.println("Kedi4 özellikleri --> Yaş: " + kedi4.yas + "   Rengi: " + kedi4.rengi);

        kedi1.setYas(6);
        kedi1.setRengi("Gri");
        System.out.println("set Kedi1 özellikleri --> Yaş: " + kedi1.yas + "   Rengi: " + kedi1.rengi);


        System.out.println("get Kedi2 özellikleri --> Yaş: " + kedi2.getYas() + "   Rengi: " + kedi2.getRengi());
        System.out.println("get Kedi3 özellikleri --> Yaş: " + kedi3.getYas() + "   Rengi: " + kedi3.getRengi());


    }
}



