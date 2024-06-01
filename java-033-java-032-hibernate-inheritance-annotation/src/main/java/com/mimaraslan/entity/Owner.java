package com.mimaraslan.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor

@Entity
@Table(name="OWNER")
@AttributeOverrides({
        @AttributeOverride(name="firstname", column=@Column(name="FIRSTNAME")),
        @AttributeOverride(name="lastname", column=@Column(name="LASTNAME"))
})
public class Owner extends Person {

    @Column(name="stocks")
    private Long stocks;

    @Column(name="partnership_stake")
    private Long partnershipStake;

    public Owner() {
    }

    public Owner(String firstname, String lastname, Long stocks, Long partnershipStake) {

        super(firstname, lastname);

        this.stocks = stocks;
        this.partnershipStake = partnershipStake;
    }
}
