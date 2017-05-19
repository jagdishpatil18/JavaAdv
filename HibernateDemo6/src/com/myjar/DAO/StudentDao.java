package com.myjar.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.myhibernate.utility.HibernateUtility;
import com.myjar.DTO.Student;

public class StudentDao
{
	SessionFactory factory=HibernateUtility.getSessionFactory();
	public void addStudent(Student stud)
	{
		Session session=factory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		session.save(stud);
		transaction.commit();
		System.out.println("student added");
		//session.close();
	}
}
