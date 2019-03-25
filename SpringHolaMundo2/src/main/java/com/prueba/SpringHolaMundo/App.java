package com.prueba.SpringHolaMundo;

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
		
    	//Me permite recuperar el contexto de Spring 
    	ApplicationContext context = new ClassPathXmlApplicationContext("configBeans.xml");
			
		// Creamos una instancia del bean por medio del contexto.
		HolaMundoSpring miBean = (HolaMundoSpring) context.getBean("springHolaMundoBean");
		//Ahora llamamos al metodo 
		miBean.decirHola();
		((ClassPathXmlApplicationContext) context).close();
	    
    }
}
