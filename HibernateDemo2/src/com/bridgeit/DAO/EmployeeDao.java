package com.bridgeit.DAO;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.bridgeit.DTO.EmployeeDto;

public class EmployeeDao 
{
	
	public void save(EmployeeDto obj)
	{
//		Configuration config=new Configuration();
//		config.configure("hibernate.cfg.xml");
		Session session=new AnnotationConfiguration()  
		      .configure().buildSessionFactory().openSession();  
		      
	    Transaction transaction=session.beginTransaction();  

			
		
		 session.update(obj);
		 
		 transaction.commit();
		 session.close();
		
	}
	
}
