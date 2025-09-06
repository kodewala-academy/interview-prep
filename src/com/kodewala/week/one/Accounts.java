package com.kodewala.week.one;

public class Accounts
{
	double balance;

	public Accounts(double _balance)
	{
		this.balance = _balance;
	}

	public void showBalance()
	{
		System.out.println(" Balance is " + balance);
		return;
	}
}

class SavingAccounts extends Accounts
{
	public void showBalance()
	{
		System.out.println(" Balance is " + balance);
	}

	public void showBalance(String s)
	{
		System.out.println(" Balance is " + balance);
	}

	public void showBalance(int k, int j)
	{
		System.out.println(" Balance is " + balance);
	}

	double interestRate;

	public SavingAccounts(double _balance, double _interestRate)
	{
		super(_balance);
		this.interestRate = _interestRate;

	}

	public void calculateInterestRate()
	{
		double interest = balance * interestRate / 100;
		System.out.println(" Interest earned " + interest);
	}

}