package com.pruebas.examen;

public class Autor {
	private String nombre;
	private String apellidos;
	private String fnacimiento;
	private String notaautor;
	public Autor(String nombre, String apellidos, String fnacimiento, String notaautor) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fnacimiento = fnacimiento;
		this.notaautor = notaautor;
	}
	public Autor() {}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFnacimiento() {
		return fnacimiento;
	}
	public void setFnacimiento(String fnacimiento) {
		this.fnacimiento = fnacimiento;
	}
	public String getNotaautor() {
		return notaautor;
	}
	public void setNotaautor(String notaautor) {
		this.notaautor = notaautor;
	}
	@Override
	public String toString() {
		return "Autor:\n   Nombre=" + nombre + "\n   Apellidos=" + apellidos + "\n   Fecha de nacimiento=" + fnacimiento + "\n  Nota del autor="
				+ notaautor;
	}
	
	

}
