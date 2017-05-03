<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Registration</title>
</head>
<style>
table {
	padding-left:10px;
	border: 10px solid #e6ffff;
	margin:10px;
	width: 60%;
}

input[type=text],input[type=number]{
	width: 350px;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}
input[type=radio],input[type=checkbox]
{
   padding: 12px 20px;
   border: 1px solid #ccc;
   margin: 8px 0;
	display: inline-block;
	box-sizing: border-box;
}
.container1 {
	margin-top:100px;
	padding: 16px;
}
</style>
<body bgcolor="#e6ffcc">
<form action="EmployeeReg" method="post">
		<div class="container1" >
			<center>
			<table >
			
			  <tr> 
			   <td><b>Name </b></td>
			   <td><input type="text" placeholder="Enter  name" name="name" required></td>
			  </tr>
			<tr>
			<td><b>Address </b></td>
			<td> <textarea  rows="2"  placeholder="Enter Address" name="address" required style="width: 350px; "></textarea>
			</td></tr>
			<tr>
			<td><b>Company Name </b></td>
			<td> <input type="text" placeholder="Enter company name" name="company" ></td>
			</tr>
			<tr>
				<td><b>Age</b></td>
				<td><input type="number" placeholder="Enter Age" name="age" required></td>
			</tr>	
			<tr>
			<td><b>Gender</b></td>
			<td><input type="radio" name="gender" value="male" >Male
				<input type="radio" name="gender" value="female">Female
			</td> 
			</tr>
			<tr>
			<td><b>Specialization</b></td>
			<td><input type="checkbox" name="specialization" value="java">Java
			<input type="checkbox" name="specialization" value=".net">.Net
			<input type="checkbox" name="specialization" value="ios">iOS
			<input type="checkbox" name="specialization" value="android">Android
			</td>
			</tr>
			
			<tr>
			<td><b>Languages Known</b></td>
			<td><input type="checkbox" name="language" value="English">English
			<input type="checkbox" name="language" value="Hindi">Hindi
			<input type="checkbox" name="language" value="Marathi">Marathi
			</td>
			</tr>
			<tr><td><td><input type="submit" value="Submit" style="width: 200px; ">
				<input type="Reset"  value="Reset" style="width: 200px; "></td></td>
			</tr>
		</table>	
		</center>
		</div>
	</form>

</body>
</html>