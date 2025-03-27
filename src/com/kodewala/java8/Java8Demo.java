package com.kodewala.java8;

class HDFC implements IBank1
{

	@Override
	public void doPayment()
	{
		System.out.println("HDFC.doPayment()");

	}

	@Override
	public void doSettlement()
	{
		System.out.println("HDFC.doSettlement()");

	}

	private void printPDF()
	{
		// 200 lines of code
	}

}

class SBI implements IBank1
{

	@Override
	public void doPayment()
	{
		System.out.println("SBI.doPayment()");

	}

	@Override
	public void doSettlement()
	{
		System.out.println("SBI.doSettlement()");

	}

}

class RuralBank implements IBank1
{

	@Override
	public void printPassBook()
	{
		IBank1.printPDF();
		lo
		System.out.println("RuralBank.printPassBook()");
	}

	@Override
	public void doPayment()
	{
		System.out.println("RuralBank.doPayment()");

	}

	@Override
	public void doSettlement()
	{
		System.out.println("RuralBank.doSettlement()");

	}

}

public class Java8Demo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
