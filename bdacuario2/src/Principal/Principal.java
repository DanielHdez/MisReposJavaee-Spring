package Principal;

import java.sql.ResultSet;
import java.sql.SQLException;

import Conector.Conector;
import Conector.SQL;

public class Principal {

	public static void main(String[] args) {
		Conector con=new Conector("jdbc:mysql://192.168.0.5:3306/acuario","acuario", "12345");
		con.cargardriver();
        SQL sql=new SQL(con.cargardriver());
		String n,p;
		n="Daniel";
		p="0236";
		try {
		ResultSet rs= sql.getResulset("SELECT `Nombre`,`pass` FROM `usuarios`");
		while (rs.next()) {
			System.out.println(rs.getString("Nombre"));
			System.out.println(n);
			System.out.println(n.equals(rs.getString("Nombre")));
			System.out.print(rs.getString("pass"));
			System.out.println(p);
			System.out.println(p.equals(rs.getString("pass")));
			if(n.equals(rs.getString("Nombre")) && p.equals(rs.getString("pass"))) {
				//sesion.setAttribute("nombre", n);
				//sesion.setAttribute("pass", p);
				//Genero dos variables para validar el incio de sesion 
				//nval="correcto";
				//pval="correcto";
				//sesion.setAttribute("nval", nval);
				//sesion.setAttribute("pval", pval);
				System.out.println("Coincide algun registro");
				
			}else {
				
				System.out.println("noCoincide algun registro");
			}

			
		}
		} catch (SQLException e) {
			System.out.println("Error al realizar el listado de productos");
			System.out.println(e.getMessage());
		}
	}

}
