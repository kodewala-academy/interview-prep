package com.kodewala.resources;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.beans.Address;
import com.kodewala.beans.Employee;

@Configuration
public class SpringConfigFile
{
	@Bean
	public Address createAddress1()
	{
		Address address = new Address(123, "BLR1", "BTM1");
		return address;
	}

	@Bean
	public Address createAddress2()
	{
		Address address = new Address(456, "BLR2", "BTM2");
		return address;
	}

	@Bean
	public Employee createEmployee()
	{
		Employee emp = new Employee("Kodewala", "career@kodewala", null);

		return emp;
	}
}
