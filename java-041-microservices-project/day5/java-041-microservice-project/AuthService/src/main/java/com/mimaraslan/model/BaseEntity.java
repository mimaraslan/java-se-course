package com.mimaraslan.model;


import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


@MappedSuperclass // üst sınıf için kullanilmalidir

@SuperBuilder // bir siniftan nesne türetmek için kullanilir
@Data // set ve get metodlarini otomatik tanimlar
@NoArgsConstructor // bos paramtereli hazırlayıcı yapıcı metodu oluşturur.
@AllArgsConstructor // dolu paramtereli hazırlayıcı yapıcı metodu oluşturur.
public class BaseEntity {

    // FIXME CreatedDate
    @CreatedDate
    private Long createAt;

    // FIXME LastModifiedDate
    @LastModifiedDate
    private Long updateAt;

    // FIXME true
    private boolean state;

}
