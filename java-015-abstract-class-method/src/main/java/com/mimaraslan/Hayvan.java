package com.mimaraslan;

public abstract class Hayvan extends Canli {

    public           void yemekYe() {
        System.out.println("Hayvan: yemekYe");
    }

    public abstract void sesVer();
    protected abstract void hareketEt();
    protected abstract void bilgisiniGetir();


    protected void suIc() {
        System.out.println("Hayvan: su iç");
    }

}
