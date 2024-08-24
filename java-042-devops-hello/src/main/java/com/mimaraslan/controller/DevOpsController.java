package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//  http://localhost:8080/

@RestController
@RequestMapping
public class DevOpsController {


    //  http://localhost:8080

    @GetMapping
    public String devopsHello(){
        return "DevOps Hello";
    }


    //  http://localhost:8080/info

    @GetMapping("/info")
    public String devopsInfo(){
        return "DevOps Info";
    }


}

