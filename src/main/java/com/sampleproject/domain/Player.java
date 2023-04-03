package com.sampleproject.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name = "player")
public class Player extends Auditable{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "role")
    private String role;
    @Column(name = "amount")
    private double amount;
    @Column(name = "country")
    private String country;
    @Column(name = "team_label")
    private String teamLabel;

}








