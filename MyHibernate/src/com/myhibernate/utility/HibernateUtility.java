package com.myhibernate.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility 
{

	public static SessionFactory factory;
	
	private HibernateUtility()
	{
		
	}
	
	 public static synchronized SessionFactory getSessionFactory()
	 {
		 
	        try
	        {
	            factory = new Configuration().configure().buildSessionFactory();
	        }
	        catch (Exception e) 
	        {
	        	System.out.println("Sessionfactory creation failed");
	        	e.printStackTrace();
	        }
	        return factory;
	  }
}
