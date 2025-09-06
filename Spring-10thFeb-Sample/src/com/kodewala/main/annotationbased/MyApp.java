package com.kodewala.main.annotationbased;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.beans.annotationbased.Employee;
import com.kodewala.resources.annotationbased.SpringConfigFile;

public class MyApp
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		Employee emp = (Employee) context.getBean("testbean");
		emp.showInfo();
		
		context.close();
	}

}
