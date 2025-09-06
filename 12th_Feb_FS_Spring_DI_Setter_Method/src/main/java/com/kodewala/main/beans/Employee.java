package com.kodewala.main.beans;

public class Employee
{
	private String firstName;
	private String lastName;
	private String email;
	private String band;
	private Address address;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getBand()
	{
		return band;
	}

	public void setBand(String band)
	{
		this.band = band;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public void displayEmpDetails()
	{
		System.out.println(" firstName " + firstName);
		System.out.println(" lastName " + lastName);
		System.out.println(" email " + email);
		System.out.println(" band " + band);

		address.showDisplay();
	}
}
