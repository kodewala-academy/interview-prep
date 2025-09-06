package com.kodewala.main.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.main.beans.Address;
import com.kodewala.main.beans.Employee;

@Configuration
public class SpringConfig
{

	@Bean
	public Employee createEmployee()
	{
		Employee employee = new Employee();
		employee.setFirstName("Kodewala");
		employee.setLastName("Academy");
		employee.setEmail("kw@kodewala.com");
		employee.setBand("B3");
		// DI
		employee.setAddress(createAddress());

		return employee;
	}

	@Bean
	public Address createAddress()
	{
		Address address = new Address();
		address.setLine1("23rd main");
		address.setLine2("27th cross");
		address.setCity("BLR");
		address.setPinCode("560078");
		return address;
	}

}
