package com.mimaraslan.execption;


import lombok.Getter;

@Getter
public class AuthServiceException extends RuntimeException {

    private final ErrorType type;


    public AuthServiceException(ErrorType type) {
        this.type = type;
    }

    /*
    public AuthServiceException(ErrorType type, String message) {
        this.type = type;
    }
    */

}
