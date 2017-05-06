package com.bridgelab.loginjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/EmployeeDetails")
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
		request.getRequestDispatcher("Logout.jsp").include(request,response );
		
		String uri=request.getRequestURI();
		String path=request.getPathInfo();
		String protocol=request.getProtocol();
		String raddress=request.getRemoteAddr();
		
			printWriter.println("<br>    URI : "+uri);
			printWriter.println(" <br>   Path : "+path);
			printWriter.println(" <br>   Protocol : "+protocol);
			printWriter.println(" <br>   Remote Address : ");
			
			HttpSession session=request.getSession();
			Integer user=(Integer) session.getAttribute("userid");
			if(user!=null)
			{
						
			printWriter.println("<br> Session created on :"+session.getCreationTime());
			printWriter.println("<br> LastAccessedTime : "+session.getLastAccessedTime());
			printWriter.println("<br> Session Id :"+session.getId());
			printWriter.println("<br> Session Inactive Time :"+session.getMaxInactiveInterval());
		try
		{
			PreparedStatement preparedStatement=connection.prepareStatement("Select * from EmployeeDetails where UId=?");
			preparedStatement.setInt(1, user);
			ResultSet resultSet= preparedStatement.executeQuery();
			
			printWriter.println("<HTML>");
			printWriter.println("<body>");
			
			printWriter.println("<table border=2px solid black>");
			printWriter.println("<br>");
			printWriter.println("<tr><td>Sr No</td><td>Name</td><td> Address</td> <td>Company</td><td> Age</td><td> Gender</td> <td>Specialization</td><td> Languages Know</td><td>Salary</td></tr>");
			printWriter.println("<br>");

			int i=1;
			while(resultSet.next())
			{
				String name=resultSet.getString(1);
				String address=resultSet.getString(2);
				String company=resultSet.getString(3);
				String age=resultSet.getString(4);
				String gender=resultSet.getString(5);
				String special=resultSet.getString(6);
				String lang=resultSet.getString(7);
				String salary=resultSet.getString(9);				
				printWriter.println("<tr><td>"+i+"</td><td>"+name+"</td> <td> "+address+"</td> <td>"+company+"</td><td>"+age+"</td> <td>"+gender+"</td><td> "+special+"</td> <td>"+lang+"</td><td>"+salary+"</td></tr>");
				
			i++;
				
			}
			printWriter.println("</table>");
			printWriter.println("</body>");
			printWriter.println("</HTML>");
		} 
			
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		}
			
			else
			{
				response.sendRedirect("Login.jsp");

			}
	}

	

}
