

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hola
 */
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
		PrintWriter salida=response.getWriter();
		String texto="<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\'ISO-8859-1\'>\r\n" + 
				"<title>El perro del hortelano</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h1>Hola Mundo desde el servlet qu es el primero</h1>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>";
		
		salida.append(texto);

	/*	salida.append("<!DOCTYPE html>");
		salida.append("<html>");
		salida.append("<head>");
		salida.append("<meta charset='UTF-8'>");
		salida.append("<title>Servlet HolaMundo</title>");
		salida.append("</head>");
		salida.append("<body>");
		salida.append("<h1>Hola Mundo desde el servlet</h1>");
		salida.append("</body>");
		salida.append("</html>");*/

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
