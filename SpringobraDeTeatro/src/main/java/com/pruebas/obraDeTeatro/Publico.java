package com.pruebas.obraDeTeatro;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.*;

@Aspect
public class Publico {
	@Pointcut("execution(* teatro.Obra.comenzarObra(..))")
	public void pointCutComenzarObra() {}

	@Before("pointCutComenzarObra()")
	public void sentarse (){
		System.out.println ("El público se está sentando");
		}
		public void aCasa (){
		System.out.println ("El público se marcha a sus casas");
		}
		public void descanso (){
		System.out.println ("El público está saliendo al bar. Vamos a recaudar dinerito");
		}
		public void aplaudir (){
		System.out.println ("Bravo!! Maravilloso!! Clap clap Clap clap");
		}
		public void abuchear (){
		System.out.println ("Malos!! Ha sido horrible!! Porque no he traido tomates que si no...");
		}


}
