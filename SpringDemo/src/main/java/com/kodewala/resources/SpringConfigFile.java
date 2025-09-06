package com.kodewala.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile
{

	@Bean
	public DriverManagerDataSource myDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/kodewala");
		ds.setUsername("root");
		ds.setPassword("Test@12345");

		return ds;
	}

	@Bean
	public JdbcTemplate myJDBCTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(myDataSource());

		return jdbcTemplate;
	}

	@Bean
	public NamedParameterJdbcTemplate myNpJDBCTemplate()
	{
		return new NamedParameterJdbcTemplate(myDataSource());
	}
}
