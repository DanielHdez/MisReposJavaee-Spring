package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the misclientes database table.
 * 
 */
@Entity
@Table(name="misclientes")
@NamedQuery(name="Miscliente.findAll", query="SELECT m FROM Miscliente m")
public class Miscliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int edad;

	private String nombre;

	public Miscliente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}