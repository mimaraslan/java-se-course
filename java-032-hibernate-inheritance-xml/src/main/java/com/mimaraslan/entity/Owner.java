package com.mimaraslan.entity;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor

public class Owner  {

    private Long stocks;
    private Long partnershipStake;

    // Constructors and Getter/Setter methods,

    public Owner() {
    }
}
