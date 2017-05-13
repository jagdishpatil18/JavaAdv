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
	 if(user!=null)
	 {
		try
		{
			PreparedStatement preparedStatement=connection.prepareStatement("Select * from EmployeeDetails where UId=?");
			preparedStatement.setInt(1, user);
			ResultSet resultSet= preparedStatement.executeQuery();

 %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/redmond/jquery-ui.css' rel='stylesheet' type='text/css'/>
<script src='http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js'></script>
<script type='text/javascript'>

	$(document).ready(function () 
	{
		$('.eli').click(function () 
				{
			      var myid=$(this).attr("id");
			      var ename=$(this).attr("name");
			      var eaddress=$(this).attr("address");
			      var ecompany=$(this).attr('company');
			      var eage=$(this).attr('age');
			      var egender=$(this).attr('gender');
			      var especial=$(this).attr('special');
			      var elang=$(this).attr('lang');
			      var esalary=$(this).attr('salary');
			      console.log(myid,'hellllo');
			
			$("<div title='Information' style='text-align:center'><div><form><table border='2px solid black'><center><tr><td>EmpId</td><td>Name</td><td>Address</td><td>Company</td><td>Age</td><td>Gender</td><td>Specialization</td><td>Languages Known</td><td>Salary<br>(in lacs)</td></tr><tr><td>"+myid+"</td><td>"+ename+"</td><td>"+eaddress+"</td><td>"+ecompany+"</td><td>"+eage+"</td><td>"+egender+"</td><td>"+especial+"</td><td>"+elang+"</td><td>"+esalary+"</td></tr></center></table><br><button name='myid' value='"+myid+"'formaction='UpdateDetails' formmethod='post'class='btn btn-primary'>Update</button> <button name='myid' value='"+myid+"' formaction='Delete_Emp ' formmethod='post' class='btn btn-danger'>Delete</button></form></div>").dialog({modal: true, height: 300, width: 1100 });
	//		$("#myid").dialog({modal: true, height: 400, width: 400 });
				});
		    
	});
	</script>	
			</head>
<body>



	
					
				
			
            	<ul class="eul"><li class="ecli"><b>Employee Names</b></li>
            <% while(resultSet.next())
				{
            %>	
				
				<li class='eli' id=<%=resultSet.getString(10)%> name="<%=resultSet.getString(1)%>"
				address="<%=resultSet.getString(2)%>" company="<%=resultSet.getString(3)%>" age=<%=resultSet.getInt(4)%> 
				gender=<%=resultSet.getString(5)%> special="<%=resultSet.getString(6)%>" lang="<%=resultSet.getString(7)%>" 
				salary=<%=resultSet.getInt(9)%>><%=resultSet.getString(1) %></li>	

				
			<% 	}  %>
				
				</ul>
			
			 
		<%    }
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

<!-- 	<div title='Information' id='myid' ><table border='2px solid black'><tr><td>EmpId</td><td>Name</td><td>Address</td><td>Company</td><td>Age</td><td>Gender</td><td>Specialization</td><td>Languages Known</td><td>Salary</td></tr><tr></tr></table></div> -->

</body>
	
</html>