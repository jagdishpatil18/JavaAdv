package com.bridgeit.DAO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.bridgeit.DTO.Product;

public class ProductDAO
{

	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	public void addProduct(Product productobj)
	{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(productobj);
		transaction.commit();
		System.out.println("Product added successfully");
		session.close();
		
	}
	
	public void showProducts()
	{
		
		Session session=factory.openSession();
		System.out.println("--------PRODUCT LIST------------");
		List productlist=session.createQuery("FROM Product").list();
		Iterator itr=productlist.iterator();
		System.out.println("ID \tName \tPrice ");
		while(itr.hasNext())
		{
			Product prdct=(Product) itr.next();
			System.out.print(prdct.getId());
			System.out.print("\t"+prdct.getName());
			System.out.println("\t"+prdct.getPrice());
			
		}
		session.close();
	}
	
	public void show_list()
	{
		
		Session session=factory.openSession();
		System.out.println("---------List from product from id3--------");
		Criteria criteria=session.createCriteria(Product.class);
		criteria.setFirstResult(2);
		List list=criteria.list();
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			Product prd=(Product) iter.next();
			System.out.print(prd.getId());
			System.out.print(" \t "+prd.getName());
			System.out.println("\t"+prd.getPrice());
		}
	//	System.out.println(list);
		session.close();
	}

	public void show_price()
	{
		
		Session session=factory.openSession();
		System.out.println("-----------Price greater than-----------");
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.gt("price", 20000.00));
		List list=criteria.list();
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			Product prd=(Product) iter.next();
			System.out.print(prd.getId());
			System.out.print("\t"+prd.getName());
			System.out.println("\t"+prd.getPrice());
		}
	//	System.out.println(list);
		session.close();
	}
	
	public void show_like()
	{
		
		Session session=factory.openSession();
		System.out.println("------------Name like-----------");
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.like("name", "%style"));
		List list=criteria.list();
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			Product prd=(Product) iter.next();
			System.out.print(prd.getId());
			System.out.print("\t"+prd.getName());
			System.out.println("\t"+prd.getPrice());
		}
	//	System.out.println(list);
		session.close();
	}

	public void show_order()
	{
		
		Session session=factory.openSession();
		System.out.println("------------Ordered by Price-----------");
		Criteria criteria=session.createCriteria(Product.class);
		criteria.addOrder(Order.asc("price"));
		List list=criteria.list();
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			Product prd=(Product) iter.next();
			System.out.print(prd.getId());
			System.out.print("\t"+prd.getName());
			System.out.println("\t"+prd.getPrice());
		}
	//	System.out.println(list);
		session.close();
	}
	
	public void show_And()
	{
		
		Session session=factory.openSession();
		System.out.println("------------And--------------");
		Criteria criteria=session.createCriteria(Product.class);
		Criterion pricecri= Restrictions.gt("price", 15000.00);
		Criterion namecri= Restrictions.like("name", "%to%");
		LogicalExpression andexp=Restrictions.and(namecri,pricecri);
		criteria.add(andexp);
		List list=criteria.list();
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			Product prd=(Product) iter.next();
			System.out.print(prd.getId());
			System.out.print("\t"+prd.getName());
			System.out.println("\t"+prd.getPrice());
		}
	
		session.close();
	}
	
	public void show_Or()
	{
		
		Session session=factory.openSession();
		
		Criteria criteria=session.createCriteria(Product.class);
		Criterion pricecri= Restrictions.gt("price", 15000.00);
		Criterion namecri= Restrictions.like("name", "%to%");
		System.out.println("-------------OR--------------");
		LogicalExpression orexp=Restrictions.or(namecri,pricecri);
		criteria.add(orexp);
		List list1=criteria.list();
		Iterator iter1=list1.iterator();
		while(iter1.hasNext())
		{
			Product prd=(Product) iter1.next();
			System.out.print(prd.getId());
			System.out.print("\t"+prd.getName());
			System.out.println("\t"+prd.getPrice());
		}
		session.close();
	}
	
}
