package com.soft.ioc;

public class SecretarioEmpleado implements Empleado {
	private CreacionInformes nuevoinforme;
	private String email;
	private String nombreEmpresa;
		
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Inform generado por el secretario"+nuevoinforme.getInformes();
	}

	public CreacionInformes getNuevoinforme() {
		return nuevoinforme;
	}

	public void setNuevoinforme(CreacionInformes nuevoinforme) {
		this.nuevoinforme = nuevoinforme;
	}

}
