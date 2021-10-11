package Comparador;

import java.util.Comparator;

import Biblioteca.Libro;

public abstract class ComparadorCompuesto implements Comparator<Libro>{
	
	private ComparadorCompuesto siguiente;
	
	public ComparadorCompuesto(ComparadorCompuesto siguiente) {
		this.siguiente = siguiente;
	}

	public ComparadorCompuesto() {
		this.siguiente = null;
	}
	
	public abstract int comparar(Libro l1, Libro l2);

	@Override
	public int compare(Libro l1, Libro l2) {
		int aux = comparar(l1,l2);
		if (aux == 0 && siguiente != null) {
			return siguiente.comparar(l1, l2);
		}
		return aux;
	}

}
