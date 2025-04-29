package com.kodewala.beans.javabased;

public class Employee
{

	private String name;
	private String email;
	private String location;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public void showInfo()
	{
		System.out.println(" Name : " + name);
		System.out.println(" Email : " + email);
		System.out.println(" Location : " + location);
	}
}
