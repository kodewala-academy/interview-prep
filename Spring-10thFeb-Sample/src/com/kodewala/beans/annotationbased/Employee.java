package com.kodewala.beans.annotationbased;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("testbean")
public class Employee
{

	// postConstruct
	@PostConstruct
	public void init()
	{
		System.out.println("Employee.init()"); // 
	}

	// preDestroy
	@PreDestroy
	public void destroy()
	{
		System.out.println("Employee.destroy()"); // 
	}

	@Value("Kodewala")
	private String name;
	@Value("Bangalore")
	private String location;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
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
		System.out.println(" Location : " + location);
	}
}
