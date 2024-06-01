package com.mimaraslan.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "ORDERS")
public class Order {

    // m - 1
    @ManyToOne (fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", nullable = false)
    private int id;

    @Column (name = "PRODUCT", length = 100)
    private String product;

    @Column (name = "CODE", length = 50)
    private String code;

    // FIXME BigDecimal virgüllü sayı yapılacak.
    @Column (name = "AMOUNT", precision = 6, scale = 2 )   //
    private BigDecimal amount;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_CREATE", length = 40)
    private Date createDate;



}
