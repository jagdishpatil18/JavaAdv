package com.bridgeit.DAO;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.bridgeit.DTO.Contact;

public class ContactDAO 
{
	Configuration config=new Configuration().configure("hibernate.cfg.xml");
	
	
	SessionFactory factory=config.buildSessionFactory();
	public void insertdata(Contact object )
	{
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.persist(object);
		transaction.commit();
		session.close();
		
	}
	
	public void updatedata(Contact obj)
	{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();

		session.update(obj);
		transaction.commit();
		session.close();
	}
}
