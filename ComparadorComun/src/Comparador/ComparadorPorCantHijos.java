package Comparador;

import Persona.Persona;

public class ComparadorPorCantHijos extends ComparadorPersona {
	
	public ComparadorPorCantHijos() {	
		super();
	}
	
	public ComparadorPorCantHijos(ComparadorPersona siguiente) {	
		super(siguiente);
	}
	
	@Override
	public int comparar(Persona p1, Persona p2) {
		return p1.getCantHijos() - p2.getCantHijos();
	}

}
