package com.mimaraslan.model;


import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@MappedSuperclass // üst sınıf için kullanilmalidir

@SuperBuilder // bir siniftan nesne türetmek için kullanilir
@Data // set ve get metodlarini otomatik tanimlar
@NoArgsConstructor // bos paramtereli hazırlayıcı yapıcı metodu oluşturur.
@AllArgsConstructor // dolu paramtereli hazırlayıcı yapıcı metodu oluşturur.
public class BaseEntity {

    private Long createAt;

    private Long updateAt;

    private boolean state;

}
