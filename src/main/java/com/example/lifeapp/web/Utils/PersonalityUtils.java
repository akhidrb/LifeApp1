package com.example.lifeapp.web.Utils;

import com.example.lifeapp.models.Occupation;
import com.example.lifeapp.models.PersonalityType;
import com.example.lifeapp.repositories.OccupationRep;
import com.example.lifeapp.repositories.PersonalityTypeRep;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonalityUtils {

    public PersonalityUtils() {}

    public List addPersonalitiesToModel(PersonalityTypeRep personalityTypeRep) {
        List<PersonalityType> personalitiesList = new ArrayList<>();
        personalityTypeRep.findAll()
                .forEach(personalityType -> personalitiesList.add(personalityType));
        return personalitiesList.stream().collect(Collectors.toList());
    }

    public List addOccupationsToModel(OccupationRep occupationRep) {
        List<Occupation> occupationList = new ArrayList<>();
        occupationRep.findAll()
                .forEach(occupation -> occupationList.add(occupation));
        return occupationList.stream().collect(Collectors.toList());
    }



}
