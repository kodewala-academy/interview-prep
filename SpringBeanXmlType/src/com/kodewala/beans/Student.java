package com.kodewala.beans;

public class Student
{

	private String name;
	private String email;
	private String address;

	public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email;
	}

	public String getAddress()
	{
		return address;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public void displayInfo()
	{
		System.out.println(" Name " + name);
		System.out.println(" Email " + email);
		System.out.println(" Address " + address);
	}

}
