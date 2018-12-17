package com.example.lifeapp;

import com.example.lifeapp.models.Personality;
import com.example.lifeapp.repositories.PersonalityRep;
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
	public CommandLineRunner dataLoader(PersonalityRep repo) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				repo.save(new Personality("ISTP")); //1
				repo.save(new Personality("INTP")); //2
				repo.save(new Personality("INTJ")); //3
				repo.save(new Personality("ISTJ")); //4
				repo.save(new Personality("ESTJ")); //5
				repo.save(new Personality("ENTJ")); //6
				repo.save(new Personality("ENFJ")); //7
				repo.save(new Personality("ESFJ")); //8
				repo.save(new Personality("ISFJ")); //9
				repo.save(new Personality("INFJ")); //10
				repo.save(new Personality("ISFP")); //11
				repo.save(new Personality("INFP")); //12
				repo.save(new Personality("ENTP")); //13
				repo.save(new Personality("ESTP")); //14
				repo.save(new Personality("ESFP")); //15
				repo.save(new Personality("ENFP")); //16
			}
		};
	}

}



