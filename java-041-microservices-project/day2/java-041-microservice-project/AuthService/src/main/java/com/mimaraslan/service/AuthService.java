package com.mimaraslan.service;

import com.mimaraslan.model.Auth;
import com.mimaraslan.repository.IAuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor //(onConstructor_ = {@Autowired})
@Service
public class AuthService  {  // extends  ServiceManager<Auth, Long>
 /*
    @Autowired
    private final IAuthRepository repository;
*/

/*
    private final IAuthRepository repository;

    public AuthService(IAuthRepository repository) {
        this.repository = repository;
    }
*/

    private final IAuthRepository repository;

}
