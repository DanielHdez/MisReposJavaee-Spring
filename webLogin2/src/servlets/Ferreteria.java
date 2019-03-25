package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.corba.se.pept.transport.Connection;

import Conector.Conector;
import datos.LogicaBD;

@WebServlet("/Ferreteria")
public class Ferreteria extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Ferreteria() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String n = request.getParameter("nombre");
		RequestDispatcher rd;

		HttpSession sesion = request.getSession(true);
		
		if (n==null && !sesion.isNew()) {
			n = (String) sesion.getAttribute("nombre");
		}
		
		if (n == null)
			rd = request.getRequestDispatcher("/login.jsp");
		else if (n.equals("Pepe") || n.equals("Juan")) {
			rd = request.getRequestDispatcher("/home.jsp");
			sesion.setAttribute("nombre", n); //Guardda el nombre en el atributo de sesion 			
		}
		else {
			rd = request.getRequestDispatcher("/denegado.jsp");
			sesion.invalidate();
		}
		
		rd.forward(request, response);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// L�gica de la conexi�n con la base de datos.
		ServletContext contextoAplicacion = this.getServletContext();
		//Conector lbd=new Conector( "jdbc:mysql://localhost:3306/FERRETERIA?serverTimezone=UTC","root", "curso");
		LogicaBD lbd= new LogicaBD();
		lbd.tablacliente();
		contextoAplicacion.setAttribute("miLogicaBD", lbd);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}