<%@ page import="javax.persistence.*" %>
<%@ page import="com.prueba.webmaven.*" %>
<%@ page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de ventas</title>

</head>
<body>
<%
	EntityManagerFactory factory;
	EntityManager em;
	String resultado="";
	List<Detalle> detalles=null;
	try {
		factory = Persistence.createEntityManagerFactory("webmaven");
		em = factory.createEntityManager();
		TypedQuery<Detalle> query = em.createQuery("SELECT d FROM Detalle d", Detalle.class);
		detalles = query.getResultList();
	} catch (Exception e) {
		resultado = "Error obteniendo el EntityManager<br/>" + e.getMessage();
	}
	
	for (Detalle d : detalles) {
%>
	<p>
	<%=d.getProducto().getCodigo() %> -
	<%=d.getProducto().getDescripcion() %> -
	<%=d.getPrecio()*d.getUnidades() %>
	</p>
<%
	}
%>

<a href="resumen.jsp">Resumen de ventas</a>
</body>
</html>