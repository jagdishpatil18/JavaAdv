package com.bridgelab.loginjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/EmployeeDetails")
public class EmployeeDetails extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
		doPost(request, response);
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		DBConnection connect=new DBConnection();
		Connection connection=connect.getconnection();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try
		{
			PreparedStatement preparedStatement=connection.prepareStatement("Select * from EmployeeDetails");
			ResultSet resultSet= preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				String name=resultSet.getString(1);
				String address=resultSet.getString(2);
				String company=resultSet.getString(3);
				String age=resultSet.getString(4);
				String gender=resultSet.getString(5);
				String special=resultSet.getString(6);
				String lang=resultSet.getString(7);
				
				
				printWriter.println("<HTML>");
				printWriter.println("<body>");
				printWriter.println("<table border=2px solid black>");
				printWriter.println("<br>");
				printWriter.println("<tr><td>Name</td><td> Address</td> <td>Company</td><td> Age</td><td> Gender</td> <td>Specialization</td><td> Language</td></tr>");
				printWriter.println("<br>");
				printWriter.println("<tr><td>"+name+"</td> <td> "+address+"</td> <td>"+company+"</td><td>"+age+"</td> <td>"+gender+"</td><td> "+special+"</td> <td>"+lang+"</td></tr>");
				
				printWriter.println("</table>");
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
