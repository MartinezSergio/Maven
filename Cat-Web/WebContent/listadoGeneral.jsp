<%@page import="es.indra.categorias.beans.Categoria"%>
<%@page import="java.util.list"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>

		<%
			List<Categoria> todas = (List<Categoria>) request.getAttribute("listadoGeneral");
			for (Categoria cats : todas) {
		%>

		<tr>
			<td></td>
			<td><%=cats.getId()%></td>
			<td><%=cats.getNombre()%></td>
		</tr>


		<%
			}
		%>

		<c:forEach var="i" begin="1" end="5">
			<tr>
				<td><c:out value="${i}" /></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>