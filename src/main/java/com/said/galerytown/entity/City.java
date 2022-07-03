package com.said.galerytown.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
