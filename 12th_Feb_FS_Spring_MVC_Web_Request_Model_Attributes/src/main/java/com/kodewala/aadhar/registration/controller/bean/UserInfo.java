package com.kodewala.aadhar.registration.controller.bean;

public class UserInfo
{
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public String getMobile()
	{
		return mobile;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

}
