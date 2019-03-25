import java.io.Serializable;

public class Libro implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * Escribe un programa Java que permita almacenar en disco información de varios libros guardados cómo objetos de la clase Libro.
	 *  Cada libro se compone de los atributos isbn, titulo, autor.Al iniciarse el programa, deberás comprobar si existe ya el fichero 
	 *  y en caso informativo, recoger todos los Libros que existan en una colección de tipo ArrayList. Una vez iniciado el programa, 
	 *  a través de un menú permitirás:
	 		* Añadir libro.
	 		* Listado libros.
	 		* Consulta por autor.
	 		* Fin del programa.
	La opción Añadir libro tendrá que añadir el libro a la colección ArrayList y además guardarlo en disco.

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

