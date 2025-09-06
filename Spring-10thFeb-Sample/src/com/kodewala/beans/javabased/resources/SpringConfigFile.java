package com.kodewala.beans.javabased.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.beans.javabased.Employee;

@Configuration
public class SpringConfigFile
{

	@Bean("employee")
	public Employee createEmployee()
	{
		Employee employee = new Employee();

		employee.setName("Kodewala Academy");
		employee.setEmail("kodewala@gmail.com");
		employee.setLocation("Bangalore");

		return employee;
	}

	@Bean("employeenew")
	public Employee createEmployeeNew()
	{
		Employee employee = new Employee();

		employee.setName("Kodewala Academy");
		employee.setEmail("kodewala@gmail.com");
		employee.setLocation("Bangalore");

		return employee;
	}

}
