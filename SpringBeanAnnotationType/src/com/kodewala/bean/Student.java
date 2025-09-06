package com.kodewala.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student
{
	@Value("Kodewala")
	private String name;
	@Value("info@Kodewala.com")
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

}
