package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    // http://localhost:8888
    @GetMapping("/")
    public String hello (){
        return "ConfigServerRemote Service Hello";
    }


   // http://localhost:888/info
    @GetMapping("/info")
    public String info (){
        return "INFO: ConfigServerRemote";
    }

}
