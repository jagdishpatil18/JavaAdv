package com.bridgelabz.loginapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

//@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
  	{

  		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String user=request.getParameter("username");
		String passwd=request.getParameter("password");
		
		Login connect=new Login();
		Connection connection=connect.getconnect();

		try 
		{
			PreparedStatement preparedStatement=(PreparedStatement) connection.prepareStatement("Select * from users where emailid=? and password=?");
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, passwd);
			
			ResultSet resultSet= preparedStatement.executeQuery();
			
		
		}
		catch (SQLException e)
		{
		
			e.printStackTrace();
		}
	}

}
