<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored ="false"%>
    
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
     
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
</style>
</head>


<body>
<%@include file="component/userHead.jsp" %>
	
<div class="container p-5">
	<div class="row">		
		</div class="col-md-4 offset-md-4">
			<div class="card paint-card">
				<div class="card-body">
						<p class="fs-4 text-center">User Details</p>
						
						 
						  
<table class="table table-striped table-light">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th> 
       <th scope="col">DELETE</th> 
    </tr>
  </thead>
  
  <tbody>
  <c:forEach items ="${user}" var="userlist">
	 <tr>
	 
             <td>${userlist.id}</td>
             <td>${userlist.name}</td>
             <td>${userlist.email}</td>
             <td>
             
              <a href="deleteUser?id=${userlist.id}" class="btn btn-sm btn-danger">Delete</a>
             
             </td>
                   
    </tr>
	</c:forEach>
    
  </tbody>
</table>

				</div>	
			</div>			
	    <div>
	</div> 
</div>


</body>
</html>