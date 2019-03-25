package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Producto database table.
 * 
 */
@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idProducto;

	private byte[] imagen;

	private String marca;

	private String nombre;

	private String precio;

	private String tipo;

	private String uso;

	private String web;

	//bi-directional many-to-many association to Analisi
	@ManyToMany
	@JoinTable(
		name="Analisis_has_Producto"
		, joinColumns={
			@JoinColumn(name="Producto_idProducto")
			}
		, inverseJoinColumns={
			@JoinColumn(name="Analisis_idAnalisis")
			}
		)
	private List<Analisi> analisis;

	public Producto() {
	}

	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public byte[] getImagen() {
		return this.imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return this.uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public String getWeb() {
		return this.web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public List<Analisi> getAnalisis() {
		return this.analisis;
	}

	public void setAnalisis(List<Analisi> analisis) {
		this.analisis = analisis;
	}

}