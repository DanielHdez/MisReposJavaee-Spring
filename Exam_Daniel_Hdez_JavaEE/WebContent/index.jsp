<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/estilo.css">
<title>Proyecto de JAVAEE</title>
</head>
<body>
	<h1>Exámen Daniel Hernández</h1>
	<h2>El id de la sesion es <%=session.getId()%></h2>
	<div id="ini">
	<p><a href="tabla.jsp"> Tabla de multiplicar  </a></p>
	<a href="circunferencia.jsp"> Circunferencia </a>
	</div>
</body>
</html>