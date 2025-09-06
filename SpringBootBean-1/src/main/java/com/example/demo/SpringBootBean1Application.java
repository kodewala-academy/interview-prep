package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBean1Application
{

	public static void main(String[] args)
	{
		
		
		ApplicationContext context = SpringApplication.run(SpringBootBean1Application.class, args);
		
		Account acc =context.getBean(Account.class);
		acc.showInfo(" Test  ");
	}
	
 

}
