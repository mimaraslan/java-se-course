package com.mimaraslan;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Mudur extends Personel {

   private Boolean makamAraci;

    public Mudur() {
    }

    public Mudur(String adi, String soyadi, String telefonNo, String departmani,
                 int sicilNo, String tahsilDurumu, short tecrubeYili,
                 Boolean makamAraci) {
        super(adi, soyadi, telefonNo, departmani, sicilNo, tahsilDurumu, tecrubeYili);
        this.makamAraci = makamAraci;
    }

   public void bilgisiniYaz(Mudur mudur){
       System.out.println("Adı: " + mudur.getAdi() );
       System.out.println("Soyadı: " + mudur.getSoyadi() );
       // TODO bu kısma gelecek şeyler var.

       System.out.println("Makam Araç Durumu: " + mudur.getMakamAraci());
    }



}
