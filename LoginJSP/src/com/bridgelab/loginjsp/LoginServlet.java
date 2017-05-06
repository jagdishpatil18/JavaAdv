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
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
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
	
		/*	HttpSession session=request.getSession();
		Integer accesscount;
		synchronized (session) 
		{
			accesscount= (Integer) session.getAttribute("accesscount");
			if(accesscount==null)
			{
				accesscount=0;
			}
			else{
				accesscount=new Integer(accesscount+1);
			}
			session.setAttribute("accesscount", accesscount);
		}*/
		
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
				HttpSession session=request.getSession();
				int uid=resultSet.getInt(5);
				session.setAttribute("userid", uid);
				String uemail=resultSet.getString(1);
		//		printWriter.println("     Session Id is : "+session.getId());
		//		printWriter.println("     LAst accessTime: "+session.getLastAccessedTime());
			/*	RequestDispatcher requestdispatcher=request.getRequestDispatcher("EmployeeRegistration.jsp");
				requestdispatcher.include(request, response);
*/	
				response.sendRedirect("EmployeeRegistration.jsp");
			}
			else {
				printWriter.println("Invalid Login");
			//	System.out.println("Invalid Login");
			//	RequestDispatcher requestdispatcher=request.getRequestDispatcher("Login.jsp");
			//	requestdispatcher.include(request, response);

			}
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	}

}
