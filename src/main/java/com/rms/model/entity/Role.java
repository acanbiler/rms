package com.rms.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "user", schema = "public")
public class Role implements Serializable {
    @Id
    private int id;

    @Column
    private String screen;

}
