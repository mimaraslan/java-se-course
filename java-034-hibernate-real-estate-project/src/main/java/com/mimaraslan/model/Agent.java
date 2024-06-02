package com.mimaraslan.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table (name = "AGENTS")
public class Agent {

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

    @Column (name = "OFFICE_ADDRESS")
    private String officeAddress;

    //   1      -      m
    // Agent    -   Property
    // One       To   Many
    @OneToMany(mappedBy = "agent",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Property> properties = new HashSet<>();

}
