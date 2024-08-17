package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:9093/buyer

@RestController
@RequestMapping("/buyer")
public class BuyerController {

    // http://localhost:9093/buyer/hello
    @GetMapping("/hello")
    public String hello (){
        return "BuyerService Hello";
    }


   // http://localhost:9093/buyer/info
    @GetMapping("/info")
    public String info (){
        return "INFO: BuyerService";
    }

}
