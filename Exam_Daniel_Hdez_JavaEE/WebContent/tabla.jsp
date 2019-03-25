<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/estilo.css">
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<title>Tabla de Multiplicar</title>
</head>
<body>
<%
/*tabla.jps: por medio de un formulario permite introducir un número que será enviado al servlet Tabla que
generará una página dinámica para mostrar la tabla de multiplicar del número introducido.*/


%>
<h2>El id de la sesion es <%=session.getId()%></h2>
<form >
		<fieldset><legend>Tabla de Multiplicar</legend>
		   <p>
		<label for="numero">Introduce el numero para la tabla:</label>
		<input type="number" id="numero" />
		</p>
		 </fieldset>
		<fieldset>
		<legend></legend>
		<p><center><input type="button" id="comprobar" value="Calcular"></center></p>
		</fieldset>
	</form>
	
		<div id="resultado"></div>

</body>
</html>