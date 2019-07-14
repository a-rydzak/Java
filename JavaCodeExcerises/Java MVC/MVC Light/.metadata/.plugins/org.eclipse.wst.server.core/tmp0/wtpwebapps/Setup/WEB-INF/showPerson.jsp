<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>People Page</title>
</head>
<body>
    <p>
        <c:out value="${person.greeting()}"/>
    </p>
    
    <c:forEach var="person" items="${people}">
    	<h2><c:out value="${person.name}"/></h2>
	</c:forEach>
</body>
</html>