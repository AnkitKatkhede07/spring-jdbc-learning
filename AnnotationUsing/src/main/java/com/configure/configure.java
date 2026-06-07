package com.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
@ComponentScan("com.annoation.jdbc")
public class configure {
	@Bean(name="dataSource")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource=
				new DriverManagerDataSource("jdbc:mysql://localhost:3306/aug2025","root", "root");
		 return dataSource;
	}
	@Bean(name="template")
	public JdbcTemplate getTemplate() {
		return new JdbcTemplate(this.getDataSource());
	}

}
