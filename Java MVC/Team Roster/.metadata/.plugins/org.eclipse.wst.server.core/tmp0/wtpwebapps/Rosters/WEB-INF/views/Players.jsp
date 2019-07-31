<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Team</title>
<style><%@include file="/WEB-INF/css/Players.css"%></style>
</head>
<body>
	<div>
		<h1>Add A New Player!</h1>
	</div>
	<div id="teamsDisplay">
		<table class="pure-table-striped">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${team.getPlayers()}" var="player">
			    <tr>      
			        <td>${player.getFirstName()}</td>
			        <td>${player.getLastName()}</td>
			        <td>${player.getAge()}</td>
			        <td><a href="Roster/DeletePlayer?id=${player.getId()}"> Delete</a></td>
			    </tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<div id="NewPlayerContainer">
	      <form name="NewTeam" method="POST" action="Players?id=${team.getId()}">
	         <input type="text" name="FirstName" required>
	         <br>
	         <input type="text" name="lastName" required>
	         <br>
	         <input type="number" name="Age" required>
	         <br>
	         <input type = "submit" value = "Create" />
	      </form>	
	</div>
</body>
</html>