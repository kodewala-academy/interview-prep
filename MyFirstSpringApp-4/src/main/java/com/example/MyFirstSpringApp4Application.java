package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringApp4Application
{

	public static void main(String[] args)
	{

		System.out.println(" Application Started .....");
		SpringApplication.run(MyFirstSpringApp4Application.class, args);

		System.out.println(" Application Finished ....");
	}

}
