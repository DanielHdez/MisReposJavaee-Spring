package datos;

import java.sql.ResultSet;

import Conector.Conector;
import Conector.SQL;

public class LogicaBD {
	private String mensaje;
	Conector conex;
	SQL sql;
	public LogicaBD() {
	    this.conex=new Conector( "jdbc:mysql://localhost:3306/FERRETERIA?serverTimezone=UTC","root", "curso");
	    sql=new SQL(conex.getCon());
	}

	@Override
	public String toString() {
		return "LogicaBD [mensaje=" + mensaje + "]";
	}
	
	public String tablacliente() {
		return sql.obtenerregistro();	
		
	}
	
	public ResultSet inventario() {
		return null;
	}
}
