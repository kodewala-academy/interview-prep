package com.kodewala.beans.xmlbased;

public class Employee
{
	private String employeeName;
	private String email;
	private String address;

	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public void showDetails()
	{
		System.out.println(" Name " + employeeName + " email " + email + " add " + address);
	}

}
