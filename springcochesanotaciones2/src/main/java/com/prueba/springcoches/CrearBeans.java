package com.prueba.springcoches;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CrearBeans {
	// Métodos de declaración de beans.
	
	@Bean
	public Motor motor1() {
		return new Motor("Gasolina", 100);
	}
	
	@Bean
	public Motor motor2() {
		return new Motor("Diesel", 95);
	}	
	
	@Bean
	public Vehiculo vehiculo() {
		Vehiculo v = new Vehiculo();
		v.setMarca("Suzuki");
		v.setModelo("Ignis");
		
		// Inyección de dependencias.
		v.setMotor(motor2()); 
		
		return v;
	}
}
