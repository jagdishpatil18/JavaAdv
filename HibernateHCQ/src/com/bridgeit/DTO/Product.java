package com.bridgeit.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product implements Serializable
{
		@Id
		@Column(name="Product_Id")
		private int id;
		@Column(name="Product_Name")
		private String name;
		@Column(name="Product_Price")
		private double price;
		
		public Product()
		{
			
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double d) {
			this.price = d;
		}
		
		
}
