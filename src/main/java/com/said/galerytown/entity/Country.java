package com.said.galerytown.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_id")
    private int id;

    @Column
    private int code;

    @Column
    private String name;

    @Column(name = "short_name")
    private String shortName;

    @Column
    private String description;
}
