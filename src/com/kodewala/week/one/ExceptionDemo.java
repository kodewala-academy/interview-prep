package com.kodewala.week.one;

class UserAlreadyExistsException extends RuntimeException // Un-Checked exception

{
	public UserAlreadyExistsException(String msg)
	{
		super(msg);
	}
}

public class ExceptionDemo
{

}
