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
	List<Object[]> detalles=null;
	try {
		factory = Persistence.createEntityManagerFactory("webmaven");
		em = factory.createEntityManager();
		TypedQuery<Object[]> query = em.createQuery("SELECT d.producto.descripcion, sum(d.unidades*d.precio) FROM Detalle d GROUP BY d.producto.descripcion", Object[].class);
		detalles = query.getResultList();
	} catch (Exception e) {
		resultado = "Error obteniendo el EntityManager<br/>" + e.getMessage();
	}
	
	for (Object[] d : detalles) {
%>
	<p>
	<%=d[0] %> -
	<%=d[1] %>
	
	</p>
<%
	}
%>
</body>
</html>