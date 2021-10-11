package Comparador;

import java.util.Comparator;
import Persona.Persona;

public abstract class ComparadorPersona implements Comparator<Persona> {

	private ComparadorPersona siguiente;

	public ComparadorPersona() {
		siguiente = null;
	}

	public ComparadorPersona(ComparadorPersona siguiente) {
		this.siguiente = siguiente;
	}

	public abstract int comparar(Persona p1, Persona p2);
	
	@Override
	public int compare(Persona p1, Persona p2) {
		int res = comparar(p1,p2);
		if (res == 0 && siguiente !=null) {
			return siguiente.compare(p1, p2);
		}else {
			return res;
		}
	}

}
