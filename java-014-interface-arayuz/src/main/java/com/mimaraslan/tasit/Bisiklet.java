package com.mimaraslan.tasit;

import com.mimaraslan.kural.Kanun;
import com.mimaraslan.base.Arac;
import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
public class Bisiklet extends Arac implements Kanun {


    @Override
    public int hizSiniri() {
        return 30;
    }

    @Override
    public String bakimDurumu() {
        return "Mart";
    }

    @Override
    public int tasitVergi() {
        return 0;
    }
}
