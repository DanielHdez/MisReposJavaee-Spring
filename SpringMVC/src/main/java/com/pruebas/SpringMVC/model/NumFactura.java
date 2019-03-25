package com.pruebas.SpringMVC.model;

public class NumFactura {
	private int numero;

	public NumFactura() {
		this.numero = 5440;
	}
	public NumFactura(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
