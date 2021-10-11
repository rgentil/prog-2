package Persona;

import java.util.ArrayList;
import java.util.List;

import Filtros.Criterio;

public class Comercio {

	private List<Persona> personas;
	
	public Comercio() {
		personas = new ArrayList<Persona>();		
	}
	
	public void addPersona(Persona p) {
		if (!personas.contains(p)) {
			personas.add(p);
		}
	}
	
	public List<Persona> buscar(Criterio criterio){
		List<Persona> resultado = new ArrayList<Persona>();
		for(Persona p:personas) {
			if (criterio.cumple(p)) {
				resultado.add(p);
			}
		}
		return resultado;		
	}
	
}
