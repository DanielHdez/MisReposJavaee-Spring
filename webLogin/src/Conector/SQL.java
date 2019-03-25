package Conector;

import java.sql.*;

public class SQL {
	
	
	
	private Connection con=null;
    
	
	//Constructo que pide conexion 
	public SQL(Connection con) {
    	this.con=con;
    }
	//Constructor sin Parametros 
	public SQL() {}
	
	
	/*********************************Con el Resulset  *******************************************/
	
	//Metoodos sobrecargados para ambos constructores, hay dos metodos de cada uno vacio para el constructor SQL(Conection)
	// y el segundo para el constructor vacio 
	
	public ResultSet consulta(Connection cone,String consulta) {
		
		
		Statement sentencia;
		try {
			sentencia = cone.createStatement();
			ResultSet rs = sentencia.executeQuery(consulta);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void obtenerregistro(Connection cone) {
		try {
			Statement sentencia = cone.createStatement();
			ResultSet rs = sentencia.executeQuery("SELECT * FROM CLIENTE");
			while (rs.next()) {
				System.out.print(rs.getString("NIF"));
				System.out.print(" - "); 
				System.out.print(rs.getString("NOMBRE"));
				System.out.print(" - "); 
				System.out.print(rs.getString("TLF"));
				System.out.println(); // Retorno de carro
			}
		} catch (SQLException e) {
			System.out.println("Error al realizar el listado de productos");
			System.out.println(e.getMessage());
		}
		
	}
	public String obtenerregistro() {
		String texto="";
		try {
			Statement sentencia = con.createStatement();
			ResultSet rs = sentencia.executeQuery("SELECT * FROM CLIENTE");
			texto="<table border>"
					+ "<thead>"
					+ "<tr>"
					+ "<th>NIF</th>"
					+ "<th>Nombre</th>"
					+ "<th>Telefono</th>"
					+ "</tr>"
					+ "</thead>"
					+ "<tbody>";
			while (rs.next()) {
				texto=texto+"<tr>"
						+ "	<td>"+rs.getString("NIF")+"</td>"
						+ "	<td>"+rs.getString("NOMBRE")+"</td>"
						+ "	<td>"+rs.getString("TLF")+"</td>"
						+ "</tr>";
						
				System.out.print(rs.getString("NIF"));
				System.out.print(" - "); 
				System.out.print(rs.getString("NOMBRE"));
				System.out.print(" - "); 
				System.out.print(rs.getString("TLF"));
				System.out.println(); // Retorno de carro
			};
			texto=texto+"</tbody></table>";
		} catch (SQLException e) {
			System.out.println("Error al realizar el listado de productos");
			System.out.println(e.getMessage());
		}
		
		return texto;

	}
	public void modificarregistro(Connection cone) {
		try {
			Statement sentencia = cone.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); //
			ResultSet rs = sentencia.executeQuery("SELECT * FROM CLIENTE WHERE NIF = '43434343A'");
			boolean existe = rs.next();
			if (existe) {
				rs.updateString("DOMICILIO", "C/ PEÑAGRANDE, 52");
				rs.updateString("TLF", "1523456789");
				rs.updateRow();
			}
			System.out.println("Se ha cambiado");
			} catch (SQLException e) {
				System.out.println("Error al actualizar los datos del cliente");
				System.out.println(e.getMessage());
			}		
	}
	
	public void modificarregistro() {
		try {
			Statement sentencia = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); //
			ResultSet rs = sentencia.executeQuery("SELECT * FROM CLIENTE WHERE NIF = '43434343A'");
			boolean existe = rs.next();
			if (existe) {
				rs.updateString("DOMICILIO", "C/ PEÑAGRANDE, 52");
				rs.updateString("TLF", "1523456789");
				rs.updateRow();
			}
			System.out.println("Se ha cambiado");
			} catch (SQLException e) {
				System.out.println("Error al actualizar los datos del cliente");
				System.out.println(e.getMessage());
			}		
	}
	
	public void borrarregistro(Connection cone) {
		
		try {
			Statement sentencia = cone.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = sentencia.executeQuery("SELECT * FROM CLIENTE WHERE NIF = '12345678Z'");
			boolean existe = rs.next();
			if (existe) {
				rs.deleteRow();
			}
		} catch (SQLException e) {
			System.out.println("Error al eliminar al cliente");
			System.out.println(e.getMessage());
		}		
	}
	public void borrarregistro() {
		
		try {
			Statement sentencia = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = sentencia.executeQuery("SELECT * FROM CLIENTE WHERE NIF = '12345678Z'");
			boolean existe = rs.next();
			if (existe) {
				rs.deleteRow();
			}
		} catch (SQLException e) {
			System.out.println("Error al eliminar al cliente");
			System.out.println(e.getMessage());
		}		
	}
	
	
	public void introducirregistro() {
		try {
			Statement sentencia = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = sentencia.executeQuery("SELECT * FROM CLIENTE");
			boolean existe = rs.next();
			if (existe) {
				rs.moveToInsertRow(); 
				rs.updateString("NIF", "12345678Z"); 
				rs.updateString("NOMBRE", "HIPOLITO DURAN CARLOS"); 
				rs.updateString("DOMICILIO", "C/ PEZ VOLADOR, 52"); 
				rs.updateString("TLF", "912222222"); 
				rs.updateString("CIUDAD", "MADRID"); 
				rs.insertRow(); 
			}
		} catch (SQLException e4) {
			System.out.println("Error al añadir el nuevo cliente");
			System.out.println(e4.getMessage());
		}	
	}

		public void introducirregistro(Connection cone) {
			try {
				Statement sentencia = cone.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = sentencia.executeQuery("SELECT * FROM CLIENTE");
				boolean existe = rs.next();
				if (existe) {
					rs.moveToInsertRow(); 
					rs.updateString("NIF", "12345678Z"); 
					rs.updateString("NOMBRE", "HIPOLITO DURAN CARLOS"); 
					rs.updateString("DOMICILIO", "C/ PEZ VOLADOR, 52"); 
					rs.updateString("TLF", "912222222"); 
					rs.updateString("CIUDAD", "MADRID"); 
					rs.insertRow(); 
				}
			} catch (SQLException e) {
				System.out.println("Error al añadir el nuevo cliente");
				System.out.println(e.getMessage());
			}		
	}
	
/******************************** Se acado Resulset ************************************************************/	

/***************************************Consulta SQL   *********************************************************/
		
		public void consultasql(String sql) {
			try {
				con.setAutoCommit(false);
				Statement sentencia = con.createStatement();
				sentencia.executeUpdate(sql);
				con.commit();
				System.out.println("Correcto todo"); 
				
			} catch (SQLException e2) {
				System.out.println("Ha ocurrido un error al añadir la factura");
				System.out.println(e2.getMessage()); 
				try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}
}

	


