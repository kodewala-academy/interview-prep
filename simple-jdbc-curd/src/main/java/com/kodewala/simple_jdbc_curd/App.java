package com.kodewala.simple_jdbc_curd;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.kodewala.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		NamedParameterJdbcTemplate namedParameterJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);

		String sql = "insert into employee (name, email, address) values(:name,:email,:address)";

		Map<String, String> map = new HashMap<String, String>();

		map.put("name", "Kodewala1");
		map.put("email", "info@Kodewala1");
		map.put("address", " Kodewala1 BTM");

		int count = namedParameterJdbcTemplate.update(sql, map);

		if (count > 0)
		{
			System.out.println(" Query executed!!");
		} else
		{
			System.out.println(" Query has not executed!");
		}

	}
}
