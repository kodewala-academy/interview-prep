package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.beans.Student;
import com.kodewala.resources.SpringConfig;

public class App
{

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Student student = (Student) context.getBean("stRef1");

		student.showInfo();
	}

}
