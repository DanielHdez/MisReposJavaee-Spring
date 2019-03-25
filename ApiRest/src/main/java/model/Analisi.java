package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Analisis database table.
 * 
 */
@Entity
@Table(name="Analisis")
@NamedQuery(name="Analisi.findAll", query="SELECT a FROM Analisi a")
public class Analisi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAnalisis;

	private double k;

	private float nitratos;

	private float nitritos;

	private String observaciones;

	private float ph;

	private float temperatura;

	//bi-directional one-to-one association to Usuario
	@OneToOne
	@JoinColumn(name="idAnalisis")
	private Usuario usuario;

	//bi-directional many-to-many association to Producto
	@ManyToMany(mappedBy="analisis")
	private List<Producto> productos;

	public Analisi() {
	}

	public int getIdAnalisis() {
		return this.idAnalisis;
	}

	public void setIdAnalisis(int idAnalisis) {
		this.idAnalisis = idAnalisis;
	}

	public double getK() {
		return this.k;
	}

	public void setK(double k) {
		this.k = k;
	}

	public float getNitratos() {
		return this.nitratos;
	}

	public void setNitratos(float nitratos) {
		this.nitratos = nitratos;
	}

	public float getNitritos() {
		return this.nitritos;
	}

	public void setNitritos(float nitritos) {
		this.nitritos = nitritos;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public float getPh() {
		return this.ph;
	}

	public void setPh(float ph) {
		this.ph = ph;
	}

	public float getTemperatura() {
		return this.temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}