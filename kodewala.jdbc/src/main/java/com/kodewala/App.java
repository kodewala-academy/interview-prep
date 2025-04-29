package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kodewala.resources.SpringConfigFile;

public class App
{
	public static void main(String[] args)
	{

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		String sql = "INSERT INTO EMPLOYEE(id, name, email, address) values(?,?,?,?)";

		int count = jdbcTemplate.update(sql, 2, "kodewala1", "info1@kw.com", "bangalore111");

		System.out.println(" record inserted ------->" + count);
	}
}
