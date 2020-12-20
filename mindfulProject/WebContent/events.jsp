
<%@page import="java.util.ArrayList"%>      
<%@page import="mindfulProject.dao.EventDao"%>
<%@page import="mindfulProject.model.Events"%>
<%@page import="java.sql.Connection"%>
<%@page import="mindfulProject.dao.DBConnectionUtil"%>
<%@ page import="java.sql.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>



<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Events</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
	<link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
	<link href="home.css" rel="stylesheet">
	
</head>
<body class = "bg-dark">
<br>
  <p class="h1 text-center"  ><mark style="background-color: #5cd6d6; border-radius:10px;"><b>POPULAR GROUPS</b></mark>
  <small class="text-muted">UPCOMING EVENTS</small>
</p>

<section class="pricing py-5">
    <div class="container">
      <div class="row">
       
        <div class="card" style="width: 16rem;margin: 10px;">
  <img src="img/img1.jpg" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Beach cleanup with friends organized by Habitat friends</h5>
   <p><i class="fa fa-calendar-check" aria-hidden="true"></i> 13th August</p>
   <p><i class="fa fa-clock"></i>4.00pm-6pm</p>
   <p><i class="fa fa-users"></i> 12 seats</p>
   <h4><b>LKR 2000</b></h4>
  </div>
</div>
     
     <div class="card" style="width: 16rem;margin: 10px;">
  <img src="img/img2.jpg" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Hike with Friends organized by Habitat Friends</h5>
   <p><i class="fa fa-calendar-check" aria-hidden="true"></i> 13th August</p>
   <p><i class="fa fa-clock"></i> 4.00pm-6pm</p>
   <p><i class="fa fa-users"></i> 12 seats</p>
    <h4><b>FREE</b></h4>
  </div>
</div>
     
        <div class="card" style="width: 16rem;margin: 10px;">
  <img src="img/img3.jpg" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Charity event organized by Habitat Friends</h5>
   <p><i class="fa fa-calendar-check" aria-hidden="true"></i> 13th August</p>
   <p><i class="fa fa-clock"></i> 4.00pm-6pm</p>
   <p><i class="fa fa-users"></i> 12 seats</p>  
   <h4><b>LKR 2000</b></h4>
  </div>
</div>

   <div class="card" style="width: 16rem;margin: 10px;">
  <img src="img/img5.jpg" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Sports day organized by Habitat Friends</h5><br>
   <p><i class="fa fa-calendar-check" aria-hidden="true"></i> 13th August</p>
   <p><i class="fa fa-clock"></i> 4.00pm-6pm</p>
   <p><i class="fa fa-users"></i> 12 seats</p>
    <h4><b>FREE</b></h4>
  </div>
</div>
        </div>
        </div>

</section>  


</body>
</html>