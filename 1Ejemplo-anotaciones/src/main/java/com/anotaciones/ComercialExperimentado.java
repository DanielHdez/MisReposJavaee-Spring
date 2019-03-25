package com.anotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {
	private CreacionInformeFinanciero nuevoInforme;
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender  muchísimo";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();

	}
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
	
	//Cargaremos el informe finanicero por el constructor 
	
}
