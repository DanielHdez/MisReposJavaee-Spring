<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
 <script type="text/javascript" src="js/script.js"></script>
<title>Alquiler de vivienda</title>
</head>
<body>
<h1>Formulario de Alquiler de Vivienda:</h1>
<form method="get" >
  <fieldset>
  	<legend>Alquila tu vivienda</legend>
  <fieldset>
	  <legend>Elige la zona donde alquilar tu vivienda</legend>
	  <select name="ciudad">
		  <option value="leganes" >Leganes (20 &euro;/m2)</option>
		  <option value="fuenlabrada">Fuenlabrada (15€/m2)</option>
		  <option value="mostoles" selected>Mostoles (14 €/m2)</option>
		  <option value="alcorcon">Alcorcon (21€/m2)</option>
	  </select>
	
	<!--   <input type="checkbox" name="leganes" > Leganes
	  <input type="checkbox" name="fuenlabrada" value="">Fuenlabrada
	  <input type="checkbox" name="mostoles" value="" checked>Móstoles
	  <input type="checkbox" name="alcorcon" value="" checked>Alcorcon <br>
 	  -->
 	   Metros Cuadrados <input type="number" name="metros" value="0" required> 
  </fieldset>
  <fieldset>
	  <legend>Extras</legend>
	  <input type="checkbox" name="calefaccion"> Calefacciòn
	  <input type="checkbox" name="piscina" >Piscina
	  <input type="checkbox" name="ac">Aire Acondicionado
  </fieldset>
   <fieldset>
	  <legend>Estas empleado</legend>
	  <input type="radio" name="empleado" value="siempleado" checked> Sí
	  <input type="radio" name="empleado" value="noempleado">No
  </fieldset>
    
  </fieldset>
	  <input type="submit" onclick="llamadaAjax()" value="Comprobar">
</form>
	  
  <%!
	  	
  		String leganes,fuenlabrada,mostoles,alcorcon,calefa,piscina,ac,empleado, ciudad,html;
		double precioalquiler;
		int metro=0;
	%><%
		ciudad=request.getParameter("ciudad");
		calefa=request.getParameter("calefaccion");
		piscina=request.getParameter("piscina");
		ac=request.getParameter("ac");
		empleado=request.getParameter("empleado");
		
		if(ciudad!=null){
		if(ciudad.equals("leganes")) {
			precioalquiler =20;
		}else if(ciudad.equals("fuenlabrada")) {
			precioalquiler=15;
		}else if(ciudad.equals("mostoles")) {
			precioalquiler=14;
		}else {
			precioalquiler=21;
		}
		}
		System.out.println("El predcio que da la ciudad es de "+precioalquiler);
		if(calefa!=null) {
			precioalquiler=precioalquiler*1.03;
		}
		if (piscina!=null) {
			precioalquiler=precioalquiler*1.03;
		}
		if(ac!=null) {
			precioalquiler=precioalquiler*1.03;
		}
		if(empleado!=null) {
			if (empleado.equals("noempleado")) {
				precioalquiler=precioalquiler*0.96;
			}
		}
		
		if(request.getParameter("metros")!=null){
			 metro=Integer.parseInt(request.getParameter("metros"));
		}else {
			metro=0;
		}
		System.out.println("El precio total es de "+precioalquiler);
		System.out.println("El precio total es de "+precioalquiler*metro);
		precioalquiler=precioalquiler*metro;
%>
	  
	  <div id="precio"><h1>El precio del alquiler es de  "<%= precioalquiler%>"  euros</h1></div>
</body>
</html>