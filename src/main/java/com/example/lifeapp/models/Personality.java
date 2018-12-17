package com.example.lifeapp.models;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Personality {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Personality() {
    }

//    public Personality(Long id, String name) {
//        this.id = id;
//        this.name = name;
//    }


    public Personality(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
