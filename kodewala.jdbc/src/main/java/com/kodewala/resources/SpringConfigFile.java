package com.kodewala.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile
{

	@Bean
	public DriverManagerDataSource myDataSource()
	{
		DriverManagerDataSource myDs = new DriverManagerDataSource();
		myDs.setDriverClassName("com.mysql.cj.jdbc.Driver");
		myDs.setUrl("jdbc:mysql://localhost:3306/kodewala");
		myDs.setUsername("root");
		myDs.setPassword("Test@12345");
		return myDs;
	}

	@Bean
	public JdbcTemplate myJdBCTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(myDataSource());
		return jdbcTemplate;
	}
}
