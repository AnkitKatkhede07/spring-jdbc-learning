package com.annoation.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.configure.configure;

@Component("t")
public class TestConnections {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(configure.class);
		 DriverManagerDataSource dataSource=(DriverManagerDataSource)context.getBean("dataSource");
		 if(dataSource!=null) {
			 System.out.println("Database is connected");
		 }
		 else
		 {
			 System.out.println("Database is not connected");
		 }

		
	}

}
