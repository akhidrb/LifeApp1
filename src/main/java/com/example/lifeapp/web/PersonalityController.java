package com.example.lifeapp.web;


import com.example.lifeapp.models.Occupation;
import com.example.lifeapp.models.PersonalityType;
import com.example.lifeapp.repositories.OccupationRep;
import com.example.lifeapp.repositories.PersonalityTypeRep;
import com.example.lifeapp.web.Utils.PersonalityUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/personality")
public class PersonalityController implements InitializingBean {

    private final PersonalityTypeRep personalityTypeRep;
    private final OccupationRep occupationRep;

    private PersonalityUtils personalityUtils;

    @Autowired
    public PersonalityController(PersonalityTypeRep personalityTypeRep,
                                 OccupationRep occupationRep) {
        this.personalityTypeRep = personalityTypeRep;
        this.occupationRep = occupationRep;
    }

    @GetMapping
    public String showPersonalities(Model model) {
        model.addAttribute("personalities",
                personalityUtils.addPersonalitiesToModel(personalityTypeRep));
        model.addAttribute("occupations",
                personalityUtils.addOccupationsToModel(occupationRep));
        return "personality";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        personalityUtils = new PersonalityUtils();
    }

}
