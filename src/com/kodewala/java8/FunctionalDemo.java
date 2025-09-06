package com.kodewala.java8;

@FunctionalInterface
interface MyInterface
{

	public abstract void doPayment(String name, int amount); // SAM java 8
	
	public default void printPassBook()
	{
		System.out.println("IBank1.printPassBook()");
		
	}

}

class FunctionalDemo
{

	public static void main(String[] args)
	{
		MyInterface obj = (name, amount) -> {

			System.out.println("FunctionalDemo.main()");
			System.out.println(" Name " + name);
			System.out.println(" Amount " + amount);
		};

		obj.doPayment(" Kodewala ", 1234567);

	}

}
