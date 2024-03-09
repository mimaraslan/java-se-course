package com.mimaraslan.tasit;

import com.mimaraslan.kural.HavacilikDernegi;
import com.mimaraslan.kural.Kanun;
import com.mimaraslan.base.Arac;
import lombok.*;


@Setter
@Getter
@ToString (callSuper = true)
public class Ucak extends Arac implements Kanun, HavacilikDernegi {
    @Override
    public int hizSiniri() {
        return 35_000;
    }

    @Override
    public String bakimDurumu() {
        return "Haftalık";
    }

    @Override
    public int tasitVergi() {
        return 18_000;
    }

    @Override
    public Boolean dernekUyeDurumu() {
        return Boolean.TRUE;
    }

    @Override
    public int aidat() {
        return 2_000;
    }

    @Override
    public boolean vizeDurumu() {
        return true;
    }

    @Override
    public int yolcuKapasitesi() {
        return 200;
    }
}
