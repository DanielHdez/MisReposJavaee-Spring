package ejemploJAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Test {

	public static void main(String[] args) {

		JAXBContext contexto;
		try {
			contexto = JAXBContext.newInstance(Persona.class);
			// Aquí hay error si la clase Persona no tiene un
			// constructor sin argumentos.
		} catch (JAXBException e) {
			System.out.println("Error creando el contexto");
			System.out.println(e.getMessage());
			return;
		}
		//El metodo marsall quiere decir que coja el fichero y lo guarde en la referencia que como no est lo pone en la carpeta del 
		//proyecto
		Marshaller m;
		try {
			m = contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			//Em este caso sale por System.out
			//m.marshal(new Persona(1, "AMELIA", "GONZALEZ", 48), System.out);
			
			//Ahora crea un fichero en la ruta del proyecto
			
					m.marshal(new Persona(1, "AMELIA", "GONZALEZ", 48), new File("yo.xml"));	
			
		} catch (JAXBException e) {
			System.out.println
			 ("Error convertiendo el objeto a formato XML");
			System.out.println(e.getMessage());
		}
	}


	}

