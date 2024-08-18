package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:9094/property

@RestController
@RequestMapping("/property")
public class PropertyController {

    // http://localhost:9094/property/hello
    @GetMapping("/hello")
    public String hello (){
        return "PropertyService Hello";
    }


   // http://localhost:9094/property/info
    @GetMapping("/info")
    public String info (){
        return "INFO: PropertyService";
    }

}
