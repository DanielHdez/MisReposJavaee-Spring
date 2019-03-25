package com.prueba.saludoPersona;

public class Persona {
	private String nombre;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	
	public void saludar() {
		System.out.println(this.nombre + " dice: -Ey, ¿Qué pasa?");
	}


}
