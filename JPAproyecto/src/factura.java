import java.util.*;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.*;

public class factura {

	public static void main(String[] args) {
		anadirFactura();
		//System.out.println("NIF del cliente: ");
	}
	
	public static void anadirFactura() {
		
		EntityManagerFactory factoria = 
		Persistence.createEntityManagerFactory("JPAproyecto");
		EntityManager em = factoria.createEntityManager();
		
		
		System.out.println("NIF del cliente: ");
		

		Scanner lector=new Scanner(System.in);
		String nif = lector.nextLine();
		Cliente cli = em.find(Cliente.class, nif);
		if (cli==null) {
			System.out.println("No existe el cliente con NIF = " + nif);
			System.out.println("Seleccione primero la opción 4");
		}
		else {
			System.out.println("Cliente: " + cli.getNombre());
			TypedQuery<Integer> query = em.createQuery("SELECT MAX(f.numero) FROM Factura f", Integer.class);
			Integer numFactura = query.getSingleResult() + 1;
			System.out.println("Número de factura: " + numFactura);
			
			// Construimos objeto factura.
			Factura f = new Factura();
			f.setNumero(numFactura);
			f.setCliente(cli);
			f.setPagado(false);
			f.setFecha(new Date());
			// Añadimos la factura al cliente.
			cli.addFactura(f);
			
			// Iniciamos la transacción y persistimos la factura.
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(f);
			
			// Construimos los detalles de la factura.
			String continuar;
			do {
				System.out.println("Código de artículo: ");
				String codigo = lector.nextLine();	
				Producto pro = em.find(Producto.class, codigo);
				if (pro==null) {
					System.out.println("No se encuentra el producto con código " + codigo);
				}
				else {
					System.out.println("Descripción: " +  pro.getDescripcion());
					System.out.println("Precio: " + pro.getPrecio());
					System.out.println("¿Cuantas unidades desea? ");
					int unidades = lector.nextInt();
					lector.nextLine(); // Recoge el retorno de carro.
					
					// Creamos el objeto Detalle con su primary key compuesta.
					DetallePK pk = new DetallePK();
					pk.setCodigo(codigo);
					pk.setNumero(numFactura);
					Detalle d = new Detalle();
					d.setId(pk);
					d.setPrecio(pro.getPrecio());
					d.setUnidades(unidades);
					d.setProducto(pro);
					d.setFactura(f);
					
					// Persistimos el detalle.
					em.persist(d);
					
					// Añadimos el detalle a la factura.
					f.addDetalle(d);
				}
				System.out.println("¿Deseas seguir comprando (S/N)? ");
				continuar = lector.nextLine();	
			} while (continuar.toUpperCase().equals("S"));
			
			et.commit();
		}
		lector.close();
	}


}
