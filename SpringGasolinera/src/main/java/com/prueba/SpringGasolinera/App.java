package com.prueba.SpringGasolinera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("configBeans.xml");

		Gasolinera estacion = (Gasolinera) (context.getBean("Estacion"));
		System.out.println(estacion.getDireccion());
		System.out.println("Empleado Encargado: " + estacion.getEmpleado().getNombre());
		System.out.println("Telefono Empleado: " + estacion.getEmpleado().getTlf());
		System.out.println("Marca Vehiculo: " + estacion.getEmpleado().getCoche().getMarca());
		System.out.println("Matricula Vehiculo: " + estacion.getEmpleado().getCoche().getMatricula());
		System.out.println("Modelo Vehiculo: " + estacion.getEmpleado().getCoche().getModelo());
		//System.out.println("Vehiculo modelo: " + vehiculo.getModelo());

		((ClassPathXmlApplicationContext) context).close();
    }
}
