package Conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

	private String cadenaConexion = "";
	private String user = "";
	private String pass = ""; 
	private Connection con = null;

public Conector() {}	
	
public Conector(String cadenaConexion, String user, String pass) {
		super();
		this.cadenaConexion = cadenaConexion;
		this.user = user;
		this.pass = pass;
		this.con=cargardriver();
	}



// Establece un objeto conexion a la base de datos que decida 
	public Connection cargardriver(String servidor, String user, String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("El driver ha sido cargado");
		} catch (ClassNotFoundException e) {
			System.out.println("El driver No carga");
			e.printStackTrace();
		}
		
		// Paso 2: Establecer conexión con la base de datos
				this.cadenaConexion = servidor;
			    this.user = user;
			    this.pass =pass; 
				try {
					con = DriverManager.getConnection(cadenaConexion, user, pass);
				} catch (SQLException e) {
					System.out.println("Error en la conexión con la BD");
					System.out.println(e.getMessage());
					return con;
				}
				System.out.println("Se ha establecido la conexión con la Base de datos");

				return con;
	}
	
	//devuelve el objeto conexion
	
	public Connection cargardriver() {
		
		System.out.print("La cadena es"+cadenaConexion);
		System.out.print(user);
		System.out.print(pass);
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("El driver ha sido cargado ahora desde aqui");
		} catch (ClassNotFoundException e) {
			System.out.println("El driver No carga");
			e.printStackTrace();
		}
		
		// Paso 2: Establecer conexión con la base de datos 
				try {
					this.con = DriverManager.getConnection(this.cadenaConexion, this.user, this.pass);
				} catch (SQLException e) {
					System.out.println("Error en la conexión con la BD");
					System.out.println(e.getMessage());
					return con;
				}
				System.out.println("Se ha establecido la conexión con la Base de datos");

				return con;
	}
	
	
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public void cerrarconexxion() {
		try {
			this.con.close();
		} catch (SQLException e) {
			System.out.println("No se ha podido cerrar la conexión con la BD");
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Se ha cerrado la base de datos");

	}



	public String getCadenaConexion() {
		return cadenaConexion;
	}



	public void setCadenaConexion(String cadenaConexion) {
		this.cadenaConexion = cadenaConexion;
	}



	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}



	public String getPass() {
		return pass;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
