<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page session="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lab29</title>
</head>
<body>
<h1>Satish labs</h1>
<table align="right">
	<tr><td><h1>
	Total Visited: <%=application.getAttribute("TV") %>
	</h1></td></tr>
	<tr>
		<td><h1>
			Total Active: <%=application.getAttribute("TA") %>
		</h1></td>
	</tr>
</table><br/><br/>
<h1>You have logged out Successfully</h1>
<br/>
<br/>
<a href="index.jsp">Go to Index Page</a>
</body>
</html>