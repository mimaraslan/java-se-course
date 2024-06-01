package com.mimaraslan.entity;

import lombok.*;
import java.util.Date;
import jakarta.persistence.*;


@Setter
@Getter
@ToString
@AllArgsConstructor

@Entity
@Table(name="EMPLOYEE")
@AttributeOverrides({
        @AttributeOverride(name="firstname", column=@Column(name="FIRSTNAME")),
        @AttributeOverride(name="lastname", column=@Column(name="LASTNAME"))
})
public class Employee extends Person {

    @Column(name="joining_date")
    private Date joiningDate;

    @Column(name="department_name")
    private String departmentName;

    public Employee() {
    }

    public Employee(String firstname, String lastname, String departmentName, Date joiningDate) {

        super(firstname, lastname);

        this.departmentName = departmentName;
        this.joiningDate = joiningDate;
    }


}
