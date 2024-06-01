package com.mimaraslan.entity;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor

public class Employee  {

    private Date joiningDate;
    private String departmentName;

    // Constructors and Getter/Setter methods,

    public Employee() {
    }

}
