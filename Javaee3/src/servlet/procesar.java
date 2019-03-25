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

/**
 * Servlet implementation class formulario
 */
@WebServlet("/procesar")
public class procesar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	String eqlocal;
	String eqvisit, texto, result;
	int localgol, visitgol;
	String html;
	int contador;

	private Enumeration<String> nombres;

	private String encabezado="";
	
    public procesar() {
        super();
       
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			encabezado="";
			PrintWriter salida=response.getWriter();
			contador++;
			nombres = request.getHeaderNames();
			eqlocal=request.getParameter("eqlocal");
			eqvisit=request.getParameter("eqvisitante");
			try {
			localgol=Integer.parseInt(request.getParameter("gollocal"));
			visitgol=Integer.parseInt(request.getParameter("golvisit"));
			if(localgol<visitgol) {
				result="El ganador es "+eqvisit;
			}else if(localgol>visitgol){
				result="El ganador es "+eqlocal;	
			}else {
				result="Los equipos han empatado";
			} 
			
			while(nombres.hasMoreElements()) {
		    	 
				String encabezado1 =nombres.nextElement();
				encabezado=encabezado+"<p>"+encabezado1+":"+request.getHeader(encabezado1)+"</p>";
		     }
			
		texto="<!DOCTYPE html>\r\n" + 
				"<html lang=\"es\">\r\n" + 
				"<head>\r\n" + 
				"	<meta charset=\"UTF-8\">\r\n" + 
				"	<title>Resultado del partido</title>\r\n" + 
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\">"+
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<table border=\"1\">\r\n" + 
				"  <caption>Fútbol 1º división</caption>\r\n" + 
				"  <tbody>\r\n" + 
				"    <tr>\r\n" + 
				"      <th>Equipos</th>\r\n" + 
				"      <th>Goles </th>\r\n" + 
				"    </tr>\r\n" + 
				"    <tr><center>\r\n" + 
				"      <th>"+eqlocal+"</center></th>\r\n" + 
				"      <td>"+localgol+"</td>\r\n" + 
				"    <center></tr>\r\n" +     
				"    <tr><center>\r\n" + 
				"      <th>"+eqvisit+"</th>\r\n" + 
				"      <td>"+visitgol+"</td>\r\n" + 
				"    <center></tr>\r\n" + 
				"  </tbody>\r\n" + 
				"</table>\r\n"+
				" <h1>"+ result+"</h1>"+
				"<h2>"+contador+"</h2>"+
				"<h2>"+encabezado+"</h2>"+
				"</body>\r\n" + 
				"</html>";
				salida.append(texto);
				System.out.println("Se va a doget");
				
			} catch (Exception e) {
				texto="<!DOCTYPE html>\r\n" + 
						"<html lang=\"en\">\r\n" + 
						"<head>\r\n" + 
						"	<meta charset=\"UTF-8\">\r\n" + 
						"	<title>Document</title>\r\n" + 
						"</head>\r\n" + 
						"<body>\r\n" + 
						"	<h1>Lo pusiste mal matado </h1>\r\n" + 
						"<h2>"+contador+"</h2>"+
						"</body>\r\n" + 
						"</html>";
				salida.append(texto);
			}
			
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		 contador=0;
		System.out.println("Se va a iniciar");
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
