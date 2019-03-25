package com.soft.ioc;

public class JefeEmpleado implements Empleado {
	
	private CreacionInformes nuevoinforme;
	
	
	public String getTareas() {
		
		
		return "Voy a gestionar las tareas de mis empleados";
		
	}

	public JefeEmpleado(CreacionInformes nuevoinforme) {
		super();
		this.nuevoinforme = nuevoinforme;
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos: " +nuevoinforme.getInformes();
	}

}
