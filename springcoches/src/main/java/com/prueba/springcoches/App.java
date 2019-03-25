package com.prueba.springcoches;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Vehiculo vehiculo = (Vehiculo) (context.getBean("vehiculo"));
		vehiculo.setMarca("Audi");
		System.out.println(vehiculo.comprobarMotor());
		System.out.println("Vehiculo marca: " + vehiculo.getMarca());
		System.out.println("Vehiculo modelo: " + vehiculo.getModelo());

		((ClassPathXmlApplicationContext) context).close();
	}

}
