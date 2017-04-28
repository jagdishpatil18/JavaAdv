package com.bridgelabz.loginapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;


//@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	//	printWriter.println("Welcome to signin");
		String user=request.getParameter("username");
		String passwd=request.getParameter("password");
		printWriter.println(user+"  "+passwd);
		
		String ser=request.getServerName();
		printWriter.println(ser);
		
		Login connect=new Login();
		Connection connection=connect.getconnect();

		
		try 
		{
	     	PreparedStatement preparedStatement=(PreparedStatement) connection.prepareStatement("select * from users where emailid=? and password=?");
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, passwd);
		
			ResultSet resultSet= preparedStatement.executeQuery();
	
			String fname,lname,emailid;
			long mbno;
			if(resultSet.next())
			{
				printWriter.println("Successfully logged in");
				/*Cookie cookie=new Cookie("name", user);
				response.addCookie(cookie);*/
				fname=resultSet.getString(3);
				lname=resultSet.getString(4);
				mbno=resultSet.getLong(5);

				printWriter.println("EmailID:"+user);
		    	printWriter.println("FirstName:"+fname);
		    	printWriter.println("LastName:"+lname);
		    	printWriter.println("Mobile Number:"+mbno);
		
		    	RequestDispatcher requestdispatcher=request.getRequestDispatcher("myaccount.html");
				requestdispatcher.forward(request, response);
			}
			else
			printWriter.println("Incorrect Login");
			
		} 
		catch (SQLException e)
		{
			

			e.printStackTrace();
		}
	}

}
