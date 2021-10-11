package Comparador;

import Biblioteca.Libro;

public class ComparadorPorGeneroPrincipal extends ComparadorCompuesto {

	public ComparadorPorGeneroPrincipal() {
		super();
	}

	public ComparadorPorGeneroPrincipal(ComparadorCompuesto siguiente) {
		super(siguiente);
	}

	@Override
	public int comparar(Libro l1, Libro l2) {
		return l1.getGeneroPrincipl().compareTo(l2.getGeneroPrincipl());
	}

}
