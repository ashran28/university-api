package com.ranjan.university;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ranjan")
public class UniversityAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityAppApplication.class, args);
	}

}
