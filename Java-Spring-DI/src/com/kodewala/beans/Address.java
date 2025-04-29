package com.kodewala.beans;

public class Address
{
	private int houseNo;
	private String city;
	private String areaCode;

	public Address(int _houseNo, String _city, String _areaCode)
	{
		this.houseNo = _houseNo;
		this.city = _city;
		this.areaCode = _areaCode;
	}

	@Override
	public String toString()
	{
		return " " + houseNo + " " + city + " " + areaCode;
	}

}
