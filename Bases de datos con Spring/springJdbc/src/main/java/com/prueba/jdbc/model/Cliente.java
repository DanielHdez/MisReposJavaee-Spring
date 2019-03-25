package com.prueba.jdbc.model;

public class Cliente {
	private String nif;

	private String ciudad;

	private String domicilio;

	private String nombre;

	private String tlf;

	public Cliente() {
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTlf() {
		return this.tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	@Override
	public String toString() {
		return "Cliente [nif=" + nif + ", ciudad=" + ciudad + ", domicilio=" + domicilio + ", nombre=" + nombre
				+ ", tlf=" + tlf + "]";
	}
}