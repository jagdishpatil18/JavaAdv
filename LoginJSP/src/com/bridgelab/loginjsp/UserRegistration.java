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


@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String email=request.getParameter("EmailId");
		if(email==null)
		{
			printWriter.println(" Email missing");
		}	
		String passwd=request.getParameter("password");
		if(passwd==null)
		{
			printWriter.println(" password missing");
		}
		String fname=request.getParameter("firstname");
		if(fname==null || fname.trim().length()==0)
		{
			printWriter.println(" Firstname missing");
		}	
		String lname=request.getParameter("lastname");
		if(lname==null || lname.trim().length()==0)
		{
			printWriter.println(" Lastname missing");
		}
		
		DBConnection connect=new DBConnection();
		Connection connection=connect.getconnection();
		
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement("Insert into UserDetails(emailid,password,firstname,lastname) values (?,?,?,?)");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, passwd);
			preparedStatement.setString(3, fname);
			preparedStatement.setString(4, lname);
			
			int i=preparedStatement.executeUpdate();
			 System.out.println(i);
			if(i>0)
			{
				printWriter.println("Successfully Registered");
		//		RequestDispatcher requestdispatcher=request.getRequestDispatcher("Login.jsp");
		//		requestdispatcher.include(request, response);
			
				response.sendRedirect("Login.jsp");
			}
			else
				printWriter.println("Error Occured/ allready registered");
			    RequestDispatcher requestdispatcher=request.getRequestDispatcher("UserRegistration.jsp");
			    requestdispatcher.include(request, response);
		} 
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
	}


}
