package com.kodewala.main.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee
{
	private String empName;

	@Autowired
	private SalaryInfo salaryInfo;

	public Employee(String empName)
	{
		this.empName = empName;

	}

	@Override
	public String toString()
	{
		return "empName  " + empName + " salaryInfo " + salaryInfo;
	}

}
