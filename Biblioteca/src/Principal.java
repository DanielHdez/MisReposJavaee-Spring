 import java.util.Scanner;

public class Principal {
	


	public static void main(String[] args) {
		
		Libro l = new Libro(15489564, "ElClub de al lado", "Mateo lero");
		Libro l1=new Libro(54564654,"Poetas","Felipe");
		Libro l2=new Libro(56846, "Perico", "Manuel Gomez");
		
		
		listadelibros b=new listadelibros();
		b.a�adirlibro(l);
		b.a�adirlibro(l1);
		b.a�adirlibro(l2);
		
		TratarArchivo tr=new TratarArchivo();
		tr.escribirarchivo("C:\\Users\\admin\\Documents\\biblio.dat", b.getListalibros());
		tr.leerarchivo("C:\\Users\\admin\\Documents\\biblio.dat");
		
		Libro l3=new Libro(566, "Moncho el pony", "Pablo");
		tr.escribirarchivo("C:\\Users\\admin\\Documents\\biblio.dat", l3);
		tr.leerarchivo("C:\\Users\\admin\\Documents\\biblio.dat");
		
		
	System.out.println("***********************************\n"
			+ "* A�adir libro.\r\n" + 
			"* Listado libros.\r\n" + 
			"* Consulta por autor.\r\n" + 
			"* Fin del programa\n"
			+ "***********************************");
	System.out.println(" Introduce la opci�n");
	Scanner lector=new Scanner(System.in);
	lector.nextLine();
	String opc = null;
	switch(opc) {
		case "A": 
			System.out.println("A�adir un libro");
			break;
		case "B":
			System.out.println("A�adir un libro");
			break;
		
	
	}
	
	
	
	
	
	
	}

	

	


}
