import java.io.Serializable;

public class Libro implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * Escribe un programa Java que permita almacenar en disco informaci�n de varios libros guardados c�mo objetos de la clase Libro.
	 *  Cada libro se compone de los atributos isbn, titulo, autor.Al iniciarse el programa, deber�s comprobar si existe ya el fichero 
	 *  y en caso informativo, recoger todos los Libros que existan en una colecci�n de tipo ArrayList. Una vez iniciado el programa, 
	 *  a trav�s de un men� permitir�s:
	 		* A�adir libro.
	 		* Listado libros.
	 		* Consulta por autor.
	 		* Fin del programa.
	La opci�n A�adir libro tendr� que a�adir el libro a la colecci�n ArrayList y adem�s guardarlo en disco.

	 */
	private int isbn;
	private String titulo;
	private String autor;
	
	
	
	public Libro(int isbn, String titulo, String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + "]";
	}

}

