package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hola
 */
@WebServlet(
		description = "dicehola", 
		urlPatterns = { "/Hola" }, 
		initParams = { 
				@WebInitParam(name = "Autor", value = "Daniel", description = "Esto es un programa de pruebas")
		})
public class Hola extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static String nombreautor;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hola() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		nombreautor=config.getInitParameter("Autor");

		System.out.println("init");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida=response.getWriter();
		salida.append("<!DOCTYPE html>");
		salida.append("<html>");
		salida.append("<head>");
		salida.append("<meta charset='UTF-8'>");
		salida.append("<title>Servlet HolaMundo</title>");
		salida.append("</head>");
		salida.append("<h1>Autor: "+nombreautor+" </h1>");
		salida.append("<body>");
		salida.append("<h1>Hola Mundo desde el servlet</h1>");
		salida.append("</body>");
		salida.append("</html>");

		System.out.println("doget");

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
