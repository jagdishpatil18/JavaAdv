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
import com.bridgeit.electronicshop.DTO.ProductDetails;

public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		MyShop dao = new MyShop();
		String name = request.getParameter("name");
	
		
		//For existing product is present
		int flag = 1;
		List plist = dao.showProducts();
		Iterator itr = plist.iterator();
		while (itr.hasNext())
		{
			Product p = (Product) itr.next();

			if (p.getName().equalsIgnoreCase(name)) {
				ProductDetails productDetails = new ProductDetails();

				String company = request.getParameter("cname");
				String model = request.getParameter("model");
				double price = Double.parseDouble(request.getParameter("price"));

				productDetails.setCompany(company);
				productDetails.setModel(model);
				productDetails.setPrice(price);
				productDetails.setProduct(p);

				dao.addproduct(productDetails);
				flag = 0;
				printWriter.println("Success");
				response.sendRedirect("index.jsp");
			
				
				
				
			}

		}

	

		//For new product to add
		
		if (flag == 1) {
			Product product = new Product();
			// product.setId(id);
			product.setName(name);

			ProductDetails productDetails = new ProductDetails();

			String company = request.getParameter("cname");
			String model = request.getParameter("model");
			double price = Double.parseDouble(request.getParameter("price"));

			productDetails.setCompany(company);
			productDetails.setModel(model);
			productDetails.setPrice(price);
			productDetails.setProduct(product);

			dao.addproduct(productDetails);

			printWriter.print("Success");
	//		response.sendRedirect("index.jsp");
		}
	}
}
