package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.SecretKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

/**
 * Servlet implementation class Alquila
 */
@WebServlet("/Alquila")
public class Alquila extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     *
     */
	
	String leganes,fuenlabrada,mostoles,alcorcon,calefa,piscina,ac,empleado, ciudad,html;
	int metros;
	String a,b,c,d,e,f,g,h,i;
	double precioalquiler;

	private PrintWriter salida;
    public Alquila() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("El valor es "+request.getParameter("leganes"));
		System.out.println(request.getParameter("empleado"));
		/*leganes=request.getParameter("leganes");
	    //fuenlabrada=request.getParameter("fuenlabrada");
		//mostoles=request.getParameter("mostoles");
		//alcorcon=request.getParameter("alcorcon");*/
		ciudad=request.getParameter("ciudad");
		calefa=request.getParameter("calefaccion");
		piscina=request.getParameter("piscina");
		ac=request.getParameter("ac");
		empleado=request.getParameter("empleado");
		
		metros=Integer.parseInt(request.getParameter("metros"));
		
		if(ciudad.equals("leganes")) {
			precioalquiler =20;
			f="selected";
		}else if(ciudad.equals("fuenlabrada")) {
			precioalquiler=15;
			g="selected";
		}else if(ciudad.equals("mostoles")) {
			precioalquiler=14;
			h="selected";
		}else {
			precioalquiler=21;
			i="selected";
		}
		System.out.println(precioalquiler);
		if(calefa!=null) {
			precioalquiler=precioalquiler*1.03;
		    a="checked";
		}
		if (piscina!=null) {
			precioalquiler=precioalquiler*1.03;
			b="checked";
		}
		if(ac!=null) {
			precioalquiler=precioalquiler*1.03;
			c="checked";
		}
		if(empleado!=null) {
		
			if (empleado.equals("noempleado")) {
				precioalquiler=precioalquiler*0.96;
				e="checked";
			}else if(empleado.equals("siempleado")){
				d="checked";	
			}
			
			System.out.println(empleado);
			
			System.out.print(d);
		}
		
		
		precioalquiler=precioalquiler*metros;
		
		salida = response.getWriter();
		html="<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Alquiler de vivienda</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<h1>Formulario de Alquiler de Vivienda:</h1>\r\n" + 
				"\r\n" + 
				"<form action=\"Alquila\" method=\"get\">\r\n" + 
				"  <fieldset>\r\n" + 
				"  	<legend>Alquila tu vivienda</legend>\r\n" + 
				"  <fieldset>\r\n" + 
				"	  <legend>Elige la zona donde alquilar tu vivienda</legend>\r\n" + 
				"	  <select name=\"ciudad\">\r\n" + 
				"		  <option value=\"leganes\" "+f+">Leganes (20&euro;/m2)</option>\r\n" + 
				"		  <option value=\"fuenlabrada\" "+g+">Fuenlabrada (15&euro;/m2</option>\r\n" + 
				"		  <option value=\"mostoles\" "+h+">Mostoles (14&euro;/m2)</option>\r\n" + 
				"		  <option value=\"alcorcon\" "+i+">Alcorcon (21&euro;/m2)</option>\r\n" + 
				"	  </select>\r\n" + 
				"	  \r\n" + 
				"	  \r\n" + 
				"	<!--   <input type=\"checkbox\" name=\"leganes\" "+f+" > Leganes\r\n" + 
				"	  <input type=\"checkbox\" name=\"fuenlabrada\" value=\"\" "+g+">Fuenlabrada\r\n" + 
				"	  <input type=\"checkbox\" name=\"mostoles\" value=\"\" "+h+">Móstoles\r\n" + 
				"	  <input type=\"checkbox\" name=\"alcorcon\" value=\"\" "+i+">Alcorcon <br>\r\n" + 
				" 	  -->\r\n" + 
				" 	   Metros Cuadrados <input type=\"number\" name=\"metros\" value="+metros+"  required> \r\n" + 
				"  </fieldset>\r\n" + 
				"  <fieldset>\r\n" + 
				"	  <legend>Extras</legend>\r\n" + 
				"	  <input type=\"checkbox\" "+a+" name=\"calefaccion\" > Calefacciòn\r\n" + 
				"	  <input type=\"checkbox\" "+b+" name=\"piscina\">Piscina\r\n" + 
				"	  <input type=\"checkbox\" "+c+" name=\"ac\" >Aire Acondicionado\r\n" + 
				"  </fieldset>\r\n" + 
				"   <fieldset>\r\n" + 
				"	  <legend>Estas empleado</legend>\r\n" + 
				"	  <input type=\"radio\" name=\"empleado\" value=\"siempleado\" " +d+"> Sí\r\n" + 
				"	  <input type=\"radio\" name=\"empleado\" value=\"noempleado\" "+e+">No\r\n" + 
				"  </fieldset>\r\n" + 
				"    \r\n" + 
				"  </fieldset>\r\n" + 
				"	  <input type=\"submit\" value=\"Submit\">\r\n" + 
				"<h1>"+Math.round(precioalquiler)+"&euro;</h1>"+
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</form>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>";
		
		salida.append(html);
		a="";
		b="";
	    c="";
	    d="";
	    e="";
	    f="";
	    g="";
	    h="";
	    i="";
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
