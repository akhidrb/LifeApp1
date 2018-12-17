package com.example.lifeapp.web;


import com.example.lifeapp.models.Personality;
import com.example.lifeapp.repositories.PersonalityRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/personality")
public class PersonalityController {

    private final PersonalityRep personalityRep;

    @Autowired
    public PersonalityController(PersonalityRep personalityRep) {
        this.personalityRep = personalityRep;
    }

    @GetMapping
    public String showPersonalities(Model model) {
        List<Personality> personalitiesList = new ArrayList<>();
        personalityRep.findAll().forEach(musclegroup -> personalitiesList.add(musclegroup));
        model.addAttribute("personalities", personalitiesList.stream().collect(Collectors.toList()));
        return "personality";
    }


}
