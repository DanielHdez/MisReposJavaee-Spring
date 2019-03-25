

	
	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

import model.Cliente;
//////*****************************************Importante desconecta la base de datos desde la perpectiva base de datos ***
// y por supuesto meter el driver en el proyecto añadiendo jar externo desde el build**********************************////////
	public class Principal {

		public static void main(String[] args) {
			System.out.println("Vamos a comprobar el funcionamiento de JPA");

			EntityManagerFactory factory = null;
			EntityManager em = null;

			try {
				factory = Persistence.createEntityManagerFactory("JPAproyecto"); 
				//me recoge informacion de la unidad de peresitenca es como la configuracion de la conexion a la base de datos 
				//Creo mi objeto y le añado el nombre de mi unidad de persistencia 
				//En el persistence XML aparece el nombre en el XML o en el general de este archivo 
				em = factory.createEntityManager();// Este objeto me permite realizar todas las operaciones con la base de datos 
				System.out.println("Hemos creado en Entity Manager");
				Cliente yo;
				yo = new Cliente("59660522R", "AMELIA GONZALEZ", "MADRID","C/ CRISTOBAL, 54", "666886666");
				EntityTransaction tx = em.getTransaction(); //Creo una transaccion 
				System.out.println("Hemos iniciado la transacción");
				tx.begin(); //inicio la transaccion 
				em.persist(yo); //Me lo guarda en una base de datos 
				tx.commit();//encio todo si alguno falla pues no la persite 
				System.out.println("Hemos persistido el objeto en la BD");

			} catch (Exception err) {
				System.out.println("Algun error ha ocurrido");
				System.out.println(err.getMessage());
			}
		}
	}


