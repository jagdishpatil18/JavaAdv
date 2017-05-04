package com.bridgelab.loginjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String user=request.getParameter("email");
		String passwd=request.getParameter("password");
		
		DBConnection connect=new DBConnection();
		Connection connection=connect.getconnection();
	
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement("select * from UserDetails where emailid=? and password=?");
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, passwd);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				printWriter.println("Login Successful");
				System.out.println("Successful login ");
			/*	RequestDispatcher requestdispatcher=request.getRequestDispatcher("EmployeeRegistration.jsp");
				requestdispatcher.include(request, response);
*/	
				response.sendRedirect("EmployeeRegistration.jsp");
			}
			else 
				printWriter.println("Invalid Login");
			//	System.out.println("Invalid Login");
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	}

}
