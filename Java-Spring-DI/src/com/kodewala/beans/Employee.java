package com.kodewala.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee
{
	private String name;
	private String email;

	@Autowired
	@Qualifier("createAddress2")
	private Address address;

	public Employee(String _name, String _email, Address _addAddress)
	{
		this.name = _name;
		this.email = _email;
		this.address = _addAddress;
	}

	public void showInfo()
	{
		System.out.println(" name " + name);
		System.out.println(" email " + email);
		System.out.println(" add " + address);
	}

}
