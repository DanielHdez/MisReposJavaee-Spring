<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import= "java.text.DecimalFormat" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/estilo.css">
<title>Area y Longitud de la circunferencia</title>
</head>
<body>
<h2>El id de la sesion es  <%=session.getId()%></h2>
<% int numero;
   numero=Integer.parseInt(request.getParameter("numero"));
   DecimalFormat df = new DecimalFormat("#.00");
%>
<div id="circ">
<p>El perimetro de la circunferencia es  <%=df.format(2*Math.PI*numero) %> metros cuadrados </p>
<p>El Area de la circunferencia es <%=df.format(numero*numero*Math.PI) %> metros </p>
</div>
</body>
</html>