<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Page</title>
</head>
<body>
	<h1>This is SHOW JSP</h1>
	<%
	application.getAttribute("MSG");
	%>
	<br />
	<%
	Object obj = application.getAttribute("MyList");
	List<String> values = (List<String>) obj;
	for (String name : values) {
	%>
	<font color="red" />
	<br /><%=name%>
	<%
	}
	%>

</body>
</html>