package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.beans.Employee;
import com.kodewala.resources.SpringConfigFile;

public class MyApplication
{

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		Employee employee = context.getBean(Employee.class);

		employee.showInfo();

	}

}
