package Principal;


import Conector.SQL;

public class Principal {

	public static void main(String[] args) {
		SQL con= new SQL("jdbc:mysql://192.168.0.5:3306/acuario","acuario", "12345");
		//con.cargardriver();

	}

}
