package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.beans.Student;

public class App
{

	public static void main(String[] args)
	{
		// Creating Spring container
		// 1. spring bean, spring core , context, logging, expression

		String springConfigFile = "/com/kodewala/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfigFile);

		Student student = (Student) context.getBean("stdObj");
		
		student.displayInfo();
	}

}
