package com.bridgeit.electronicshop.DTO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ProductDetails")
public class ProductDetails implements Serializable
{
	@Id
	@GenericGenerator(name="id",strategy="increment")
	@GeneratedValue(generator="id")
	@Column(name="ID")
	private int id;
	@Column(name="Model")
	private String model;
	@Column(name="Price")
	private double price;
	@Column(name="Company")
	private String company;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Product product;
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getId() 
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String getCompany()
	{
		return company;
	}
	
	public void setCompany(String company)
	{
		this.company = company;
	}
	
	
}
