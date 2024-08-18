package com.mimaraslan.dto.request;

import lombok.*;

@Builder // bir siniftan nesne türetmek için kullanilir
@Data // set ve get metodlarini otomatik tanimlar
@NoArgsConstructor // bos paramtereli hazırlayıcı yapıcı metodu oluşturur.
@AllArgsConstructor // dolu paramtereli hazırlayıcı yapıcı metodu oluşturur.
public class UserProfileSaveRequestDto {

    Long authId;
    String  username;
    String email;
   // String address;
}
