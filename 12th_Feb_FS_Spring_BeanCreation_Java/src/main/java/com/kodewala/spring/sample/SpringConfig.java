package com.kodewala.spring.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig
{

	@Bean("user")
	public User createUser()
	{
		User user = new User();
		user.setFirstName("Kodewala");
		user.setLastName("Academy");
		user.setEmail("kw@kodewala.com");

		return user;
	}

	@Bean("employeeeee")
	public Employee createEmployee()
	{
		Employee emp = new Employee();
		emp.setEmployeName("Dheeraj");
		emp.setEmployeSal(128000);
		return emp;
	}

}
