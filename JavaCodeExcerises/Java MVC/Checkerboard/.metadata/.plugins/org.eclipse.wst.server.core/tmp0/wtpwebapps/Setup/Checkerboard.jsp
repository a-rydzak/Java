<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Checkerboard.css">
<title>Checkerboard App</title>
</head>
<body>
	<h1>Checkerboard <%=request.getAttribute("height")%>H x <%=request.getAttribute("width")%>W</h1>
	<div id="container">
	 <% for(int row = 1; row <= (Integer) request.getAttribute("height"); row++) { %>
	 <div class="row">	 <% for(int index = 1; index <= (Integer) request.getAttribute("width"); index++) { %>
	 	<% if(index % 2 == 0 && row % 2 == 0){ %>
	 		<div class="squareA"></div>
	 	<% } %>
	    <% if(index % 2 != 0 && row % 2 == 0){ %>
	 		<div class="squareA squareB"></div>
	 	<% } %>
	 	
	 	<% if(index % 2 == 0 && row % 2 != 0){ %>
	 		<div class="squareB squareA"></div>
	 	<% } %>
	    <% if(index % 2 != 0 && row % 2 != 0){ %>
	 		<div class="squareA"></div>
	 	<% } %>
    <% } %></div>
    <% } %>	
    </div>
    
	
</body>
</html>