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
@Table(name = "PROPERTIES")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "PROPERTY_NAME")
    private String propertyName;

    @Column (name = "TITLE")
    private String title;

    @Column (name = "DESCRIPTION")
    private String description;

    @Column (name = "TYPE")
    private String type;

    //   m        -     1
    //  Property  -   Agent
    //  Many      To   One
    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;


    //   m        -     1
    //  Property  -   Seller
    //  Many      To   One
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;


    //   m     -      m
    // Property      Buyer
    @ManyToMany
    @JoinTable(name = "Property_Buyer",
       joinColumns = @JoinColumn (name = "property_id"),
            inverseJoinColumns = @JoinColumn (name = "buyer_id")
    )
    private Set<Buyer> buyers = new HashSet<Buyer>();



}
