
// Versión 3 - Guardando cada objeto Libro

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import biblioteca.Libro;

public class Principal {
	private static Scanner lector;
	private static ArrayList<Libro> libros;

	public static void main(String[] args) {
		lector = new Scanner(System.in);

		libros = new ArrayList<Libro>();

		leerFichero();
		
		String opc = "";
		do {
			System.out.println("---------------------");
			System.out.println("1. Añadir libro.");
			System.out.println("2. Listado libros.");
			System.out.println("3. Consulta por autor.");
			System.out.println("4. Fin del programa.");
			System.out.println("---------------------");
			System.out.println("¿Qué opción eliges?");
			opc = lector.nextLine();
			switch (opc) {
			case "1":
				System.out.println("ISBN: ");
				String isbn = lector.nextLine();
				System.out.println("Titulo: ");
				String titulo = lector.nextLine();
				System.out.println("Autor: ");
				String autor = lector.nextLine();
				Libro li = new Libro(isbn, titulo, autor);
				libros.add(li);
				break;
			case "2":
				for (Libro l : libros) {
					System.out.println(l);
				}
				break;
			case "3":
				System.out.println("Autor: ");
				String a = lector.nextLine();
				for (Libro l : libros) {
					if (l.getAutor().equals(a))
						System.out.println(l);
				}
				break;
			case "4":
				System.out.println("Gracia por utilizar nuestro servicio");
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		} while (!opc.equals("4"));

		escribirFichero();
	}

	public static void leerFichero() {

		File fichero = new File("libros.obj");
		if (!fichero.exists()) {
			System.out.println("No hay libros de momento");
			return;
		}

		// Abrir fichero para lectura
		FileInputStream file;
		ObjectInputStream buffer;
		try {
			// Abrir
			file = new FileInputStream("libros.obj");
			buffer = new ObjectInputStream(file);
			
			// Leer
			boolean eof = false;
			while (!eof) {
				try {
					Libro li = (Libro) buffer.readObject();
					libros.add(li);
				} catch (EOFException e1) {
					eof = true;
				} catch (IOException | ClassNotFoundException e3) {
					System.out.println("Error al leer los libros");
					System.out.println(e3.getMessage());
				}
			}
			buffer.close();
			file.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void escribirFichero() {
		FileOutputStream file;
		ObjectOutputStream buffer;
	
		// Abrir
		try {
			file = new FileOutputStream("libros.obj");
			buffer = new ObjectOutputStream(file);
		} catch (IOException e) {
			System.out.println("No se ha podido abrir el fichero");
			System.out.println(e.getMessage());
			return;
		}
		
		// Escribir
		try {
			for (Libro li : libros) {
				buffer.writeObject(li);
			}
		} catch (IOException e) {
			System.out.println("Error en la escritura del objeto");
			System.out.println(e.getMessage());
		}
		
		// Cerrar
		try {
			buffer.close();
			file.close();
		} catch (IOException e) {
			System.out.println("Error al cerrar el fichero");
			System.out.println(e.getMessage());
		}
	}
}
