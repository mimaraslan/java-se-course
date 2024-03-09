package com.mimaraslan;

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

    /*
    public Personel() {
    }

    public Personel(String adi, String soyadi, String telefonNo, String departmani, int sicilNo) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.telefonNo = telefonNo;
        this.departmani = departmani;
        this.sicilNo = sicilNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personel personel = (Personel) o;
        return sicilNo == personel.sicilNo && Objects.equals(adi, personel.adi) && Objects.equals(soyadi, personel.soyadi) && Objects.equals(telefonNo, personel.telefonNo) && Objects.equals(departmani, personel.departmani);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adi, soyadi, telefonNo, departmani, sicilNo);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Personel.class.getSimpleName() + "[", "]")
                .add("adi='" + adi + "'")
                .add("soyadi='" + soyadi + "'")
                .add("telefonNo='" + telefonNo + "'")
                .add("departmani='" + departmani + "'")
                .add("sicilNo=" + sicilNo)
                .toString();
    }
*/
}
