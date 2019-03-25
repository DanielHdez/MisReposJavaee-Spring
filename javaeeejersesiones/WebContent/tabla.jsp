<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<title>Tabla de Multiplicar</title>
</head>
<body>
<%
/*tabla.jps: por medio de un formulario permite introducir un número que será enviado al servlet Tabla que
generará una página dinámica para mostrar la tabla de multiplicar del número introducido.*/


%>

<form action="Tabla" method="post">
		<fieldset><legend>Tabla de Multiplicar</legend>
		   <p>Que tabla quieres realizar <input type="text" name="numero" required/></p>
		 </fieldset>
		<fieldset>
		<legend></legend>
		<p>Enviar</p>
		<p><input type="submit" value="Enviar"/></p>
		</fieldset>
	</form>
	
	<div id="resultado"></div>

</body>
</html>