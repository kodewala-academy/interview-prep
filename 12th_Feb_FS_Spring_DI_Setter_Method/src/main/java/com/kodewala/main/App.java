package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.main.beans.Employee;
import com.kodewala.main.resources.SpringConfig;

public class App
{
	public static void main(String[] args)
	{

		// Create IOC container

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		// Get the Employee(bean) object from spring ioc container

		Employee employee = (Employee) context.getBean("createEmployee");

		employee.displayEmpDetails();

	}
}
