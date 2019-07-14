<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Make A Pet Here</title>
	<style><%@include file="/WEB-INF/css/Home.css"%></style>
</head>
<body>

	<div id="container">
	
		<div class="petForm">
			<h3>Make A Cat</h3>
		      <form name="catsForm" method="post" action="Cats">
		         Name: <input type = "text" name = "name">
		         <br />
		         Breed: <input type = "text" name = "breed" >
		         <br />
		         Weight: <input type="number" name="weight">
		         <br />
		         <input type = "submit" value = "Make Your Pet!" />
		      </form>	
		</div>
		
		<div class="petForm">
			<h3>Make A Dog</h3>
		      <form name="dogsForm" method="post" action="Dogs">
		         Name: <input type = "text" name = "name">
		         <br />
		         Breed: <input type = "text" name = "breed" >
		         <br />
		         Weight: <input type="number" name="weight">
		         <br />
		         <input type = "submit" value = "Make Your Pet!" />
		      </form>			
		</div>
	
	</div>

</body>
</html>