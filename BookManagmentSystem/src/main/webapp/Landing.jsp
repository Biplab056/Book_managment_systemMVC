<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Landing page</title>
<%@include file="component/allcss.jsp" %>

<style type="text/css">
.cont{
 display: flex;
    align-items: center;
    justify-content: center;
    background-color: rgb(73, 120, 196); 
    position: fixed;
    top: 30%;
    left: 50%;
    transform: translate(-50%, -50%);
    width: 80%; 
    padding: 20px;
    color:white;
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
          <a class="nav-link" href="Adminlogin"><i class="fa-solid fa-user-plus"></i> Admin</a>
         
        </li>
         <li class="nav-item me-5">
  
            <a class="nav-link" href="userlogin"><i class="fa-solid fa-user-plus"></i> User</a>
        </li>
            
      </ul>
      
    </div>
  </div>
</nav>
<div class="cont">

<h1>WELCOME TO BOOK MANAGMENT SYSTEM</h1>
</div>
</html>