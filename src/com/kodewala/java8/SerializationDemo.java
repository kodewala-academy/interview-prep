package com.kodewala.java8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	private static final long serialVersionUID = 1l;

	String name;
	int age;
	//
	transient int pin;

	public Employee(String _name, int _age, int _pin)
	{
		this.name = _name;
		this.age = _age;
		this.pin = _pin;
	}
}

public class SerializationDemo
{

	public static void main(String[] args)
	{

		Employee emp = new Employee("Kodewala", 33, 1234);

		// Serialization

		try
		{
			ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("employee.ser"));
			oss.writeObject(emp);
			System.out.println("SerializationDemo.main()");
			oss.close();

			// De-Serialization

			System.out.println("SerializationDemo.main() --> Doing De-Serialization");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
			try
			{
				Employee empDeSer = (Employee) ois.readObject();
				System.out.println(empDeSer.age);
				System.out.println(empDeSer.name);
				System.out.println(empDeSer.pin);
			} catch (ClassNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e)
		{

			e.printStackTrace();
		}

	}

}
