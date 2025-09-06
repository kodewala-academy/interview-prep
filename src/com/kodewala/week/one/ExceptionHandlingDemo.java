package com.kodewala.week.one;

public class ExceptionHandlingDemo
{

	public static void main(String[] args)
	{

		int i = 10;

		try
		{
			String s1 = args[0];
			int j = i / 0;

		} catch (ArithmeticException e)
		{
			//
			System.out.println("ExceptionHandlingDemo.main() ArithmeticException ");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		} catch (Exception e)
		{
			System.out.println("ExceptionHandlingDemo.main() Exception");
			e.printStackTrace();
		}
		
		finally {
			System.out.println(" inside finally block");
			// clean up of the resources.
		}
		
		
	}

}
