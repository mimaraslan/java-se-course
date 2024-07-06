package com.mimaraslan.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND) // 404
public class ResourceNotFoundException_404 extends Exception {

    public ResourceNotFoundException_404(String message) {
        super(message);
    }
}
