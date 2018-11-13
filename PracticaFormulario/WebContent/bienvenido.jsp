<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<%
		if (session.getAttribute("usuario") != null) {
			out.println("Bienvenido: " + session.getAttribute("usuario"));
		}
	%>


</body>
</html>