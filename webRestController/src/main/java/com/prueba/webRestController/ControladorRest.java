package com.prueba.webRestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

	@RequestMapping(value = "personas", method = RequestMethod.GET)
	public List<Persona> listaPersonas() {

		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("Pepe", 25));
		lista.add(new Persona("Juan", 13));
		lista.add(new Persona("Alicia", 18));
		lista.add(new Persona("Carlos", 36));
		lista.add(new Persona("rosa", 11));
		return lista;
	}
}