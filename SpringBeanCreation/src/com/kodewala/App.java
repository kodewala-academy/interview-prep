package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.beans.Employee;

public class App
{

	public static void main(String[] args)
	{
		String configPath = "/com/kodewala/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configPath);

		Employee emp = (Employee) context.getBean("myEmpObj");

		emp.showInfo();
	}

}
