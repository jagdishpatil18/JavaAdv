<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Registration</title>
</head>
<style>
table {
	padding-left:10px;
	border: 10px solid #e6ffff;
	margin:10px;
}

input[type=text], input[type=password],input[type=email]{
	width: 80%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

.container {
	margin-top:150px;
	padding: 16px;
}
</style>
<body bgcolor="#e6ffcc">
<form action="UserRegistration" method="post">
		<div class="container" >
			<center>
			<table >
			 <tr>
			   <td><b> Email</b> </td>
			   <td><input type="email" placeholder="Enter Email ID" name="EmailId" required></td>
			   </tr>
			  <tr> 
			   <td><b>First Name </b></td>
			   <td><input type="text" placeholder="Enter your First name" name="firstname" required></td>
			  </tr>
			<tr>
			<td><b>Last Name</b></td>
			<td> <input type="text" placeholder="Enter your last name" name="lastname" required></td>
			</tr>
				
			<tr>
				<td><b>PassWord</b></td>
				<td><input type="password" placeholder="Enter Password" name="password" required></td>
			</tr>	 
			<tr><td><td><input type="submit" value="submit" >
				<input type="Reset"  value="reset"></td></td>
			</tr>
		</table>	
		</center>
		</div>
	</form>

</body>
</html>