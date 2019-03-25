package com.pruebas.obraDeTeatro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
    	try{
    		context = new ClassPathXmlApplicationContext
    		("configBeans.xml");
    		Obra ob = (Obra) (context.getBean("obra"));
    		ob.comenzarObra ();
    		ob.descanso();
    		ob.reanudarObra();
    		ob.finObra();
    		}catch (Exception e){
    		}

    }
}
