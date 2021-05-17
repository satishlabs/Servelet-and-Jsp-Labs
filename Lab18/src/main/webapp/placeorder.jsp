<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lab18</title>
</head>
<body>
	<center>
		<h1>Satish Book Store</h1>
		<h2>Book Search</h2>
		<h1>Your order has placed successfully!</h1>
		<%
		session.invalidate();
		%>
		<br /> <a href="index.jsp">GO TO SEARCH PAGE</a>
	</center>
</body>
</html>