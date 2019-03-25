package com.Prueba.Triangulo;

public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	private String tipo;
		
	public Triangulo(int lado1, int lado2, int lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.tipo = this.getTipo();
	}
	
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
		this.tipo = this.getTipo();
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
		this.tipo = this.getTipo();
	}
	public int getLado3() {
		return lado3;
	}
	public void setLado3(int lado3) {
		this.lado3 = lado3;
		this.tipo = this.getTipo();
	}

	public String getTipo() {
		if (this.lado1==this.lado2 && this.lado2==this.lado3) {
			return "Equilátero";
		}
		else if (this.lado1 == this.lado2 || this.lado2==this.lado3 || this.lado1==this.lado3) {
			return "Isósceles";
		}
		else {
			return "Escaleno";
		}
	}

	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", tipo=" + tipo + "]";
	}
}
