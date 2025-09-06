package com.kodewala.main.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee
{
	@Value("kodewala")
	private String firstName;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void showInfo()
	{
		System.out.println(" first name " + firstName);
	}

}
