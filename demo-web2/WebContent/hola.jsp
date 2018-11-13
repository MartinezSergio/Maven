<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%!String nombre;%>
<%
	nombre = request.getParameter("NOM");
%>
<title>Saludo</title>
</head>
<body>
	<p>Hola:
		<%=request.getParameter("NOM")%></p>
</body>
</html>