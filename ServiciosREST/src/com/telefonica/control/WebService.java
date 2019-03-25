package com.telefonica.control;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PathParam;

import com.telefonica.modelo.Mensaje;

@Path("mensaje") //Invoacion. como se accede a este servicio la ruta dentro de el proyecto url/proyecto/mensaje entraría aqui
public class WebService {

	@GET  //Atiende peticiones de tipo get
	@Path("men1")
	@Produces({"text/plain"}) //indica el formato 
	public String mostrarMensaje() {
		Mensaje msg = new Mensaje("Hola amigo");
		return msg.getTexto();
	}
	
	@GET
	@Path("men2/{nombre}")
	@Produces({"text/html"})
	public String mostrarMensaje(@PathParam("nombre") String nom) {
				Mensaje msg = new Mensaje("Hola " + nom);
				String html = "<!DOCTYPE html>";
				html = html + "<html>";
				html = html + "<head>";
				html = html + "<title>Mi primer servicio web REST</title>";
				html = html + "</head>";
				html = html + "<body style='background-color: aqua'>";
				html = html + "<h1>" + msg.getTexto() + "</h1>";
				html = html + "</body>";	
				html = html + "</html>";	
				
				return html;
			}
		

	@GET
	@Path("men3")
	@Produces({"text/html"})
	//Lo lamos como http://localhost:8080/ServiciosREST/mensaje/men3?nombre=dan
	public String mostrarMensaje2(@QueryParam("nombre") String nom) {
		Mensaje msg = new Mensaje("Hola " + nom);
		String html = "<!DOCTYPE html>";
		html = html + "<html>";
		html = html + "<head>";
		html = html + "<title>Mi primer servicio web REST</title>";
		html = html + "</head>";
		html = html + "<body style='background-color: aqua'>";
		html = html + "<h1>" + msg.getTexto() + "</h1>";
		//html = html + "<h2>" + msg.getPeticiones() + "</h2>";
		html = html + "</body>";	
		html = html + "</html>";	
		
		return html;
	}

	
	
	}
	


	
	
	
	
	
	


