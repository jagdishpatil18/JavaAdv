<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginPage</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<script >
function validatelogin()
{

    var email = document.getElementById('emailid');
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    
    var password=document.getElementById('passwords');
	var pass=password.value;
	
    if(!filter.test(email.value))
    {
    	alert("Enter valid Email");
    	return false;
    }



	
 	if(pass=="" || pass==null )
  	{
		 alert("Enter Password correctly");
		 return false;
	}	 
 	
}
</script>
<style >
input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
	background-color: 	 #ffffe6;
	font-weight: bold;
	border-color: #9CF4F7;
}

form{
margin-top: 150px;
margin-left: 450px;
}
td,th{
    padding: 14px;
}
table{
	
	border: 5px solid  #f5e6ff;
	background-color: #f2f2f2
;
	
}
body{
background-color:  #e6ffff;
}
input[type=submit]
{
width: 40%;

}
</style>

<body >

<form action="LoginServlet" method="Post"> 

<div>
<table >
 <tr>
			 <td><td><h3>&nbsp &nbsp  Login Page</h3></td></td>
			 </tr>
<tr>
<td><b>Email:</b></td><td><input type="text" id="emailid" name="email" placeholder="Enter Email" ></td>
</tr>
<tr>  
<td><b>Password:</b></td><td><input type="password" id="passwords"name="password" placeholder="Enter Passowrd" ></td>
</tr>
<tr>  
<td><td><input type="submit" value="Login" onclick="return validatelogin()"  class="btn btn-success btn-lg" >
<!-- <input type="signup" value="SignUp" formaction="UserRegistration.jsp" class="btn btn-primary btn-lg"></td></td> -->
<button   formaction="UserRegistration.jsp" class="btn btn-primary btn-lg">SignUp</button></td></td> 
</tr>
</table>
</div>
</form > 

</body>
</html>