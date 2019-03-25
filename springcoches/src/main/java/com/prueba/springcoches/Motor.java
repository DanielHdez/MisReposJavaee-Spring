package com.prueba.springcoches;

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

}
