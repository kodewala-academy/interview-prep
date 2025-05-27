package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.main.bean.Employee;
import com.kodewala.main.config.AppConfig;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp = (Employee) context.getBean(Employee.class);

		emp.showInfo();
	}
}
