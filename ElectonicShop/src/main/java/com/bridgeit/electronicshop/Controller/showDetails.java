package com.bridgeit.electronicshop.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.electronicshop.DAO.MyShop;
import com.bridgeit.electronicshop.DTO.Product;

public class showDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter printWriter=resp.getWriter();
		
		MyShop shop=new MyShop();
		List productlist=shop.showProducts();
		Iterator itr=productlist.iterator();
		printWriter.println("ID \t Name\n");
		while(itr.hasNext())
		{
			Product product=(Product) itr.next();
			printWriter.println("<br><a href='ShowProductDetails' >"+product.getId()+"\t"+product.getName()+"</a>");
			printWriter.println();
			
		}
		
		printWriter.print("<br> Enter Product Id to see Details<br>");
		printWriter.print("<input type= 'text'  >");
		printWriter.print("<button formtarget='ShowProductDetails'>ProductDetails</button>");
		
	}
}
