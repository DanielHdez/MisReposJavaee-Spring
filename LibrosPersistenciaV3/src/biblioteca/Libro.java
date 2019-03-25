package biblioteca;

import java.io.Serializable;

public class Libro implements Serializable {
	private static final long serialVersionUID = 8181845919264490200L;
	private String isbn;
	private String titulo;
	private String autor;
	
	public Libro(String isbn, String titulo, String autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + "]";
	}
}
