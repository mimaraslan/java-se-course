package com.mimaraslan.entity;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor

public class Person {

    private Long personId;
    private String firstname;
    private String lastname;


    public Person() {
    }
}
