package com.kodewala.java8;

public interface IBank1
{
	public abstract void doPayment();

	public abstract void doSettlement();
	
	// RBI - Should be implemented by on rural banks
	public default void printPassBook()
	{
		System.out.println("IBank1.printPassBook()");
		log(null);
	}
	
	// static - reuse the code
	
	public static void printPDF()
	{
		System.out.println("IBank1.printPDF()"); // 200 lines 
		
	}
	
	private void log(String _msg)
	{
		System.out.println("IBank1.doSomethig()");
	}
}
