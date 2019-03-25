package com.prueba.springcoches;
import org.springframework.stereotype.Service;


public class Motor {
		private String tipo; // diesel o gasolina
		private int caballos;
		
		public Motor(String tipo, int caballos) {
			this.tipo = tipo;
			this.caballos = caballos;
		}

		public int getCaballos() {
			return caballos;
		}

		public String getTipo() {
			return tipo;
		}

		public Motor() {
			this.caballos=100;
			this.tipo="Gasolina";
		}

}
