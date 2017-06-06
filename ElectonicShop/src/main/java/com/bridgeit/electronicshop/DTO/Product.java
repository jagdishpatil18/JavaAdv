package com.bridgeit.electronicshop.DTO;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Products")
public class Product implements Serializable
{
	@Id
	@GenericGenerator(name="pid" ,strategy="increment")
	@GeneratedValue(generator="pid")
	@Column(name="Pro_ID")
	private int id;
	@Column(name="Pro_Name")
	private String name;
	

	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	
	
}
