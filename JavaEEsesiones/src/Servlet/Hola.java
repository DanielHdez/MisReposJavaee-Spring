package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Hola
 */
@WebServlet("/Hola")
public class Hola extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hola() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion=request.getSession();
		PrintWriter salida=response.getWriter();
		salida.append(sesion.getId()+"\n");
		
		Integer cont=(Integer) sesion.getAttribute("contador"); //Si el contador no existe devuelve null y si existe  devuelve otro valor
		if(cont==null) {
			cont=1;
		}else {
			cont++;
		}
		sesion.setAttribute("contador",cont); //Le damos al atributo un nombre y le asignamos un object
		
		
		salida.append(sesion.getAttribute("contador").toString());
		/*if(cont==10) {
			sesion.invalidate();
		}*/
		if(cont==10) {
			response.sendError(HttpServletResponse.SC_CONFLICT, "Fuera");
			sesion.invalidate();
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Cookie cookie1=new Cookie("Cookie1","Cookie-Una");
		Cookie cookie2=new Cookie("Cookie2","Cookie-Dos");
		cookie1.setMaxAge(3600); // Una hora
		cookie2.setMaxAge(3600);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
