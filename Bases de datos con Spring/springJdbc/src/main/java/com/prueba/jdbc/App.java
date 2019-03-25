package com.prueba.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prueba.jdbc.model.Producto;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("configBeans.xml");
		LogicaBD miLogica = (LogicaBD) (context.getBean("gestionBD"));

		String opcion = "";
		Scanner lector = new Scanner(System.in);
		while (!opcion.equals("0")) {
			System.out.println("Gestión de almacén");
			System.out.println("--------------------------------");
			System.out.println("1. Listado de clientes");
			System.out.println("2. Listado de ventas (líneas de detalle)");
			System.out.println("3. Inventario");
			System.out.println("4. Ultimo número de factura");
			System.out.println("0. Terminar programa");
			System.out.println();
			System.out.print("Teclea número de operación: ");
			opcion = lector.nextLine();
			
			switch (opcion) {
			case "1":
				listadoClientes(miLogica);
				break;
			case "2":
				listadoVentas(miLogica);
				break;
			case "3":
				inventario(miLogica);
				break;
			case "4":
				ultimaFactura(miLogica);
				break;
			}
		}
		lector.close();
		((ClassPathXmlApplicationContext) context).close();
    }
    
    public static void listadoClientes(LogicaBD miLogica) {
		List<Object> clientes = miLogica.listadoClientes();
		for (Object c : clientes) {
			System.out.println(c.toString());
		}    	
    }
    public static void listadoVentas(LogicaBD miLogica) {
		List<Object> detalles = miLogica.listadoDetalles();
		for (Object det : detalles) {
			Object[] d = (Object[]) det;
			System.out.print(d[0]+" ");
			System.out.print(d[1]+" ");
			System.out.print(d[2]+" ");
			System.out.print(d[3]+" ");
			System.out.print(d[4]+" ");
			System.out.print("Unidades: "+d[5]+" ");
			System.out.print("Precio: "+d[6]);
			System.out.println();
		}      	
    }
    public static void inventario(LogicaBD miLogica) {
		List<Producto> productos = miLogica.inventario();
		for (Object pro : productos) {
			System.out.println(pro);
		}      	
    }
    public static void ultimaFactura(LogicaBD miLogica) {
    	System.out.println("Ultimo número de factura: " + miLogica.ultimoNumFactura());
    }
}
