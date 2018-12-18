package com.example.lifeapp.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Occupation {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;

    public Occupation() {
    }

    public Occupation(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }



}
