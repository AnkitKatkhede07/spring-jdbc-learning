package com.jdbc.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable {
	
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(Config.class);
		
		JdbcTemplate tem=context.getBean(JdbcTemplate.class);
		
		String sql="create table employee("+ "id int primary key auto_increment,"
         + "name varchar(50),"
				+"salary int"
         +")";
		tem.execute(sql);
		 System.out.println("Table Created Successfully");
	}

}
