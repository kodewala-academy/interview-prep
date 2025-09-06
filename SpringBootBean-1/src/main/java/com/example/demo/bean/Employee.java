package com.example.demo.bean;

public class Employee
{
	private String name;
	private int empId;
	private String companyName;

	public Employee(String _name, int _empId, String _companyName)
	{
		this.name = _name;
		this.empId = _empId;
		this.companyName = _companyName;
	}

	public String getName()
	{
		return name;
	}

	public int getEmpId()
	{
		return empId;
	}

	public String getCompanyName()
	{
		return companyName;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}

	public void showInfo()
	{
		System.out.println(" name " + name);
		System.out.println(" companyName " + companyName);
		System.out.println(" empId " + empId);
	}

}
