

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public  class TratarArchivo{

private FileOutputStream fileout, fileout2;
private FileInputStream  fileinput;
private ObjectOutputStream bufferout;
private ObjectInputStream bufferinput;



public void escribirarchivo(String ruta, Libro l) {
	try {
		fileout = new FileOutputStream(ruta,true);
		bufferout = new ObjectOutputStream(fileout
				);
	} catch (IOException e) {
		System.out.println("No se ha podido abrir el fichero");
		System.out.println(e.getMessage());
		return;
	}	
	
	// Guarda objeto en el fichero ruta
	try {
		bufferout.writeObject(l);
	
		System.out.println("El objeto se ha grabado con éxito");
	} catch (IOException e) {
		System.out.println("Error al escribir en el fichero");
		System.out.println(e.getMessage());
	}
	
	// Cerrar el fichero
	try {
		bufferout.close();
		fileout.close();
	} catch (IOException e) {
		System.out.println("Error al cerrar el fichero");
		System.out.println(e.getMessage());
	}

}


public void escribirarchivo(String ruta, ArrayList<Libro> array) {
	try {
		fileout = new FileOutputStream(ruta);
		bufferout = new ObjectOutputStream(fileout);
	} catch (IOException e) {
		System.out.println("No se ha podido abrir el fichero");
		System.out.println(e.getMessage());
		return;
	}	
	
	// Guarda objeto en el fichero ruta
	try {
		for(Libro n:array) {
			bufferout.writeObject(n);
		}
		
		System.out.println("La lista de objetos se ha grabado con éxito");
	} catch (IOException e) {
		System.out.println("Error al escribir en el fichero");
		System.out.println(e.getMessage());
	}
	
	// Cerrar el fichero
	try {
		bufferout.close();
		fileout.close();
		
	} catch (IOException e) {
		System.out.println("Error al cerrar el fichero");
		System.out.println(e.getMessage());
	}

}

public void leerarchivo(String ruta) {
	
	try {
		fileinput = new FileInputStream(ruta);
		bufferinput = new ObjectInputStream(fileinput);
	} catch (IOException e) {
		System.out.println("No se ha podido abrir la agenda de contactos");
		System.out.println(e.getMessage());
		return;
	}	
	
	// Leemos la lista de contactos
	boolean eof = false;
	Libro c;
	while (!eof) {
		try {
			c = (Libro) bufferinput.readObject();
			System.out.println(c.toString());
		} catch (EOFException e1) {
			eof = true;
		} catch (IOException e2) {
			System.out.println("Error al leer el libro");
			System.out.println(e2.getMessage());
		} catch (ClassNotFoundException e3) {
			System.out.println("La clase Libro no esta cargada");
			System.out.println(e3.getMessage());
		}
	}

	// Cerramos el fichero
	try {
		bufferout.close();
		fileinput.close();
	} catch (IOException e) {
		System.out.println("Error al cerrar el fichero");
		System.out.println(e.getMessage());
	}	
}


}
