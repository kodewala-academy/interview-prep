package com.kodewala.SpringJdbcCurd;

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

		String name = "Kodewaka";
		String email = "info@kodewala1.com";
		String address = "BTM Bangalore";
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		 String sql = "INSERT INTO employee (name, email, address) VALUES (?, ?, ?)";

		int count = jdbcTemplate.update(sql, name, email, address);
		System.out.println(count);
		
		
		String sqlNamed = "INSERT INTO employee (name, email, address) VALUES (:name, :email, :address)";
		
		
		Map<String, String> paramMap = new HashMap();
		paramMap.put("name", "test");
		paramMap.put("email", "infoo@kodewala.com");
		paramMap.put("address", "123 Main BTM");
		
		
		NamedParameterJdbcTemplate npJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
		
		int result = npJdbcTemplate.update(sqlNamed, paramMap);
		System.out.println(result);

	}
}
