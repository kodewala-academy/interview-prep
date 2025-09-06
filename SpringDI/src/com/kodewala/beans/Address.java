package com.kodewala.beans;

public class Address
{
	private String line1;
	private String line2;
	private String city;

	public Address(String _line1, String _line2, String _city)
	{
		this.line1 = _line1;
		this.line2 = _line2;
		this.city = _city;
	}

	public void showAddr()
	{
		System.out.println(" Line1 " + line1);
		System.out.println(" Line2 " + line2);
		System.out.println(" City " + city);
	}
}
