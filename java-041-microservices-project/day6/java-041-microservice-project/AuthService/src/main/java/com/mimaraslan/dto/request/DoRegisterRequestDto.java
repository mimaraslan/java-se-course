package com.mimaraslan.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder // bir sinifin kolayca nesne olusturmasini saglar
@Data // set get metodlarını otomatik tanımlar
@NoArgsConstructor // bos parametreli hazirlayici yapici metodu olusturur
@AllArgsConstructor  // dolu parametreli hazirlayici yapici metodu olusturur
public class DoRegisterRequestDto {

    private String username;

    private String email;

    private String password;

    private String rePassword;

}
