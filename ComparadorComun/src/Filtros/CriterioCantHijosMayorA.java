package Filtros;

import Persona.Persona;

public class CriterioCantHijosMayorA extends Criterio {

	private int filtro;
	
	public CriterioCantHijosMayorA(int filtro) {
		this.filtro = filtro;
	}
	
	public boolean cumple(Persona p1) {
		return p1.getCantHijos() > filtro;
	}

}
