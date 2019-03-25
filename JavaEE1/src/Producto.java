

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import Conector.Conector;
import Conector.SQL;

/**
 * Servlet implementation class Producto
 */
@WebServlet("/Producto")
public class Producto extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Producto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter salida = response.getWriter();
		salida.append("<p>HOLA</p>");
		Conector con=new Conector("jdbc:mysql://192.168.0.5:3306/acuario","acuario", "12345");
	    conex=(Connection) con.cargardriver();
	    String nombre=request.getParameter("nombre");
	    salida.append("<p>"+nombre+"</p>");
	    String marca=request.getParameter("marca");
	    String tipo=request.getParameter("tipo");
	    String precio=request.getParameter("precio");
	    String descrip=request.getParameter("descrip");
	    String web=request.getParameter("web");
	    if(conex!=null) {
	    	sql = new SQL(conex);
	    	sql.introducirregistro("Producto", nombre, marca, tipo, precio, descrip, web);
	    	salida.append("<p>Registros Guardados con éxito</p>");
	    	con.cerrarconexxion();
	       }else{
	    	   salida.append("<p>Se ha encontrado un error</p>");
	    	   
	       }
	     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
