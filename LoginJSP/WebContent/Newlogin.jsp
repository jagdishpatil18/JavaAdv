<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">





<%@ include file = "Header.jsp" %>
<% if((Integer) session.getAttribute("userid")==null) {%>
<form action="LoginServlet" method="Post" class="formlogin"> 

<div>
<table class="tablelog">
 <tr>
			 <td><td><h3>  Login Page</h3></td></td>
			 </tr>
<tr>
<td><b>EmailId :</b></td><td><input type="text" id="emailid" name="email" placeholder="Enter Email" ></td>
</tr>
<tr>  
<td><b>Password :</b></td><td><input type="password" id="passwords"name="password" placeholder="Enter Passowrd" ></td>
</tr>
<tr>  
<td><td><input id="sublog" type="submit" value="Login" onclick="return validatelogin()"  class="btn btn-success btn-lg" >
<!-- <input type="signup" value="SignUp" formaction="UserRegistration.jsp" class="btn btn-primary btn-lg"></td></td> -->
<button   formaction="Preuserreg" class="btn btn-primary btn-lg">SignUp</button></td></td> 
</tr>
</table>
</div>
</form > 
<% }else{ response.sendRedirect("Employee");} %>

</body>
</html>