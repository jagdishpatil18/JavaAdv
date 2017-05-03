<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginPage</title>
</head>
<style>
input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

.div {
	border: 5px solid #b3ffff;
	background-color: #b3ffff;
	width: 400px;
	height: 300px;
	margin-left: 450px;
	margin-top: 150px;
	border-radius: 10px;
}
form{
margin-top: 200px;
margin-left: 500px;
}

table{
	padding-top:40px;
	padding-bottom:40px;
    padding-left:20px;
    padding-right:20px;
	border: 10px solid #e6ffff;
	margin:10px;
	
}
button{
width: 35%;
height:100%;
background-color: green;
}

input[type=submit]
{
width: 100%;
height:100%;
background-color:#b3ffff;
}


</style>
<body>
<form action="LoginServlet" method="Post"> 

<div>
<table >
 
<tr>
<td><b>Email:</b></td><td><input type="text" name="email" placeholder="Enter Email" ></td>
</tr>
<tr>  
<td><b>Password:</b></td><td><input type="password" name="password" placeholder="Enter Passowrd" ></td>
</tr>
<tr>  
<td><td><br></br><input type="submit" value="Login" style="width: 70px; ">
<button   formaction="UserRegistration.jsp">SignUp</button></td></td>
</tr>
</table>
</div>
</form > 

</body>
</html>