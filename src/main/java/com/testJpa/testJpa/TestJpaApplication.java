package com.testJpa.testJpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Spring!!!");
		System.out.println("Hola Andyng!!!");
	}

}
