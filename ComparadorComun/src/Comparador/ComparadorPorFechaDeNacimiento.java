package Comparador;

import Persona.Persona;

public class ComparadorPorFechaDeNacimiento extends ComparadorPersona{
	
	public ComparadorPorFechaDeNacimiento() {
		super();
	}

	public ComparadorPorFechaDeNacimiento(ComparadorPersona siguiente) {
		super(siguiente);
	}

	@Override
	public int comparar(Persona p1, Persona p2) {
		return p1.getFechaNacimiento().compareTo(p2.getFechaNacimiento());
	}

}
