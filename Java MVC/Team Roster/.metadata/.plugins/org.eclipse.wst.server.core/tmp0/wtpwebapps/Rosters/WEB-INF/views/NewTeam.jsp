<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Team</title>
<style><%@include file="/WEB-INF/css/NewTeam.css"%></style>
</head>
<body>
	<div>
		<h1>Make A New Team!</h1>
	</div>

	<div id="NewTeamContainer">
	      <form name="NewTeam" method="POST" action="NewTeam">
	         <input type="text" name="TeamName" required>
	         <br>
	         <input type = "submit" value = "Create" />
	      </form>	
	</div>
</body>
</html>