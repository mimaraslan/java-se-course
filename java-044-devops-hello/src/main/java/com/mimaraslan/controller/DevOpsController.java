package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping
public class DevOpsController {

    // http://localhost:8080

    @GetMapping
     public  String   devopsHello(){
        return "DevOps Hello : " + LocalDateTime.now();
    }


    // http://localhost:8080/info

    @GetMapping("/info")
    public  String   devopsInfo(){
        return "INFO: " + LocalDateTime.now();
    }

}
