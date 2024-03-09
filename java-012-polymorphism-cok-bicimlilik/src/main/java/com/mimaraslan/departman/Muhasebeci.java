package com.mimaraslan.departman;

import com.mimaraslan.base.Personel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Muhasebeci extends Personel {

    private Boolean yeminDurumu;
    private String unvani;

    public void bilgisiniYaz(Muhasebeci muhasebeci){
        System.out.println("Adı: " + muhasebeci.getAdi() );
        System.out.println("Soyadı: " + muhasebeci.getSoyadi() );
        // TODO bu kısma gelecek şeyler var.

        String yemin;
        if(muhasebeci.getYeminDurumu()) { // true
            yemin = "Yeminli";
        }else {
            yemin = "Yeminsiz";
        }

        System.out.println("Yemin Durumu:" + yemin);

        System.out.println("Ünvan: " + muhasebeci.getUnvani());
    }
}
