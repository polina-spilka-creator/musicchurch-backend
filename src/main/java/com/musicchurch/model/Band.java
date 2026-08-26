package com.musicchurch.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//First entity
@Entity
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Band(String name) {
        this.name = name;
    }

    protected Band() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
