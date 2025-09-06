package com.kodewala.main.jdbc.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringJdbcConfig
{
	// Bean for DataSource
	@Bean
	public DriverManagerDataSource createDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/zepto");
		ds.setUsername("root");
		ds.setPassword("Test@12345");

		return ds;
	}

	// Bean for JDBCTemplate
	@Bean
	public JdbcTemplate createJdbcTemplate()
	{
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(createDataSource());
		return template;
	}

}
