package com.prueba.webRestController;

public class Persona {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}

}
