package com.pruebas.examen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CrearLibros {
	

	@Bean
	public Libro libro() {
		return new Libro("La fundación","9788497599245", "1951");
	}

	
	@Bean
	public Libro libro2() {
		return new Libro("La particula divina","978845", "1993");
	}
	
}
