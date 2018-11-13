<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page isErrorPage="true"%>
<html>
<head>
<title>Show Error Page</title>
</head>
<%@include file="header.jsp"%>
<body>
	<h1>Opps...</h1>
	<p>Sorry, an error occurred.</p>
	<p>Here is the exception stack trace:</p>
	<%
		exception.printStackTrace(response.getWriter());
	%>
</body>
<%@include file="footer.jsp"%>
</html>
