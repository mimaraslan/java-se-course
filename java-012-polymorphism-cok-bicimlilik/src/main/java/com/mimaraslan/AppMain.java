package com.mimaraslan;

import com.mimaraslan.base.Personel;
import com.mimaraslan.departman.Mudur;
import com.mimaraslan.departman.Muhasebeci;
import com.mimaraslan.departman.Yazilimci;

public class AppMain {
    public static void main(String[] args) {

        Mudur mudur = new Mudur();
        mudur.setAdi("Seren");
        mudur.setSoyadi("Aşkın");
        mudur.setTahsilDurumu("Lisans");
        mudur.setMakamAraci(true);
        mudur.setSicilNo(123_456);

        mudur.bilgisiniYaz(mudur);

        System.out.println("----------------------------");

        Yazilimci yazilimci = new Yazilimci();
        yazilimci.setAdi("Yasemin");
        yazilimci.setSoyadi("Basan");
        yazilimci.setTahsilDurumu("Yüksek Lisans");
        yazilimci.setCalismaDurumu("Uzaktan");
        yazilimci.setSicilNo(777_456);
        yazilimci.setTecrubeYili((short) 5);
        yazilimci.setDepartmani("ARGE");
        yazilimci.setTelefonNo("011231246565");

        System.out.println(yazilimci);

        yazilimci.bilgisiniYaz(yazilimci);
        System.out.println("----------------------------");


        Muhasebeci muhasebeci = new Muhasebeci();
        muhasebeci.setAdi("Mustafa");
        muhasebeci.setSoyadi("Şenyurt");
        muhasebeci.setTahsilDurumu("Lisans");
        muhasebeci.setSicilNo(999_999);
        muhasebeci.setTecrubeYili((short) 12);
        muhasebeci.setDepartmani("Muhasebe");
        muhasebeci.setTelefonNo("666666");
        muhasebeci.setUnvani("Mali Müşavir");
        muhasebeci.setYeminDurumu(Boolean.TRUE);

        System.out.println(muhasebeci);

        muhasebeci.bilgisiniYaz(muhasebeci);
        System.out.println("----------------------------");

        Personel personel = new Personel();
        personel.hesapla((short) 10, 10, 10);
    }
}
