package com.kodewala.main.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.beans.javabased.Employee;
import com.kodewala.beans.javabased.resources.SpringConfigFile;

public class MyApp
{

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		Employee employee = (Employee) context.getBean("employee");
		employee.showInfo();
	}

}
