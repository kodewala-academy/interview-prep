package com.kodewala.main.entity;

public class User
{
	private String name;
	private String email;
	private String gender;
	private String city;

	public User()
	{

	}

	public User(String name, String email, String gender, String city)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.city = city;
	}

	public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email;
	}

	public String getGender()
	{
		return gender;
	}

	public String getCity()
	{
		return city;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

}
