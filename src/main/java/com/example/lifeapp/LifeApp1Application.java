package com.example.lifeapp;

import com.example.lifeapp.models.Occupation;
import com.example.lifeapp.models.PersonalityType;
import com.example.lifeapp.repositories.OccupationRep;
import com.example.lifeapp.repositories.PersonalityTypeRep;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LifeApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(LifeApp1Application.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(PersonalityTypeRep repo,
                                        OccupationRep occupationRep) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
//                savePersonalities(repo);
                saveOccupations(occupationRep);
			}
		};
	}

    private void saveOccupations(OccupationRep repo) {
	    repo.save(new Occupation("High School Student", "Student"));
	    repo.save(new Occupation("Middle School Student", "Student"));
	    repo.save(new Occupation("College Student", "Student"));
	    repo.save(new Occupation("1-4 Years", "Profession"));
	    repo.save(new Occupation("5-10 Years", "Profession"));
	    repo.save(new Occupation("10-20 Years", "Profession"));
    }

//	private void savePersonalities(PersonalityTypeRep repo) {
//        repo.save(new PersonalityType("ISTP")); //1
//        repo.save(new PersonalityType("INTP")); //2
//        repo.save(new PersonalityType("INTJ")); //3
//        repo.save(new PersonalityType("ISTJ")); //4
//        repo.save(new PersonalityType("ESTJ")); //5
//        repo.save(new PersonalityType("ENTJ")); //6
//        repo.save(new PersonalityType("ENFJ")); //7
//        repo.save(new PersonalityType("ESFJ")); //8
//        repo.save(new PersonalityType("ISFJ")); //9
//        repo.save(new PersonalityType("INFJ")); //10
//        repo.save(new PersonalityType("ISFP")); //11
//        repo.save(new PersonalityType("INFP")); //12
//        repo.save(new PersonalityType("ENTP")); //13
//        repo.save(new PersonalityType("ESTP")); //14
//        repo.save(new PersonalityType("ESFP")); //15
//        repo.save(new PersonalityType("ENFP")); //16
//    }

}



