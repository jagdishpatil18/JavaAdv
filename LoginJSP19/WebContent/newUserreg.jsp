<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="Header.jsp" %>
<form action="UserRegistration" method="post" class="user"> 
<!-- <form action="Preuserreg" method="post"> -->
	<!--  	<div class="container" >  -->

			<table  class="usertbl">
			 <tr>
			 <td><td><h3>&nbsp   SignUp Page</h3></td></td>
			 </tr>
			 <tr>
			   <td><b> Email</b> </td>
			   <td><input type="email" id="emailid1" placeholder="Enter Email ID" name="EmailId" required></td>
			   </tr>
			  <tr> 
			   <td><b>First Name </b></td>
			   <td><input type="text" id="fname" placeholder="Enter your First name" name="firstname" required></td>
			  </tr>
			<tr>
			<td><b>Last Name</b></td>
			<td> <input type="text" id="lname" placeholder="Enter your last name" name="lastname" required></td>
			</tr>
				
			<tr>
				<td><b>PassWord</b></td>
				<td><input type="password" id="password1" placeholder="Enter Password" name="password" required></td>
			</tr>	 
			<tr><td><td><input type="submit" value="Submit" onclick="return validateuser()" class="btn btn-success btn-lg">
				<input type="reset"  value="Reset" class="btn btn-primary btn-lg"></td></td>
			</tr>
		</table>	
		
 <!--  		</div>  -->
	</form>

</body>
</html>