package com.kodewala.week.one;

class Person
{

	Object showRole(String msg) throws Throwable
	{
		System.out.println(" I'm persion with multiple roles");
		return null;
	}
}

class Student extends Person
{
    @Override
	public String showRole(String msg) throws Exception
	{
		System.out.println(" I am student");
		return null;
	}

}

class Employee extends Person
{
	void showRole()
	{
		System.out.println(" I am employee");
	}

}

public class PofyDemo
{
	public void doRegistration(String mobile, int otp)
	{

	}

	public void doRegistration(int otp, String mobile)
	{

	}

	public static void main(String[] args)
	{
		Person person;

		person = new Student();

		person.showRole(); // at the compile time, compiler will check whether the method exists in the
							// person class or not

	}

}
