package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.main.beans.Employee;
import com.kodewala.main.config.SpringConfig;

public class App
{
	public static void main(String[] args)
	{

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Employee employee = (Employee) context.getBean("createEmp");

		System.out.println(employee);

	}
}
