package com.mimaraslan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    @Column (name = "COUNTRY")
    private String country;
    private String city;
    private String state;

    @Column (name = "ZIP")
    private String zip;

}
