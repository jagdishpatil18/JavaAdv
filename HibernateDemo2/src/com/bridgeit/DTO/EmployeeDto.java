package com.bridgeit.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;


@Entity
@Table(name="Employee")
public class EmployeeDto
{
	@Id
	@Column(name="id")
	public int id;
	/*@Column(name="firstname")*/
	public String firstname;
	/*@Column(name="lastname")*/
	public String lastname;
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getFirstname()
	{
		return firstname;
	}
	
	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}
	
	public String getLastname()
	{
		return lastname;
	}
	
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

}
