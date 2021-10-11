package Comparador;

import Persona.Persona;

public class CompararPorNombre extends ComparadorPersona {

	public CompararPorNombre() {	
		super();
	}
	
	public CompararPorNombre(ComparadorPersona siguiente) {	
		super(siguiente);
	}

	@Override
	public int comparar(Persona p1, Persona p2) {
		return p1.getNombre().compareTo(p2.getNombre());

	}
}
