package com.soft.ioc;

public class DirectorEmpleado implements Empleado {

	//Creacion de cmapo tipo CreacionInforme
	
	private CreacionInformes nuevoinforme;
	private String email;
	private String nombreEmpresa;
	
	public CreacionInformes getNuevoinforme() {
		return nuevoinforme;
	}

	public void setNuevoinforme(CreacionInformes nuevoinforme) {
		this.nuevoinforme = nuevoinforme;
	}

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

	//Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes nuevoinforme) {
		super();
		this.nuevoinforme = nuevoinforme;
	}
	
	

	public DirectorEmpleado() {
		
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Dirijo toda la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Creado por el director: "+ nuevoinforme.getInformes();
	}
	
	//Creo un método init (no tiene por que llamarswe init) encargado de ejecutarse antes de poner el bean en funcionamiento
	//Y el destroy , para tareas despùes de haberse utilizado
	
	public void metodoinicial() {
		
		System.out.println("Tareas a aejecutar antes de iniciar el bean");
	}
	
	public void metododestruir() {
		
		System.out.println("Tareas a aejecutar después de iniciar el bean");
	}

}
