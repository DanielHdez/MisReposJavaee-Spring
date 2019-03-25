package com.prueba.saludoPersona;

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
		ApplicationContext context = new ClassPathXmlApplicationContext("ConfigBeans.xml");

		Persona yo = (Persona) context.getBean("persona");
		Persona yo2 = (Persona) context.getBean("persona2");

		yo.saludar();
		yo2.saludar();

		((ClassPathXmlApplicationContext) context).close();
    }
}
