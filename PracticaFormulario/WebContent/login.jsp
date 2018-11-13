<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% session.setAttribute("usuario", null); %>
	<FORM NAME="FORM1" METHOD="POST" ACTION="ServletFormulario">
		<p>
			Usuario: <INPUT TYPE=text NAME="login" SIZE="25">
		</p>
		<p>
			Contraseña: <INPUT TYPE=password NAME="contraseña" SIZE="25">
		</p>
		<INPUT TYPE=SUBMIT VALUE="Iniciar sesion">
	</FORM>
</body>
</html>