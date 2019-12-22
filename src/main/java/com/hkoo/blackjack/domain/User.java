package com.hkoo.blackjack.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String name;
    private long account;
}
