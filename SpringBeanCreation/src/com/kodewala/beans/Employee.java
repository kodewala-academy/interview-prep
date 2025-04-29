package com.kodewala.beans;

public class Employee
{
	private String name;
	private String email;

	public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void showInfo()
	{
		System.out.println(" Name : " + name);
		System.out.println(" Email : " + email);
	}
}
