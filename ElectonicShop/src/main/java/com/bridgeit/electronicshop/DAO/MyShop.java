package com.bridgeit.electronicshop.DAO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.bridgeit.electronicshop.DTO.ProductDetails;



public class MyShop
{
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	public void addproduct(ProductDetails prodct)
	{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(prodct);
		transaction.commit();
		System.out.println("Success");
		session.close();
	}
	
	public List showProducts()
	{
		Session session=factory.openSession();
		List plist=session.createQuery("From Product").list();
		
		session.close();
		return plist;
		
	}
}
