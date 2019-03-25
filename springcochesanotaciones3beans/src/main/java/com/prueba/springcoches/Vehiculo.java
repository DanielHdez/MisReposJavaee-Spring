package com.prueba.springcoches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service("vehiculo")
public class Vehiculo {
	private String marca;
	private String modelo;
	
	private Motor motor = null;

	public String comprobarMotor() {
		if(motor != null) 
		{
			return "Tipo de motor: "+this.motor.getTipo()+"\n"+
			  "Caballos: "+this.motor.getCaballos();
		}
		else 
			return "NO existe motor";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}
	@Autowired
	@Qualifier("motorcito2")

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Vehiculo() {
		this.modelo="A3";
	}

}

