package com.bridgelabz.loginapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;


//@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet 
{
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
			PreparedStatement preparedStatement=(PreparedStatement) connection.prepareStatement("select * from users  where emailid=? and password=?");
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, passwd);
			
			ResultSet resultSet= preparedStatement.executeQuery();
			
			
			String fname,lname,emailid;
			long mbno;
			if(resultSet.next())
			{
		//		printWriter.println("Successfully logged in");
				
				emailid=resultSet.getString(1);
				fname=resultSet.getString(3);
				lname=resultSet.getString(4);
				mbno=resultSet.getLong(5);

				printWriter.println("<HTML>");
				printWriter.println("<body bgcolor=#e6ffcc>");
				printWriter.println("<Details are ><br>");
				printWriter.println("<center><table bgcolor=#BFC9F2 >");
				printWriter.println("<tr><td>EmailID:</td><td>"+emailid+"</td></tr>");
				printWriter.println("<tr><td>Firstname:</td><td>"+fname+"</td></tr>");
				printWriter.println("<tr><td>Lastname:</td><td>"+lname+"</td></tr>");
				printWriter.println("<tr><td>MobileNo:</td><td>"+mbno+"</td></tr>");
		    	printWriter.println("<center></table");

				printWriter.println("</body>");
		    	printWriter.println("</HTML>");
		    	
			}
		
		}
		catch (SQLException e)
		{
		
			e.printStackTrace();
		}
		
		

	}

}
