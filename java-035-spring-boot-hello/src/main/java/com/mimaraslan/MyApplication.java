package com.mimaraslan;

import com.mimaraslan.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
        System.out.println("Hello Spring Boot!");


        Student student = new Student();
        student.setId(1L);
        student.setFirstName("James");
        student.setLastName("Smith");
        student.setEmail("jsmith@gmail.com");
        System.out.println(student);

        Student student2 = new Student(2L, "Adem", "Kök", "ademkok12345@gmail.com") ;
        System.out.println(student2);


    }

}
