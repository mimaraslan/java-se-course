package com.mimaraslan.execption;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {

    ABC_BULUNAMADI (1003, "Aradığınız ABC sistemede kayıtlı değil", HttpStatus.NOT_FOUND),
    ABC_EKLEME_HATASI (2001, "Ekleme başarısız oldu.", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_PARAMETER (3001, "Geçersiz parametre girişi yaptınız.", HttpStatus.BAD_REQUEST),

    INVALID_TOKEN (5001, "Geçersiz token.", HttpStatus.BAD_REQUEST),

    BAD_REQUEST (6001, "Geçersiz istek yaptınız.", HttpStatus.BAD_REQUEST),

    INTERNAL_SERVER_ERROR (7000, "Geçersiz parametre girişi yaptınız.", HttpStatus.INTERNAL_SERVER_ERROR);

    private int code;
    private String message;
    private HttpStatus httpStatus;

}
