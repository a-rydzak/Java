<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
    </head>
<body>
    <!-- this is a declaration tag for methods -->
    <%! 
    public int add(int a, int b) {
        return a + b;
    }
    %>
    
    <!-- this is a tag for any java code -->
    <% 
    int i = 2;
    int j = 4;
    %>
    <!-- shortcut to output whatever returns from our method call %> -->
    <h3><%= add(i, j) %></h3>
    <!-- for loops work as well! -->
    <% for(int index = 0; index < 5; index++) { %>
        <h1><%= index %></h1>
    <% } %>
    <!-- here we have to import the Date class. You will put the import in the first line of the jsp tag. Use the import attribute -->
    <p>The time is: <%= new Date() %></p>
</body>
</html>






















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
    <h1>Checkerboard </h1>
    <div id="container">
     <% for(int row = 1; row <= (Integer) request.getAttribute("height"); row++) { %>
     <div class="row">   <% for(int index = 1; index <= (Integer) request.getAttribute("width"); index++) { %>
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