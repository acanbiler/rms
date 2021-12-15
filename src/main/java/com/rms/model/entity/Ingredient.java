package com.rms.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ingredient", schema = "public")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private Integer count;
}
