package com.bridgeit.SpringJdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJdbc implements StudentDao{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplate= new JdbcTemplate(dataSource);
		
	}

	public void create(String name, Integer age) {
		  String SQL = "insert into Student (name, age) values (?, ?)";
		  jdbcTemplate.update(SQL, name ,age);
		  System.out.println("Created Record Name = " + name + " Age = " + age);
	      return;
		
	}

	public Student getStudent(Integer id) {
		 String SQL = "select * from Student where id = ?";
	      Student student = jdbcTemplate.queryForObject(SQL, new Object[]{id}, new StudentMapper());
	      
	      return student;
	}

	public List<Student> listStudents() {
		
		String SQL = "select * from Student";
	      List <Student> students = jdbcTemplate.query(SQL, new StudentMapper());
	      return students;
	}

}
