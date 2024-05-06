<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored ="false"%>
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
						<p class="fs-4 text-center">Book Details</p>
						
						 
						  
<table class="table table-striped table-info">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Book_Name</th>
      <th scope="col">Authur</th> 
      <th scope="col">Date_Of_Publication</th> 
      <th scope="col">Description</th> 
      
    </tr>
  </thead>
  
  <tbody>
  <c:forEach items ="${book}" var="booklist">
	 <tr>
	 
             <td>${booklist.id}</td>
             <td>${booklist.book_name}</td>
             <td>${booklist.authur}</td>
             <td>${booklist.publication_date}</td>
             <td><div  style="width: 300px; word-wrap: break-word;">${booklist.description}</div></td>
            
                   
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