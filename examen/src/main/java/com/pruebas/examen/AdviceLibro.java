package com.pruebas.examen;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdviceLibro {
	
	@Pointcut("execution(* com.pruebas.examen.Libro.vender(..))")
	public void avender() {}
	
	
	@After("avender()")
	public void agradecer() {
		System.out.println("Gracias por su compra");
	}

}
