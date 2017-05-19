package com.myjar.Tester;

import com.myjar.DAO.StudentDao;
import com.myjar.DTO.Student;

public class StudentTester 
{

	public static void main(String[] args) 
	{
		Student student=new Student();
	//	student.setRollno(1);
		student.setName("pqr");
		
		StudentDao dao=new StudentDao();
		dao.addStudent(student);
		
	}

}
