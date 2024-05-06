<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<%@include file="component/allcss.jsp" %>
<style>
  
  body {
  
    background-color: rgb(244, 244, 240 ) ;
  }
  .btn-custom{
   background-color: rgb(73, 120, 196); 
   
  }
</style>
</head>


<body>

<%@include file="component/adminHead.jsp" %>

	
<div class="container p-5">
	<div class="row">		
		</div class="col-md-4 offset-md-4">
			<div class="card paint-card">
				<div class="card-body">
						<p class="fs-4 text-center">Admin Login</p>
						
<form:form action="adminValidate" modelAttribute="admin">
  <div class="mb-3">
    <form:label for="exampleInputEmail1" path="email" class="form-label">Email address</form:label>
    <form:input type="email" path="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"/>
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <form:label for="exampleInputPassword1"  path="password" class="form-label">Password</form:label>
    <form:input type="password" path="password" class="form-control" id="exampleInputPassword1"/>
  </div>
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-custom btn-dark">Log In</button>
</form:form>
<p>Don't have account?<a href="AdminSignin">Register</a></P>
				</div>	
		
			</div>
					
	    <div>
	</div> 
</div>





</body>
</html>