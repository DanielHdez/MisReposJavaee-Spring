package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class sesion1
 */
@WebServlet("/sesion1")
public class sesion1 extends HttpServlet {
	Integer cont=new Integer(0);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sesion1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion=request.getSession(true);
		
		
		if(sesion==null) {
			cont=1;
		}else {
			cont++;
		}
		sesion.setAttribute("nombre", "Juan");
		sesion.setAttribute("contador", cont);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("<a href='http://localhost:8080/javaeeejersesiones/Sesion2'>Enlace</a><br>");
		response.getWriter().append(sesion.getAttribute("contador").toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
