package com.bridgelab.employeeportal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/EmployeeForm")
public class EmployeeReg extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("employee registration");
		HttpSession session=request.getSession();
		Integer sessionid=(Integer) session.getAttribute("userid");
		System.out.println("getting emp session"+sessionid);
		if(sessionid!=null)
		{
			DBConnection connect=new DBConnection();
				Connection connection=connect.getconnection();
				
				String Name=request.getParameter("name");
				if(Name==null ||Name.trim().length()==0)
				{
					printWriter.println(" Name missing ");
				}
				String Address=request.getParameter("address");
				if(Address==null ||Address.trim().length()==0)
				{
					printWriter.println(" Address missing ");
				}
				String Company=request.getParameter("company");
				if(Company==null ||Company.trim().length()==0)
				{
					printWriter.println(" Company missing ");
				}
				String Age=request.getParameter("age");
				if(Age==null ||Age.trim().length()==0)
				{
					printWriter.println(" Age missing ");
				}
				String Gender=request.getParameter("gender");
				if(Gender==null ||Gender.trim().length()==0)
				{
					printWriter.println(" Gender missing ");
				}
				String[] Specialization=request.getParameterValues("specialization");
				String[] Language=request.getParameterValues("language");
				String special="";
				for(int i=0;i<Specialization.length;i++)
				{
					special=special+Specialization[i]+",";
				}
				
				String lang="";
				for(int j=0;j<Language.length;j++)
				{
					lang=lang+Language[j]+",";
					
				}	
				String Salary=request.getParameter("salary");
				if(Salary==null ||Salary.trim().length()==0)
				{
					printWriter.println(" Salary missing ");
				}
				try 
				{
					PreparedStatement preparedStatement=connection.prepareStatement("Insert into EmployeeDetails(name,address,company,age,gender,specialization,language,UId,salary) values (?,?,?,?,?,?,?,?,?)");
					preparedStatement.setString(1, Name);
					preparedStatement.setString(2, Address);
					preparedStatement.setString(3, Company);
					preparedStatement.setString(4, Age);
					preparedStatement.setString(5, Gender);
					preparedStatement.setString(6, special);
					preparedStatement.setString(7, lang);
					preparedStatement.setInt(8, sessionid);
					preparedStatement.setString(9, Salary);
					
					int i=preparedStatement.executeUpdate();
					if(i>0)
					{
						printWriter.println("Employee Details added successfully");
			//			request.getRequestDispatcher("Employee").forward(request, response);
						response.sendRedirect("Employee");
						
					}
					else
						printWriter.println("Error Occured");
				}
				catch (SQLException e) 
				{
					
					e.printStackTrace();
				}
				}
				else
				{
					response.sendRedirect("Prelogin");
				}
	}

	

}
