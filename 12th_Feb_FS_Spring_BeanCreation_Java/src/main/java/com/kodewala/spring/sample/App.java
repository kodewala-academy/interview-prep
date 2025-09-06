package com.kodewala.spring.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		System.out.println("Spring Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		User user = (User) context.getBean("user");

		user.showInfo();

		Employee emp = (Employee) context.getBean("employeeeee");
		
		emp.displayEmployeeDetails();

	}
}
