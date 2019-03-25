<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Circunferencia</title>
<link rel="stylesheet" type="text/css" href="css/estilo.css">
</head>
<body>
<h2>El id de la sesion es<%=session.getId()%></h2>
<form action="longarea.jsp" method="post">
		<fieldset><legend>Área y Perimetro de la circunferencia</legend>
		   <p>Introduce el radio de la circunferencia en metros:<input type="text" name="numero" required/></p>
		 </fieldset>
		<fieldset>
		<legend></legend>
		<p>Enviar</p>
		<p><input type="submit" value="Calcular"/></p>
		</fieldset>
	</form>
	
	

</body>
</html>