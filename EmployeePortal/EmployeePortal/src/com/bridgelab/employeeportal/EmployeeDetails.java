package com.bridgelab.employeeportal;

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
		
		
		DBConnection connect=new DBConnection();
		Connection connection=connect.getconnection();
    	request.getRequestDispatcher("header.jsp").include(request, response);
		
		HttpSession session=request.getSession();
			Integer user=(Integer) session.getAttribute("userid");
			if(user!=null)
			{
				request.getRequestDispatcher("EmployeeInfo.jsp").forward(request, response);
			
		/*		try
				{
					PreparedStatement preparedStatement=connection.prepareStatement("Select * from EmployeeDetails where UId=?");
					preparedStatement.setInt(1, user);
					ResultSet resultSet= preparedStatement.executeQuery();
					
					
					printWriter.println("<br>");
					printWriter.println("<html>");
					printWriter.println("<head>");
			//		printWriter.println("<style >");
					printWriter.println("<link href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/redmond/jquery-ui.css' rel='stylesheet' type='text/css'/>");
					printWriter.println("<script src='http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js'></script>");
					printWriter.println("<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js'></script>");
					
					printWriter.println("<script type='text/javascript'>$(document).ready(function () {");
		             
					printWriter.println("$('.eli').click(function () {");
					printWriter.println("var myid=$(this).attr('id')");
					printWriter.println("console.log(myid,'hellllo')");
		  //....          printWriter.println("$('#dialog').dialog({modal: true, height: 400, width: 400 });");
		          
					printWriter.println("$('<div ><div >Hello<div></div>').dialog({modal: true, height: 400, width: 400 });");
		            printWriter.println(";});});");
		            printWriter.println(" </script>");
		            printWriter.println("<style>");
		       //     printWriter.println("#dialog{ font-size:14px; text-align: center; }");
		            printWriter.println("</style>");
                    printWriter.println("</head>");
                    printWriter.println("<body>");
                	printWriter.println("<ul class='eul'><li class='ecli'><b>Employee Names</b></li>");
                    while(resultSet.next())
					{
					printWriter.println("<li class='eli' id='"+resultSet.getInt(10)+"'>"+resultSet.getString(1)+"</li>");	
			//		String email=resultSet.getString(2);
		//			printWriter.println("<div id='dialog' title='EmployeeInfo'>"+resultSet.getString(1)+"</div>" );
					}
					
					printWriter.println("</ul>");
		//....			printWriter.println("<div id='dialog' title='EmployeeInfo'></div>" );		
					printWriter.println("</body></html>");
				  } 
					
				  catch (SQLException e) 
				  {
					  e.printStackTrace();
				  }

	//.......			request.getRequestDispatcher("EmployeeDetails").forward(request, response);
		//......		response.sendRedirect("EmployeeInfo.jsp");
*/			}
					
			  else
			  {
				  response.sendRedirect("Prelogin");
			  }
	}

	

}
