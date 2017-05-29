<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EmployeePortal</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" 
	crossorigin="anonymous">
<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/redmond/jquery-ui.css' rel='stylesheet' type='text/css'/">	
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script>
<script type="text/javascript">

/* 
$(document).ready(function () 
{
	$('.eli').click(function () 
			{
		      var myid=$(this).attr('id');
		      console.log(myid,'hellllo');
		
		$('<div ><div >Hello<div></div>').dialog({modal: true, height: 400, width: 400 });
			});
	    
}); */

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
.tableemp {
	
	border: 5px solid #f5e6ff;
	background-color:#f2f2f2 ;
	height: 687px;
    padding-left: 71px;
    background-color: #f0f5f5;
    width: 601px;
   
    
}
td {

    padding-left: 30px!important;
}
ul{
top:0;
width:100%;
position:fixed;
}

#ename,#num,#num1,#cname,#specializeU,#languageU{
	width: 350px;
	padding: 10px 20px;
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

 .body{
background-color:#e6ffff; 

} 

h4{

color: black;
font-size: 20px;

}

.hul{
margin-top:-10px;
margin-left:0px;
margin-right:-10px;
height:80px;
background-color: #b3ffff;

}
.hli{
padding-top:25px;
display: block;
display:inline-block;
}
/* #logout{
padding-right: 30px;
padding-top: 30px;
} */
#button1
{
  background-color:	 #e6ffff; 
}

#hlogout{
padding-top:10px;
padding-left:20px;
padding-bottom:10px;
padding-right:60px;

}


.tablelog{
	border: 5px solid  #f5e6ff;
	background-color: #f0f5f5;
}
#emailid, #passwords {
	width: 100%;
	padding: 12px 10px;
	margin: 4px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
	background-color: 	 #ffffe6;
	font-weight: bold;
	border-color: #9CF4F7;
}
#sublog
{
width: 40%;

}
.formlogin{
margin-top: 100px;
margin-left: 450px;
}

td{
   padding: 14px;
}

/* userregisrtn */

.user{
	
	margin-top: 50px;
	margin-left: 450px;
}

.usertbl {
	
	background-color:#f2f2f2;
	border: 5px solid #f5e6ff;
	
}
#emailid1,#password1,#fname,#lname{
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
/*  style for empdetails namelist */
.eul{  
		list-style-type: none; 
		margin-top:100px; 
		padding: 10px;
	    
}
.eli{ 
			display: block;
			padding-top:7px;
			padding-bottom:7px; 
			 text-align:center;    
		    margin-left:200px;
		    width: 200px; 
		    background-color: #dddddd;
		    
}
.ecli{ 
			display: block; 
			     
		    margin-left:200px;
		    width: 200px; 
		    background-color: #b3ffff;
			padding-bottom: 10px;   
			padding-top: 10px;
			font-size: 20px;
			text-align: center;
}


</style>
</head>
<body class="body">
<div class="navbar">
<ul class="hul">
<li class="hli"><h4><i><strong>EmployeePortal</strong></i></h4></li>
<% if(session.getAttribute("userid")!=null) { %>
<!-- <li id="logout" style="float: right "><button id="button1">Logout</button></li> -->
<li class="hli" style="float: right "><form action="Logout" method="post"  class="logout">
<input id="hlogout" type="submit" value="Logout" class="btn btn-primary"> 
</form></li>
<li class="hli"><a href="EmployeeDetails" style="padding-left: 30px">EmployeeDetails</a><br></li>
<li class="hli"><a href="Employee" style = "padding-left: 50px">EmployeeRegistration</a><br></li>

<% } %>

</ul>
</div>


