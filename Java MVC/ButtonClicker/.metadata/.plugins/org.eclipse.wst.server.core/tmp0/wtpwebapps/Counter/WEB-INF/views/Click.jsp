<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Button Clicker</h1>
	<p>Click the button!</p>
	<h1>Clicked <c:out value="${count}"/> times!</h1>
	<a href="/Counter/Click"><button>Click!</button></a>
</body>
</html>