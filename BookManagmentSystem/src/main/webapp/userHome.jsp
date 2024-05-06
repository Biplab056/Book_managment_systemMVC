<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
  .bg-custom{
 background-color: rgb(73, 120, 196); 
}
</style>

</head>


<body>

<nav class="navbar navbar-expand-lg navbar-dark  bg-custom">
  <div class="container-fluid">
  
   <a class="navbar-brand" href="#"> <i class="fa-solid fa-book-open"></i> BookManagmentSystem</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
        <li class="nav-item me-5">
          <a class="nav-link active" aria-current="page" href="Landing.jsp"><i class="fa-solid fa-house"></i> Home</a>
        </li>
        <li class="nav-item me-5">
          <a class="nav-link" href="displayBookUser">Books</a>
        </li>
     
         <li class="nav-item me-5">
          <a class="nav-link" href="Landing.jsp">Logout</a>
        </li>
       
      </ul>
      
    </div>
  </div>
</nav>
</body>
</html>