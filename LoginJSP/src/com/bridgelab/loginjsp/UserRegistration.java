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


//@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String email=request.getParameter("EmailId");
		String passwd=request.getParameter("password");
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		
		
		DBConnection connect=new DBConnection();
		Connection connection=connect.getconnection();
		
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement("Insert into UserDetails values (?,?,?,?)");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, passwd);
			preparedStatement.setString(3, fname);
			preparedStatement.setString(4, lname);
			
			int resultSet=preparedStatement.executeUpdate();
			
			if(resultSet>0)
			{
				printWriter.println("Successfully Registered");
		//		RequestDispatcher requestdispatcher=request.getRequestDispatcher("Login.jsp");
		//		requestdispatcher.include(request, response);
			
				response.sendRedirect("Login.jsp");
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
