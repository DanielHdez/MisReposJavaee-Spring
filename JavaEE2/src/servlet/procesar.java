package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/procesar")
public class procesar extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public procesar() {
    	
    	
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("nombre");
		String edad=request.getParameter("edad");
		PrintWriter salida=response.getWriter();
		salida.append("<!DOCTYPE html>");
		salida.append(" <meta charset='UTF-8'>");
		salida.append("<html>");
		salida.append("<head>");
		salida.append("<meta charset='UTF-8'>");
		salida.append("<title>Servlet HolaMundo</title>");
		salida.append("</head>");
		salida.append("<h1>Autor: "+nom+" y su edad es "+edad+" </h1>");
		salida.append("<body>");
		salida.append("<h1>Hola Mundo desde el servlet</h1>");
		salida.append("</body>");
		salida.append("</html>");
		
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
