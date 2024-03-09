package com.mimaraslan.tasit;

import com.mimaraslan.kural.Kanun;
import com.mimaraslan.kural.UlastirmaDairesi;
import com.mimaraslan.base.Arac;
import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
public class Taksi extends Arac implements Kanun, UlastirmaDairesi {
    @Override
    public int hizSiniri() {
        return 120;
    }

    @Override
    public String bakimDurumu() {
        return "Haziran";
    }

    @Override
    public int tasitVergi() {
        return 1_000;
    }


    @Override
    public Boolean ruhsatDurumu(Boolean durum) {
        return durum;
    }

    @Override
    public Boolean ehliyetDurumu(Boolean durum) {
        return durum;
    }
}
