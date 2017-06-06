package com.bridgeit.SpringHinernate.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bridgeit.SpringHinernate.Model.Stock;

public class StockDaoImpl implements StockDao {

    private SessionFactory sessionFactory;
	  
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Stock stock) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(stock);
		tx.commit();
		session.close();
		
	}

	

}
