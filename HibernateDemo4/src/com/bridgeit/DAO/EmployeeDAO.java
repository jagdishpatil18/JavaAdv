package com.bridgeit.DAO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import org.hibernate.classic.Session;


import com.bridgeit.DTO.Employee;

public class EmployeeDAO
{

	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	public Integer addEmployee(Employee empobj)
	{
		Integer empid;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		empid=(Integer) session.save(empobj);
		transaction.commit();
		System.out.println("Successfully added");
		session.close();
		return empid;
		
	}
	
	public void updateemployee(Employee emp)
	{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.update(emp);
		transaction.commit();
		System.out.println("Successfully updated");
		session.close();
	}
	
	public void deleteemp(Employee emp2)
	{
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.delete(emp2);
		transaction.commit();
		System.out.println("Successfully deleted");
		session.close();

	}
	
	public void details()
	{
		
		Session session=factory.openSession();
	//	Transaction transaction=session.beginTransaction();
		
		List emplist= session.createQuery("From Employee").list();
		
		Iterator itr=emplist.iterator();
		while(itr.hasNext())
		{
			Employee emp=(Employee) itr.next();
			System.out.print("ID :"+emp.getId());
			System.out.print("\tFirstname: "+emp.getFirstname());
			System.out.print("\tLastname: "+emp.getLastname());
			System.out.println("\tSalary :"+emp.getSalary());
		
		}
		session.close();
	}
	
	public void detailsonsal()
	{
		
		Session session=factory.openSession();
		
		/*String hql="SELECT E.id From Employee E where E.salary=:salary";*/
		Query query=(Query) session.createQuery("SELECT E.id   From Employee E where E.salary=2000");

		List<Employee> results=query.list();
		/*for(Employee emp:results){
			System.out.println(emp);
		}*/
		System.out.println("Employee with salary 2000 are");
		System.out.println(results);
		
		
	}
}
