package com.kodewala.week.one;

public class ATM
{
	private int balance;
	private String pin;

	public ATM(int _balance, String _pin)
	{
		this.balance = _balance;
		this.pin = _pin;
	}

	public void deposit(int _amountToBeDeposited, String _pin)
	{
		if (_amountToBeDeposited > 0 && _pin.equals("1234"))
		{
			balance = balance + _amountToBeDeposited;
			System.out.println(" balance " + balance);
		} else
		{
			System.out.println(" Invalid amount or invalid PIN");
		}
	}
}
