package org.jdbc.spring.fetch;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SelectById {

	public static void main(String[] args) {
	 AnnotationConfigApplicationContext context=
			 new AnnotationConfigApplicationContext(configure.class);
	 
	 JdbcTemplate template=context.getBean(JdbcTemplate.class);
	 
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter Employee Id: ");
	 int id=sc.nextInt();
	 List<Employee> list = template.query(

				"select * from employee where id=?",

				(PreparedStatement ps) -> {
					ps.setInt(1, id);
				},

				(ResultSet rs, int rowNum) -> {

					Employee emp = new Employee();

					emp.setId(rs.getInt("id"));
					emp.setName(rs.getString("name"));
					emp.setSalary(rs.getInt("salary"));

					return emp;
				});

		list.forEach(e ->
				System.out.println(
						e.getId() + "\t" +
						e.getName() + "\t" +
						e.getSalary()));
	
	 
	}

}
