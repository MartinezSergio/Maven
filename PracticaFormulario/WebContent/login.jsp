<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		session.setAttribute("usuario", null);
	%>
	<FORM NAME="FORM1" METHOD="POST" ACTION="ServletFormulario">
		<p>
			Usuario: <INPUT TYPE=text NAME="login" SIZE="25">
		</p>
		<p>
			Contrase�a: <INPUT TYPE=password NAME="contrase�a" SIZE="25">
		</p>
		<INPUT TYPE=SUBMIT VALUE="Iniciar sesion">
		<div>
			<select name="idioma">
				<option option selected value="0">Seleccione un idioma</option>
				<option value="Espa�ol">Espa�ol</option>
				<option value="Ingles">Ingles</option>
				<option value="Frances">Frances</option>
				<option value="Aleman">Aleman</option>
			</select>
		</div>
	</FORM>

</body>
</html>