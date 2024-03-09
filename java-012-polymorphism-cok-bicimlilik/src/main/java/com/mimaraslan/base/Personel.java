package com.mimaraslan.base;

import com.mimaraslan.departman.Yazilimci;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
//@EqualsAndHashCode
@ToString
public class Personel {

    private String adi;
    private String soyadi;
    private String telefonNo;
    private String departmani;
    private int sicilNo;
    private String tahsilDurumu;
    private short tecrubeYili;

    public void bilgisiniYaz(Personel personel){
        System.out.println("Adı: " + personel.getAdi() );
        System.out.println("Soyadı: " + personel.getSoyadi() );
        // TODO bu kısma gelecek şeyler var.
        System.out.println("tecrubeYili: " + personel.getTecrubeYili());
    }


    public void hesapla (){
    }

    public void hesapla (int yil){ // int
    }

    public void hesapla (int yil, int ay){   // int int
    }

    public void hesapla (short ay, int yil){   // short int
    }
    public void hesapla ( int yil, short ay){   // int short
    }

    public void hesapla (int yil, int ay, int gun){   // int int int
    }

    public void hesapla ( short ay, int yil, int gun){   // short int int
    }

    public void hesapla ( int yil, int gun, short ay){   // int int short
    }

    public void hesapla ( int yil, short ay, int gun){   // int short int
    }

    public void hesapla ( short ay, int yil, short gun){   // short int short
    }

    public String hesapla ( short ay, short yil, short gun){   // short short short
        return "Selam";
    }



}
