package com.telefonica.control;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.telefonica.modelo.Mensaje;


	

	@Path("mensaje2")
	public class WebService2 {

		@GET
		@Produces({"text/html"})
		public String mostrarMensaje2() {
			Mensaje msg = new Mensaje("Hola Amigo");
			String html = "<!DOCTYPE html>";
			html = html + "<html>";
			html = html + "<head>";
			html = html + "<title>Mi primer servicio web REST</title>";
			html = html + "</head>";
			html = html + "<body style='background-color: aqua'>";
			html = html + "<h1>" + msg.getTexto() + "</h1>";
			//html = html + "<h2>" + Mensaje.getPeticiones() + "</h2>";
			html = html + "</body>";	
			html = html + "</html>";	
			
			return html;
		}
	}

