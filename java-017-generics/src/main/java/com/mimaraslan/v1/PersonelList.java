package com.mimaraslan.v1;

import java.util.LinkedList;

public class PersonelList <T>  {

    private T bilgi;
    private Integer detay;


    LinkedList<T> myArrayPersonList = new LinkedList();


    public void listeyeEkle(T veri) {
        myArrayPersonList.add(veri);
    }

    public LinkedList <T> listeyiGetir() {
        return myArrayPersonList;
    }


}
