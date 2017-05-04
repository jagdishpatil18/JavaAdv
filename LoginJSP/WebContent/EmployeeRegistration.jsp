<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Registration</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>

<script>
function validateemp()
{

	var fullname=document.getElementById('fname').value;
	var name = /^[a-zA-Z  ]+$/;
	
 	if(fullname.length==null ||!name.test(fullname))
 	{
 		alert("Enter Name which contains only alphabets ");
 		return false;
 		
 	}
 	
}

</script>

<style>
table {

	border: 5px solid #f5e6ff;
	
	background-color: #e6ffe6;
}
td,th{
    padding: 8px;
}
input[type=text],input[type=number]{
	width: 350px;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
	background-color: #ffffcc;
	font-weight: bold;
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
	margin-top:25px;

}
 body{
background-color: #f2f2f2; 
} 
</style>
<body >
<a href="EmployeeDetails">EmployeeDetails</a>
<form action="EmployeeReg" method="post">
		<div class="container1" >
			<center>
			<table >
			 <tr>
			 <td><td><h3>&nbsp &nbsp &nbsp   Employee Registration</h3></td></td>
			 </tr>
			  <tr> 
			   <td><b>Employee Name </b></td>
			   <td><input type="text" id="fname" placeholder="Enter  name" name="name" required></td>
			  </tr>
			<tr>
			<td><b>Address </b></td>
			<td> <textarea  rows="4"  placeholder="Enter Address" name="address" required style="width: 350px; padding-left: 20px; padding-top: 12px; background-color: #ffffcc "  ></textarea>
			</td></tr>
			<tr>
			<td><b>Company Name </b></td>
			<td> <input type="text" placeholder="Enter company name" name="company" required ></td>
			</tr>
			<tr>
				<td><b>Age</b></td>
				<td><input type="number" placeholder="Enter Age" name="age" required></td>
			</tr>	
			<tr>
			<td><b>Gender</b></td>
			<td><input type="radio" name="gender" value="male" >Male&nbsp &nbsp
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
			<tr><td><td><input type="submit" value="Submit" style="width: 200px; " class="btn btn-success btn-lg" onclick="return validateemp()">
				<input type="Reset"  value="Reset" style="width: 200px; " class="btn btn-primary btn-lg"></td></td>
			</tr>
		</table>	
		</center>
		</div>
	</form>


</body>
</html>