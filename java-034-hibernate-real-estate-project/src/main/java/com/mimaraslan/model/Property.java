package com.mimaraslan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

}
