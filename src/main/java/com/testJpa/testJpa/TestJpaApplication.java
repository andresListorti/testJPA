package com.testJpa.testJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.testJpa.testJpa.model.Persona;
import com.testJpa.testJpa.services.PersonaService;


@SpringBootApplication
public class TestJpaApplication implements CommandLineRunner {

	@Autowired
	PersonaService personaService;

	public static void main(String[] args) {
		SpringApplication.run(TestJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Spring!!!");
		System.out.println("Hola Andyng!!!");
		System.out.println("*********************");
		System.out.println("Usando JPA");

		for (Persona p : personaService.getAllPersonas()) {
			
			System.out.println(p);
			
		}





	}

}
