package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kodewala.main.jdbc.configs.SpringJdbcConfig;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);

		JdbcTemplate template = (JdbcTemplate) context.getBean("createJdbcTemplate");

		String sql = "insert into orders (order_id, item_name, order_status, price) values(?,?,?,?)";

		int count = template.update(sql, "12345", "Apple Product - 18", "In-Progress", "123000");

		if (count > 0)
		{
			System.out.println("  Order created and inserted in Orders table.");
		} else
		{
			System.out.println(" Query has not Created");
		}

	}
}
