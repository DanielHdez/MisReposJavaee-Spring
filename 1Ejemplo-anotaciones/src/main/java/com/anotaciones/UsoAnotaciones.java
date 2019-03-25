package com.anotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotaciones {
	public static void main(String[] args) {
		//Cargo el XML
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		//Pedir un bean al contenedor
		
		Empleados Antonio=contexto.getBean("comercialExperimentado", Empleados.class);
		
		
		//Usar el bean 
		
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		
		//Cerrar el contexto
		contexto.close();
}
}