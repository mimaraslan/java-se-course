package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:9095/seller

@RestController
@RequestMapping("/seller")
public class SellerController {

    // http://localhost:9095/seller/hello
    @GetMapping("/hello")
    public String hello (){
        return "SellerService Hello";
    }


   // http://localhost:9095/seller/info
    @GetMapping("/info")
    public String info (){
        return "INFO: SellerService";
    }

}
