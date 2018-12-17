package com.example.lifeapp.repositories;

import com.example.lifeapp.models.Personality;
import org.springframework.data.repository.CrudRepository;

public interface PersonalityRep extends CrudRepository<Personality, Long> {

}
