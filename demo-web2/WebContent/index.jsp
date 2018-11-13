<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Ejemplo :: Mi primera página</title>
</head>
<%@include file = "header.jsp" %>
<body>
	<div>
		<h1>Ejemplo 1 : Probando contenido</h1>
		<p>Esto es una prueba</p>
		<%@include file = "formulario.jsp" %>
	</div>
</body>
<%@include file = "footer.jsp" %>

</html>