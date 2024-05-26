package com.mimaraslan.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "CUSTOMER_DETAILS")
public class CustomerDetail {

    @OneToOne
    @JoinColumn
    private Customer customer;

    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "foreign" ,
        parameters = @org.hibernate.annotations.Parameter(name = "property", value = "customer"))
    @Column(name = "CUSTOMER_ID")
    private int customerId;

    // TODO  @MapsId ile modernleştirilecek.


   private String address;
   private String phoneNumber;
   private String email;

    @Temporal(TemporalType.DATE)
    @Column (name = "DATE_CREATE")
    private Date createDate;





}
