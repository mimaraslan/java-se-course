package com.mimaraslan;

public interface SanayiTeknolojiBakanligiKurallari {

    public void fiseTak();

    public void chipNoAl();

    public default void bakimHizmetiAl() {
        System.out.println("interface: bakimHizmetiAl");
    }
}
