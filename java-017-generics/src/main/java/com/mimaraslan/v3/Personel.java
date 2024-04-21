package com.mimaraslan.v3;

public class Personel <  GelenTip1 extends Number,
                          GelenTip2 > {


    private GelenTip1 sira;
    public GelenTip2 ad;


    public Personel(GelenTip1 sira, GelenTip2 ad) {
        this.sira = sira;
        this.ad = ad;
    }

    void yazdir(){
        System.out.println(sira.getClass().getName() + " " + ad.getClass().getName());

    }

}
