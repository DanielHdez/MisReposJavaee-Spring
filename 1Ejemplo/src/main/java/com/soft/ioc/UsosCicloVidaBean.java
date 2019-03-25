package com.soft.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsosCicloVidaBean {
public static void main(String[] args) {
		//Cargo el XML
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("aplicationContext3.xml");
		//Creo los beans
		Empleado Juan=contexto.getBean("director", Empleado.class);
		Empleado Pepe=contexto.getBean("director", Empleado.class);
		
		System.out.print(Juan.getInforme());
		System.out.print(Pepe.getInforme());
		
		contexto.close();
		
}
}
