package com.example.demo.configs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.bean.Employee;

@Configuration
public class AppConfig
{
   
	@Bean
	public CommandLineRunner cmdLineRunner()
	{
		return new CommandLineRunner()
		{

			@Override
			public void run(String... args) throws Exception
			{
				createEmp().showInfo();

			}
		};
	}

	@Bean
	public Employee createEmp()
	{
		return new Employee("Vijay", 12345, "Kodewala");
	}

	@Bean
	public Employee createEmp1()
	{
		return new Employee("Vijay", 12345, "Kodewala");
	}

}
