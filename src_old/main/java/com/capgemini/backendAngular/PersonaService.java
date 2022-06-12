package com.capgemini.backendAngular;

import java.util.List;

public interface PersonaService {
// dialoga hacia el Front End con Angular
	List<Persona> listar();
	Persona listarId(int id);
	Persona edit(Persona p);
	Persona add(Persona p);
	void delete(int id);
}
