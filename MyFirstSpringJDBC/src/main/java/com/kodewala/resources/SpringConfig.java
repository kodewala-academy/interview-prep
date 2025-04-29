package com.kodewala.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig
{

	// Datasource
	@Bean
	public DriverManagerDataSource createDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// set the connection param....

		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/kodewala");
		dataSource.setUsername("root");
		dataSource.setPassword("Test@12345");

		return dataSource;
	}

	// JdbcTemplate
	@Bean
	public JdbcTemplate createJdbcTeample()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(createDataSource());
		return jdbcTemplate;
	}

}
