package com.kodewala.beans;

public class UserInfo
{
	private String firstName;
	private String mobile;
	private String confirmationNumber;
    
    
	public String getConfirmationNumber()
	{
		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber)
	{
		this.confirmationNumber = confirmationNumber;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getMobile()
	{
		return mobile;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

}
