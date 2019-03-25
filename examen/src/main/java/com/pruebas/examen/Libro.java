package com.pruebas.examen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Libro {
	
	private String titulo;
	private Autor autor;
	private String isbn;
	private String apublica;
	public Libro(String titulo, Autor autor, String isbn, String apublica) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.apublica = apublica;
	}
	public Libro(String titulo, String isbn, String apublica) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.apublica = apublica;
	}
	public Libro() {
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	@Autowired
	@Qualifier("autor")
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getApublica() {
		return apublica;
	}
	public void setApublica(String apublica) {
		this.apublica = apublica;
	}
	@Override
	public String toString() {
		return "Libro:\n Titulo=" + titulo + "\n Autor=" + autor + "\n Isbn=" + isbn + "\n Fecha Publicación=" + apublica;
	}
	
	
	public void vender() {
		System.out.println("Aquí tienes tu libro con título " +
		titulo + " de " + autor.getNombre());
		}
}
