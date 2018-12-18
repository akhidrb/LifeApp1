package com.example.lifeapp.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PersonalityType")
public class PersonalityType {

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public PersonalityType() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
