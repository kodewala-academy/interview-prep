package com.kodewala.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee
{
	private String name;
	private String empId;
	private String email;
	
	@Autowired
	private Address address;

	public Employee(String name, String empId, String email, Address address)
	{
		this.name = name;
		this.empId = empId;
		this.email = email;
		this.address = address;
	}

	public void showInfo()
	{
		System.out.println(" name " + name);
		System.out.println(" empId " + empId);
		System.out.println(" email " + email);
		address.showAddr();
	}

}
