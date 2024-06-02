package com.mimaraslan.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "SELLERS")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "FIRST_NAME")
    private String firstName;

    @Column (name = "LAST_NAME")
    private String lastName;

    @Column (name = "EMAIL")
    private String email;

    @Column (name = "PHONE")
    private String phone;



    //   1      -      m
    // Seller    -   Property
    // One       To   Many
    @OneToMany(mappedBy = "seller",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Property> properties = new HashSet<>();
}
