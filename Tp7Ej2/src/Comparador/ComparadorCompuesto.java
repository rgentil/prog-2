package Comparador;

import java.util.Comparator;

import Estadisticas.Palabra;

public abstract class ComparadorCompuesto implements Comparator<Palabra>{

	private ComparadorCompuesto siguiente;
	
	public ComparadorCompuesto() {
		siguiente = null;
	}

	public ComparadorCompuesto(ComparadorCompuesto siguiente) {
		this.siguiente = siguiente;
	}

	public abstract int comparar(Palabra p1, Palabra p2);

	@Override
	public int compare(Palabra p1, Palabra p2) {
		int aux = comparar(p1,p2);
		if (aux == 0 && siguiente != null ) {
			return siguiente.compare(p1, p2);
		}
		return aux;
	}

}
