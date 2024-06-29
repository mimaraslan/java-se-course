package com.mimaraslan.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//   http://localhost:8090/api/v1

@RestController
@RequestMapping("/api/v1")
public class StudentController {


    // GET

    //   http://localhost:8090/api/v1/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot - Student Controller ";
    }


    // POST
    // PUT
    // DELETE


}
