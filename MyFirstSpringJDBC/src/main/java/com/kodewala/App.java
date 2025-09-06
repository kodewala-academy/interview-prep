package com.kodewala;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.kodewala.resources.SpringConfig;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		String sql = "insert into employee (name, email, address) values(?,?,?)";

		int count = jdbcTemplate.update(sql, "kodewalaaaaaaaaa", "info@kwaaaaaaaaaaaaaa1.com", "BTM");

		if (count > 0)
		{
			System.out.println(" Query executed!!");
		} else
		{
			System.out.println(" Query has not executed!");
		}
		


	}
}
