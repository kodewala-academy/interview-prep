package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		String configFile = "/com/kodewala/resources/applicationContext.xml"; // Relative path
		
		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		
		Employee emp = (Employee) context.getBean("myEmpObj");
		
		emp.showInfo();

	}
}
