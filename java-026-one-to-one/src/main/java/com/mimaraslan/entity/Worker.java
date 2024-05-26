package com.mimaraslan.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table (name = "WORKERS")
public class Worker {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "F_NAME")
    private String firstName;

    @NotNull
    @Column (name = "L_NAME")
    private String lastName;

    @Size(min = 18, max = 99)
    @Column (name = "AGE")
    private int age;

    @Email
    @Column(unique = true, name = "EMAIL", nullable = false)
    private String email;


    @Column(name = "PHONE")
    private String phone;

    @FutureOrPresent
    @Temporal(TemporalType.DATE)
    @Column (name = "DATE_CREATE")
    private Date createDate;


    @Embedded
    private Address address;




}
