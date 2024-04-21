package com.mimaraslan.v2;

public class Personel {

    public void ekranaYaz() {
        System.out.println("Ekrana Yaz");
    }

    /*
    public void ekranaYaz(Integer sira, String ad) {
        System.out.println("Sıra: "+ sira
                + "  Ad: " +  ad);
        System.out.println(sira.getClass());
        System.out.println(ad.getClass());
    }

    public void ekranaYaz(Float sira, String ad) {
        System.out.println("Sıra: "+ sira
                + "  Ad: " +  ad);
        System.out.println(sira.getClass());
        System.out.println(ad.getClass());
    }

    public void ekranaYaz(Double sira, String ad) {
        System.out.println("Sıra: "+ sira
                + "  Ad: " +  ad);
        System.out.println(sira.getClass());
        System.out.println(ad.getClass());
    }

     public void ekranaYaz(Long sira, String ad) {
        System.out.println("Sıra: "+ sira
                + "  Ad: " +  ad);
        System.out.println(sira.getClass());
        System.out.println(ad.getClass());
    }



    public void ekranaYaz(Integer sira, String ad, String soyadi) {
        System.out.println("Sıra: "+ sira
                + "  Ad: " +  ad
                + "  Soyadi: " + soyadi);
        System.out.println(sira.getClass());
        System.out.println(ad.getClass());
        System.out.println(soyadi.getClass());
    }
    */


    public <GelenTip1, GelenTip2> void ekranaYaz(GelenTip1 sira, GelenTip2 ad) {
        System.out.println("Sıra: "+ sira + "  Ad: " +  ad);
        System.out.println(sira.getClass());
        System.out.println(ad.getClass());
    }

    public  <GelenTip1, GelenTip2, GelenTip3> void ekranaYaz(GelenTip1 sira, GelenTip2 ad, GelenTip3 soyadi) {
        System.out.println("Sıra: "+ sira + "  Ad: " +  ad + "  Soyadi: " + soyadi);
        System.out.println(sira.getClass());
        System.out.println(ad.getClass());
        System.out.println(soyadi.getClass());
    }

}
