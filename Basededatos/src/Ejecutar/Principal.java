package Ejecutar;

import Conector.Conector;
import Conector.SQL;

public class Principal {
	static String consql;
	public static void main(String[] args) {
		Conector conex=new Conector( "jdbc:mysql://192.168.0.5:3306/Joomla","root", "956621");
		conex.cargardriver(); //obtienes el conector con tu base de datos 
		SQL sql=new SQL(conex.getCon());
		sql.obtenerregistro();
		sql.modificarregistro();
	     //consql="INSERT INTO CLIENTE VALUES ('51646666A','ROCAFLOR DELGADO RODOLFO', 'C/ PITONISA, 45', '616656644', 'SEVILLA');";
		consql="INSERT INTO FACTURA VALUES (5746,'2018/04/23', 0, '51666666A');"
				+ "INSERT INTO DETALLE VALUES (5746,'MAR2', 1, 7);"
				+ "INSERT INTO DETALLE VALUES (5746,'TOR7', 2, 0.8);"
				+ "UPDATE PRODUCTO SET STOCK=STOCK-1 WHERE CODIGO='MAR2';"
				+ "UPDATE PRODUCTO SET STOCK=STOCKKK-2 WHERE CODIGO='TOR7';";
			

		sql.consultasql(consql);
		conex.cerrarconexxion();
		
		
		//conex.cerrarconexxion();
	}

}
