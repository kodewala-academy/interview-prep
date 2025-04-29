package com.kodewala.main.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.beans.xmlbased.Employee;

public class MyApp
{

	public static void main(String[] args)
	{

		String app_config_loc = "\\com\\kodewala\\resources\\xmlbased\\applicationContext.xml";
		// Here you need to decide the type of container
		ApplicationContext context = new ClassPathXmlApplicationContext(app_config_loc);

		// get the bean using id
		Employee employee = (Employee) context.getBean("emp");
        employee.showDetails();
        
        

	}

}
