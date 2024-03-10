package com.mimaraslan.veteriner;

import com.mimaraslan.base.Hayvan;

public class Kus extends Hayvan {

    public Kus() {
        super();
        System.out.println("Kuş");
    }


    @Override
    public void sesVer(){
        System.out.println("Kus: Cik cik");
    }

    public void yemYe(){
        System.out.println("Kuş : Yem ye");
    }
}
