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


//@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
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
			String fname,lname,passd;
			long mbno;
			if(resultSet.next())
			{
				printWriter.println("<HTML>");
				printWriter.println("<body bgcolor=#e6ffcc>");
				printWriter.println("<Details are ><br>");
				printWriter.println("<center><table  >");
				printWriter.println("<tr><td>Update Password:</td><td><input type=text name=upass></td></tr>");
				printWriter.println("<tr><td>Update Firstname:</td><td><input type=text name=uname></td></tr>");
				printWriter.println("<tr><td>Update Lastname:</td><td><input type=text name=ulname></td></tr>");
				printWriter.println("<tr><td>Update MobileNo:</td><td><input type=text name=umbno></td></tr>");
		    	printWriter.println("<center></table");
		    	

				printWriter.println("</body>");
		    	printWriter.println("</HTML>");
				
			}
		/*	PreparedStatement preparedStatement1=(PreparedStatement) connection.prepareStatement("insert into users values(?,?,?,?)");
			
			preparedStatement.setString(2, );
			preparedStatement.setString(3, fname);
			preparedStatement.setString(4, lname);
			preparedStatement.setString(5, mobile);*/
			
	//		int i=preparedStatement.executeUpdate();
		
		}
		catch (SQLException e)
		{
		
			e.printStackTrace();
		}

	}

}
