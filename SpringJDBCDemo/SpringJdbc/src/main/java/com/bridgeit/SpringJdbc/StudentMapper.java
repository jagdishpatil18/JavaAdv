package com.bridgeit.SpringJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>   {

	public Student mapRow(ResultSet rs, int row) throws SQLException {
		Student student=new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setAge(rs.getInt(3));
		
		return student;
	}

}
