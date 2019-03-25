package com.prueba.saludoPersona;

public class Logger {
	public void antesSaludo(Persona persona) {
		System.out.println(persona.getNombre() + " está a punto de saludar");
	}

	public void despuesSaludo(Persona persona) {
		System.out.println(persona.getNombre() + " ya ha saludado al personal");
	}

}
