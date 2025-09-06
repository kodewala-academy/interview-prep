package com.kodewala.week.one;

public class BankSystem
{

	public static void main(String[] args)
	{

		SavingAccounts sb = new SavingAccounts(1000, 5);

		sb.showBalance();

		sb.calculateInterestRate();

	}

}
