package Filtros;

import Persona.Persona;

public class CriterioPorNombre extends Criterio {

	private String filtro;
	
	public CriterioPorNombre(String nombre) {
		this.filtro = nombre;
	}
	
	@Override
	public boolean cumple(Persona p1) {
		return p1.getNombre().equals(filtro);
	}

}
