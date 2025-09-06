package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringApp2Application {

	public static void main(String[] args) {
		System.out.println(" Started....");
		SpringApplication.run(MyFirstSpringApp2Application.class, args);
		System.out.println(" Finished...");
	}

}
