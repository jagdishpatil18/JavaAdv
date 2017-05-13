package com.bridgelab.loginjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Update_Emp")
public class Update_Emp extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
/*	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}
*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			response.setContentType("text/html");
			PrintWriter printWriter=response.getWriter();
			HttpSession session=request.getSession();
			Integer user=(Integer) session.getAttribute("userid");
		    String empid1=(String)session.getAttribute("eid");
			 
		    if(empid1!=null)
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
					/*String Gender=request.getParameter("gender");
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
						
					}	*/
					String Salary=request.getParameter("salary");
					if(Salary==null ||Salary.trim().length()==0)
					{
						printWriter.println(" Salary missing ");
					}
					try 
					{
						PreparedStatement preparedStatement=connection.prepareStatement("Update EmployeeDetails set name=?,address=?,company=?,age=?,salary=? where empid=?");
						preparedStatement.setString(1, Name);
						preparedStatement.setString(2, Address);
						preparedStatement.setString(3, Company);
						preparedStatement.setString(4, Age);
			/*			preparedStatement.setString(5, Gender);
						preparedStatement.setString(6, special);
						preparedStatement.setString(7, lang);
						preparedStatement.setInt(8, sessionid);
		*/				preparedStatement.setString(5, Salary);
						preparedStatement.setString(6, empid1);
						int i=preparedStatement.executeUpdate();
						if(i>0)
						{
							printWriter.println("Employee Details successfully updated");
				//			request.getRequestDispatcher("Employee").forward(request, response);
							response.sendRedirect("EmployeeDetails");
							
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
						response.sendRedirect("EmployeeDetails");
					}
	}

}
