package com.kodewala.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.beans.Student;

@Configuration
public class SpringConfig // this will have multiple spring bean definition
{

	@Bean("stRef")
	public Student createStudent()
	{
		Student student = new Student();
		student.setName("Kodewala....");
		student.setEmail("info@kodewala.com....");
		return student;
	}
	
	
	@Bean("stRef1")
	public Student createStudent1()
	{
		Student student = new Student();
		student.setName("Kodewala....1");
		student.setEmail("info@kodewala.com....1");
		return student;
	}
}
