package com.kodewala.week.one;

public class StaticDemo
{
	static int users = 0;
	// Static block
	static
	{
		// prerq - init
		System.out.println(" inside block");
	}

	{
		System.out.println(" IIB");
		users = users + 1;
	}

	static int amount = 10;

	public static void main(String[] args)
	{
		StaticDemo.pay(null);
		
		System.out.println(" main ");
		StaticDemo demo = new StaticDemo();
		StaticDemo demo1 = new StaticDemo();
		StaticDemo demo2 = new StaticDemo();
		
		System.out.println(" Active Uses " + users);
	}
	
	public static void pay(String _date)
	{
		// 
	}
	
	private void settle()
	{
		
	}
}
