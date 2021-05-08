<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is my index Page!</h1>
	<%
	application.setAttribute("MSG", "Satish Labs");
	List<String> list = new ArrayList<String>();
	list.add("Satish");
	list.add("Virat");
	application.setAttribute("MyList", list);
	%>
	<a href="show.jsp">SHOW DATA</a>
</body>
</html>