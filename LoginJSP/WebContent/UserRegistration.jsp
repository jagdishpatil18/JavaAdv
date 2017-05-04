<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Registration</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>

<script>
function validateuser()
{

    var email = document.getElementById('emailid');
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    
    var password=document.getElementById('passwords');
	var pass=password.value;
	
	var firstname=document.getElementById('fname');
	var first=firstname.value;
	var name = /^[a-zA-Z]+$/;
	
	var lastname=document.getElementById('lname');
	var last=lastname.value;
	
	
    if(!filter.test(email.value))
    {
    	alert("Enter valid Email");
    	return false;
    }
	
 	if(first.length==null ||!name.test(first))
 	{
 		alert("Enter Firstname which contains only alphabets ");
 		return false;
 		
 	}
 	
 	if(last.length==null || !name.test(last))
 	{
 		alert("Enter Lastname which contains only alphabets");
 		return false;
 		
 	}
 	
 	if(pass=="" || pass==null )
  	{
		 alert("Password never blank");
		 return false;
	}
 	
}

</script>

<style>
form{
	
	margin-top: 70px;
	margin-left: 450px;
}

td,th{
    padding: 10px;
    
}
table {
	
	background-color:#f2f2f2;
	border: 5px solid #f5e6ff;
	
}
body{
background-color: #e6ffff;
}

input[type=text], input[type=password],input[type=email]{
	width: 80%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
	font-weight: bold;
	background-color: 	 #ffffe6
}
input[type=submit],input[type=reset]
{
width: 40%;
}



</style>
<body>
<form action="UserRegistration" method="post">
	<!--  	<div class="container" >  -->

			<table >
			 <tr>
			 <td><td><h3>&nbsp   SignUp Page</h3></td></td>
			 </tr>
			 <tr>
			   <td><b> Email</b> </td>
			   <td><input type="email" id="emailid" placeholder="Enter Email ID" name="EmailId" required></td>
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
				<td><input type="password" id="passwords" placeholder="Enter Password" name="password" required></td>
			</tr>	 
			<tr><td><td><input type="submit" value="Submit" onclick="return validateuser()" class="btn btn-success btn-lg">
				<input type="reset"  value="Reset" class="btn btn-primary btn-lg"></td></td>
			</tr>
		</table>	
		
 <!--  		</div>  -->
	</form>

</body>
</html>