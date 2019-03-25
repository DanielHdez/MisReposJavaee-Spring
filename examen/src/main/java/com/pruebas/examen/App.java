package com.pruebas.examen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("configBeans.xml");

		Libro libro = (Libro) (context.getBean("libro"));
		libro.vender();
		System.out.println("\n\n"+libro.toString());
		((ClassPathXmlApplicationContext) context).close();
    }
}
