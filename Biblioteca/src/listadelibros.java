import java.io.Serializable;
import java.util.ArrayList;

public class listadelibros implements Serializable{
	
	private ArrayList<Libro> listalibros;
	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;
	public listadelibros(ArrayList<Libro> listalibros) {
		super();
		listalibros=new ArrayList<Libro>();
		this.listalibros = listalibros;
	}
	public listadelibros() {
		super();
		listalibros=new ArrayList<Libro>();
		
	}
		

	public ArrayList<Libro> getListalibros() {
		return listalibros;
	}

	public void setListalibros(ArrayList<Libro> listalibros) {
		this.listalibros = listalibros;
	}
	
	public ArrayList<Libro> añadirlibro(Libro l){
		
		listalibros.add(l);
		return listalibros;
	}
	
	
	
	
}