package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.beans.Employee;
import com.kodewala.config.SpringConfig;

public class App
{

	public static void main(String[] args)
	{

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Employee emp = (Employee) context.getBean("createEmp");

		emp.showInfo();

	}

}
