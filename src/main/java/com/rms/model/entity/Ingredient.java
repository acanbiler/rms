package com.rms.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order", schema = "public")
public class Ingredient {
    public Ingredient(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private Integer count;
}
