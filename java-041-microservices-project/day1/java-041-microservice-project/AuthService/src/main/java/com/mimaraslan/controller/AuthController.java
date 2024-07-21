package com.mimaraslan.controller;

import com.mimaraslan.model.Auth;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AuthController {

/*
    // http://localhost:9090
    @GetMapping("/")
    public String hello (){
        return "AuthService Hello";
    }


   // http://localhost:9090/info
    @GetMapping("/info")
    public String info (){
        return "INFO: AuthService";
    }
    */

    @PostMapping("/register")
    public ResponseEntity<Auth> register () {
        return null; }


    @PostMapping("/login")
    public  Auth   login () {
        return null; }


    @GetMapping("/findAll")
    public List<Auth> findAll () {
        return null; }

    @GetMapping("/getMessage")
    public  String   getMessage () {
        return null; }







}
