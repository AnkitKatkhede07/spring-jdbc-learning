package com.spring.jdbc;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SelectEmployee {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(Config.class);
		
		JdbcTemplate template=
				context.getBean(JdbcTemplate.class);
		
		
		RowMapper<Employee>rm=(ResultSet rs, int rowNum)->{
			Employee emp=new Employee();
			
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setSalary(rs.getInt("salary"));
			return emp;
			
		};
		List<Employee> list =
				template.query(
						"select * from employee",
						rm);

		for(Employee e : list)
		{
			System.out.println(
					e.getId()+"\t"+
					e.getName()+"\t"+
					e.getSalary());
		}

		

	}

}
