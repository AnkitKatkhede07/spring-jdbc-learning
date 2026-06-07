package com.spring.jdbc;

import java.sql.PreparedStatement;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertEmployee {

public static void main(String args[]) {
	AnnotationConfigApplicationContext context=
			new AnnotationConfigApplicationContext(DBCongfig.class);
	
JdbcTemplate template=context.getBean(JdbcTemplate.class);

Scanner sc = new Scanner(System.in);
System.out.println("Enter Employee Name : ");
String name=sc.nextLine();

System.out.println("Enter Employee Salary: ");
int salary=sc.nextInt();

int result=template.update("insert into employee(name,salary) values(?,?)",
		(PreparedStatement ps)->{
			ps.setString(1,name);
			ps.setInt(2,salary);
			
		});
if(result>0)
{
	System.out.println("Record Inserted Successfully");
}
else
{
	System.out.println("Record Not Inserted");

}
}
}
