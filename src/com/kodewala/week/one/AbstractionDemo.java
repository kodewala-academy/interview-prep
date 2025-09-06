package com.kodewala.week.one;

abstract class Pay
{
	public abstract void payAndSettle();
}


public class AbstractionDemo extends Pay
{

	@Override
	public void payAndSettle()
	{
		// Step 1 -- Validate the cred
		// Step 2 -- fetch the balance
		// Step 3 -- payment
		// Step 4 -- settlement
		validateCred();
		fetchBal();
		//.....
		
	}
	
	public static void main(String[] args)
	{
		
	}

	private void validateCred()
	{

	}
	private void fetchBal()
	{
		
	}
	
	private void payment()
	{
		
	}
}
