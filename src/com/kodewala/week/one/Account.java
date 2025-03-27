package com.kodewala.week.one;

//Method Area(bytecode)
class Account
{
	// Static variable (Stored in Method Area, shared across all objects)
	static double bankInterestRate = 5.5;

	// Instance variable (Stored in Heap, unique for each object)
	double accountBalance = 10000.0;

	// Method Area(bytecode) and When executed, a Stack Frame is created in Stack Memory
	void displayAccountDetails()
	{
		// Local variable (Stored in Stack, exists only during method execution)
		double transactionAmount = 500.0;

		System.out.println("Bank Interest Rate (Static - Method Area): " + bankInterestRate);
		System.out.println("Account Balance (Instance - Heap Memory): " + accountBalance);
		System.out.println("Transaction Amount (Local - Stack Memory): " + transactionAmount);
	}

	public static void main(String[] args)
	{
		// Creating account objects → instance variables are stored in Heap
		Account firstAccount = new Account();
		Account secondAccount = new Account();

		firstAccount=null;
		
		System.gc(); // Making a req to JVM
		
		firstAccount.displayAccountDetails();
		secondAccount.displayAccountDetails();

		// Updating the static variable (affects all accounts)
		secondAccount.bankInterestRate = 6.0;
		System.out.println("Updated Bank Interest Rate (Shared across all accounts): " + firstAccount.bankInterestRate);
	}
}
