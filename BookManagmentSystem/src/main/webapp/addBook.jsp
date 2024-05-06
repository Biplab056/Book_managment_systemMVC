<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	
<div class="container p-5 ">
	<div class="row">		
		</div class="col-md-4 offset-md-4">
			<div class="card paint-card">
				<div class="card-body">
						<p class="fs-4 text-center">Book Registration</p>
						
						 
						  
<form:form action="savebook" modelAttribute="book">
 <div class="mb-3">
    <form:label for="exampleInputName1"  path="book_name" class="form-label">Book Name</form:label>
    <form:input type="text" path="book_name" class="form-control" id="exampleInputName1"/>
  </div>
  
  <div class="mb-3">
    <form:label for="exampleInputName1"  path="authur" class="form-label">Authur </form:label>
    <form:input type="text" path="authur" class="form-control" id="exampleInputName1"/>
  </div>
  
  <div class="mb-3">
    <form:label for="exampleInputName1"  path="publication_date" class="form-label">Date Of publication</form:label>
    <form:input type="text" path="publication_date" class="form-control"  id="exampleInputName1"/>
  </div>
  
  <div class="mb-3"  >
  <form:label for="exampleFormControlTextarea1" path="description" class="form-label">Description</form:label>
  <form:textarea class="form-control" path="description" id="exampleFormControlTextarea1" rows="6" cols="50"	></form:textarea>
</div>
  
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-custom btn-dark">Register Book</button>
</form:form>


				</div>	
			</div>			
	    <div>
	</div> 
</div>



</body>
</html>