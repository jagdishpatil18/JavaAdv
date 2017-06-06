package com.bridgeit.SpringHibernate.DAO;

import java.util.List;

import com.bridgeit.SpringHibernate.DTO.Person;

public interface PersonDao {

	public void save(Person p);
	
	public List<Person> list();
}
