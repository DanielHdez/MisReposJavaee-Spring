package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class formulario
 */
@WebServlet("/Tabla")
public class Tabla extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	int numero;
	int contador;
	
    public Tabla() {
        super();
       
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion=request.getSession();	
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter salida = response.getWriter();
		String texto="<h3>Tabla de multiplicar del <stong>"+numero+"</strong><h/3>"
				+ "<ul>";
		try {
			
		
		numero=Integer.parseInt(request.getParameter("numero"));
		for(int i=1;i<11;i++) {
			texto=texto+" "+numero+"X"+i+" = "+numero*i+"<br>";
		}
		texto=texto+"</ul>";
		salida.append(texto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
				
			}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("Se va a autodestruir");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
