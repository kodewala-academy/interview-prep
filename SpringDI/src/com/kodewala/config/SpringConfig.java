package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.beans.Address;
import com.kodewala.beans.Employee;

@Configuration
public class SpringConfig
{
	@Bean
	public Address createAddress()
	{
		Address add = new Address(" line 12", "line 11", "Bengaluru");

		return add;
	}

	@Bean
	public Employee createEmp()
	{
		Employee emp = new Employee("Kodewala", "kv12345", "info@kw.com", createAddress());
		return emp;
	}
}
