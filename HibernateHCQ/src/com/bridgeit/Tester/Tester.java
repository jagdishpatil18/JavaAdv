package com.bridgeit.Tester;

import com.bridgeit.DAO.ProductDAO;
import com.bridgeit.DTO.Product;

public class Tester 
{

	public static void main(String[] args)
	{
	
		Product product=new Product();
		product.setId(1);
		product.setName("Moto M");
		product.setPrice(20000.00);
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("Moto g4");
		product2.setPrice(14000.00);
		
		Product product3=new Product();
		product3.setId(3);
		product3.setName("Moto x");
		product3.setPrice(24000.00);
		
		Product product4=new Product();
		product4.setId(4);
		product4.setName("Moto g5");
		product4.setPrice(20000.00);
		
		Product product5=new Product();
		product5.setId(5);
		product5.setName("Moto Style");
		product5.setPrice(30000.00);
		
		Product product6=new Product();
		product6.setId(6);
		product6.setName("Moto g");
		product6.setPrice(14000.00);
		
		ProductDAO dao=new ProductDAO();
		dao.addProduct(product);
		dao.addProduct(product2);
		dao.addProduct(product3);
		dao.addProduct(product4);
		dao.addProduct(product5);
		dao.addProduct(product6);
		
		dao.showProducts();
		dao.show_list();
		dao.show_price();
		dao.show_like();
		dao.show_order();
		dao.show_And();
		dao.show_Or();
	}
}
