package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//   http:localhost:8080/api/v1

@RestController
@RequestMapping("/api/v1")
public class PersonelController {

    //   http:localhost:8080/api/v1/hello
    @GetMapping("/hello")
   public String getDockerHello(){
        return "Hello Docker World";
    }

}
