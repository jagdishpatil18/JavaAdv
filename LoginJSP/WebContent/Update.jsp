<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="java.util.*,java.sql.*,com.bridgelab.loginjsp.DBConnection"
%>

<%
	 DBConnection connect=new DBConnection();
	 Connection connection=connect.getconnection();
	 request.getRequestDispatcher("Header.jsp").include(request, response);

	 session=request.getSession();
	 Integer user=(Integer) session.getAttribute("userid");
	 String empid=(String)session.getAttribute("eid");
	 if(user!=null)
	 {
		try
		{
			PreparedStatement preparedStatement=connection.prepareStatement("Select * from EmployeeDetails where empid=?");
			preparedStatement.setString(1, empid);
			ResultSet rs= preparedStatement.executeQuery();

 %>
<%@ include file = "Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%

	while(rs.next())
	{	
%>
<form action="Update_Emp" method="post" style="padding-top: 50px">
		
			<center>
			<table class="tableemp" cellpadding="20">
			 <tr>
			 <td><td><h3>  Employee Registration</h3></td></td>
			 </tr>
			  <tr> 
			   <td><b>Employee Name </b></td>
			   <td><input type="text" id="ename" placeholder="Enter  name" name="name" value="<%=rs.getString(1)%>" required></td>
			  </tr>
			<tr>
			<td><b>Address </b></td>
			<td> <textarea  rows="3"  placeholder="Enter Address" name="address"  required style="width: 350px; 
					padding-left: 20px; padding-top: 12px; background-color: #ffffcc "  ><%=rs.getString(2)%></textarea>
			</td></tr>
			<tr>
			<td><b>Company Name </b></td>
			<td> <input type="text" id="cname" placeholder="Enter company name" name="company" value="<%=rs.getString(3)%>" required ></td>
			</tr>
			<tr>
				<td><b>Age</b></td>
				<td><input type="number" id="num"placeholder="Enter Age" name="age" value=<%=rs.getInt(4)%> required></td>
			</tr>	
			<tr>
				<td><b>Salary</b><br>
				(in lacs per annum)
				</td>
				<td><input type="number" id="num1"placeholder="Enter Salary" name="salary" value="<%=rs.getString(9)%>"required></td>
			</tr>
			<tr>
			<td><b>Gender</b></td>
			<td><input type="radio" name="gender" value="male" >Male &nbsp &nbsp
				<input type="radio" name="gender" value="female">Female
			</td> 
			</tr>
			<tr>
			<td><b>Specialization</b></td>
			<td><input type="checkbox" name="specialization" value="java">Java &nbsp &nbsp
			<input type="checkbox" name="specialization" value=".net"> .Net &nbsp &nbsp
			<input type="checkbox" name="specialization" value="ios"> iOS&nbsp &nbsp
			<input type="checkbox" name="specialization" value="android"> Android &nbsp &nbsp
			</td>
			</tr>
			
			<tr>
			<td><b>Languages Known</b></td>
			<td><input type="checkbox" name="language" value="English">English &nbsp &nbsp
			<input type="checkbox" name="language" value="Hindi"> Hindi &nbsp &nbsp
			<input type="checkbox" name="language" value="Marathi"> Marathi &nbsp &nbsp
			</td> 
			</tr>
			<tr><td><td><input type="submit" value="UpdateMe" style="width: 100px; " class="btn btn-success btn-lg" 
								onclick="return validateemp()">
						<button formaction="EmployeeDetails" class="btn btn-primary btn-lg">Cancle	</button>	
	<!-- 			<input type="Reset"  value="Reset" style="width: 150px; " class="btn btn-primary btn-lg"></td></td> -->
			</tr>
		</table>	
		</center>
		
	</form>




</body>
</html>
<%    }
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


		  %>