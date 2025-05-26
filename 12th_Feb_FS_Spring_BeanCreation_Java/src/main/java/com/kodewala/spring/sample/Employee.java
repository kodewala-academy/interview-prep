package com.kodewala.spring.sample;

public class Employee
{
	private String employeName;
	private int employeSal;

	public String getEmployeName()
	{
		return employeName;
	}

	public void setEmployeName(String employeName)
	{
		this.employeName = employeName;
	}

	public int getEmployeSal()
	{
		return employeSal;
	}

	public void setEmployeSal(int employeSal)
	{
		this.employeSal = employeSal;
	}

	public void displayEmployeeDetails()
	{
		System.out.println(" name " + employeName + " and sal " + employeSal);
	}

}
