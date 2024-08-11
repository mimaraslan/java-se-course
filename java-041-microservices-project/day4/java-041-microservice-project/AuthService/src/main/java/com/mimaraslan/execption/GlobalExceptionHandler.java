package com.mimaraslan.execption;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

// Tüm controller siniflari için merkezi bir sekilde hata yönetimni saglayan annotasyondur.
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String>  handleRuntimeException(RuntimeException ex) {
        return ResponseEntity.badRequest().body("Beklenmeyen bir hata oluştu: " + ex.getMessage());
    }



    @ExceptionHandler(AuthServiceException.class)
    @ResponseBody
    public ResponseEntity<ErrorMessage> handleAuthException(AuthServiceException ex) {
        ErrorType errorType = ex.getType();
        HttpStatus httpStatus = errorType.getHttpStatus();
        return new ResponseEntity<ErrorMessage>(createErrorMessage(errorType, ex), httpStatus);
    }

    private ErrorMessage createErrorMessage(ErrorType errorType, AuthServiceException ex) {
        return ErrorMessage.builder()
                .code(errorType.getCode())
                .message(errorType.getMessage())
                .build();
    }






}
