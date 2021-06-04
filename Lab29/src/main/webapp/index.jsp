<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lab29</title>
</head>
<body>
<h1>Satish Labs</h1>
<table align="right">
	<tr>
	<td><h1>
		Total Visited: <%=application.getAttribute("TV") %>
	</h1></td>
	</tr>
	<tr>
		<td><h1>
			Total Active: <%=application.getAttribute("TA") %>
		</h1></td>
	</tr>
</table>
<br /><br />
<h1>This is Index Page </h1><br/><br/>
<a href="logout">Logout</a>
</body>
</html>