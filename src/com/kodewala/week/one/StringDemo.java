package com.kodewala.week.one;

public class StringDemo
{

	public static void main(String[] args)
	{


		String s2 = "Kodewala";

		

		String s3 = new String("Kodewala");

		s3 = s3.intern();
		
		System.out.println(s3.equals(s2)); // False

	}

}
