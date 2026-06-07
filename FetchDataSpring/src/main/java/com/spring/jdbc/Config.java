package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {

	@Bean
	public  DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new
				DriverManagerDataSource("jdbc:mysql://localhost:3306/jdbcdata","root","Ankit@07");
		return ds;	
	}
	@Bean
	public  JdbcTemplate getTemplate() {
		return new JdbcTemplate(getDataSource());
	}
}
