<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<p>
		<%
			if (session.getAttribute("usuario") != null) {
				out.println("Bienvenido: " + session.getAttribute("usuario"));
			}
		%>
	</p>
	<p>
		<%
			out.println("Idioma en la cookie: " + session.getValue("idioma"));
		Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			Cookie cookieActual = cookies[i];
			String identificador = cookieActual.getName();
			String valor = cookieActual.getValue();
			if (identificador.equals("usuario")) {
				out.println(cookieActual.getValue() );
			}
		}
		%>
	</p>
</body>
</html>