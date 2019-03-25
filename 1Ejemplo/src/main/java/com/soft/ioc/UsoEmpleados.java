package com.soft.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados  {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		
		//Creo objetos d etipo empleado 
		Empleado Empleado1=new DirectorEmpleado();
		
		
		//Uso los objetos creados 
		System.out.print(Empleado1.getTareas());*/
		
		//Creamos un contecto 
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("aplicationContext.xml");
		SecretarioEmpleado Juan=contexto.getBean("secretario", SecretarioEmpleado.class);
		DirectorEmpleado Pepe=contexto.getBean("director", DirectorEmpleado.class);
		System.out.println(Juan.getTareas());
		System.out .println(Juan.getInforme());
		System.out .println(Juan.getEmail());
		System.out .println(Juan.getNombreEmpresa());
		System.out.println("/n"+Pepe.getTareas());
		System.out .println(Pepe.getInforme());
		System.out .println(Pepe.getEmail());
		System.out .println(Pepe.getNombreEmpresa());
		
	
		
		contexto.close();
	}

}
