package com.kodewala.week.one;

public class Test
{

	public static void main(String[] args)
	{

		String s1 = "Kodewala"; // 1
		String s2 = new String("Kodewala"); // one in scp and one in heap

		s2 = s2.intern();

		System.out.println(s1.equals(s2));
	}

}
