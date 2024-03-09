package com.mimaraslan;

public class AppMain {
    public static void main(String[] args) {
        Yatirimci yatirimci1 = new Yatirimci();
        Yatirimci yatirimci2 = new Yatirimci("Tuhanhan", "Karakök", "Merkez",
                                            123456789L, "6541656516516516553", 12_000.55F );
        Yatirimci yatirimci3 = new Yatirimci("Barış", "Tatar");

        System.out.println(yatirimci1);
        System.out.println(yatirimci2);
        System.out.println(yatirimci3);

        System.out.println("------------------------------------");

        yatirimci1.setAdi("Uğur");
        yatirimci1.setSoyadi("Semiz");
        yatirimci1.setHesapNo(1111111111L);
        yatirimci1.setSubesi("Şube2");
        yatirimci1.setIbanNo("8946321321321032");
        yatirimci1.setHesapTutari(25_000.44F);

        System.out.println(yatirimci1);
        System.out.println(yatirimci2);

        yatirimci3.setHesapNo(22222222222L);
        yatirimci3.setSubesi("Şube18");
        yatirimci3.setIbanNo("41122555422322");
        yatirimci3.setHesapTutari(99_000.77F);
        System.out.println(yatirimci3);

        System.out.println("------------------------------------");

        System.out.println(yatirimci2.getAdi() + " " +
                           yatirimci2.getSoyadi() + " " +
                           yatirimci2.getHesapTutari());

       yatirimci1.bilgisiniVer();


    }
}
