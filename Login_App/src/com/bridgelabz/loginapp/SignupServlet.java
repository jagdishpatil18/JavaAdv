package com.bridgelabz.loginapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		printWriter.println("Welcome to SignUp");
		String email=request.getParameter("EmailId");
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String mobile=request.getParameter("mobileno");
		String passwd=request.getParameter("password");
		printWriter.println(email+" "+fname+"  "+lname+"  "+mobile+"   "+passwd);
		Connection connection=null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Getting connected");

			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgeit","root","root");
			System.out.println("connected");
			
			PreparedStatement preparedStatement=connection.prepareStatement("insert into users values(?,?,?,?,?)");
			preparedStatement.setString(1,email);
			preparedStatement.setString(2, passwd);
			preparedStatement.setString(3, fname);
			preparedStatement.setString(4, lname);
			preparedStatement.setString(5, mobile);
			
			int i=preparedStatement.executeUpdate();
			
			if(i>0)
			{
				printWriter.println("Successfully Registered");
			}
		} 
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*doGet(request, response);*/
	}

}
