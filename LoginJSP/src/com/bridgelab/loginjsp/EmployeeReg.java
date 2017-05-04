package com.bridgelab.loginjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/EmployeeReg")
public class EmployeeReg extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		DBConnection connect=new DBConnection();
		Connection connection=connect.getconnection();
		
		String Name=request.getParameter("name");
		String Address=request.getParameter("address");
		String Company=request.getParameter("company");
		String Age=request.getParameter("age");
		String Gender=request.getParameter("gender");
		String[] Specialization=request.getParameterValues("specialization");
		String[] Language=request.getParameterValues("language");
		String special="";
		for(int i=0;i<Specialization.length;i++)
		{
			special=special+Specialization[i]+",";
		}
		
		String lang="";
		for(int j=0;j<Language.length;j++)
		{
			lang=lang+Language[j]+",";
			
		}	
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement("Insert into EmployeeDetails values (?,?,?,?,?,?,?)");
			preparedStatement.setString(1, Name);
			preparedStatement.setString(2, Address);
			preparedStatement.setString(3, Company);
			preparedStatement.setString(4, Age);
			preparedStatement.setString(5, Gender);
			preparedStatement.setString(6, special);
			preparedStatement.setString(7, lang);
		
			
			int i=preparedStatement.executeUpdate();
			if(i>0)
			{
				printWriter.println("Employee Details added successfully");
				
				response.sendRedirect("EmployeeRegistration.jsp");
			}
			else
				printWriter.println("Error Occured");
		}
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
	}

	

}
