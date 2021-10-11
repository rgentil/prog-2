package Comparador;

import Biblioteca.Libro;

public class ComparadorPorISBN extends ComparadorCompuesto {

	public ComparadorPorISBN() {
		super();
	}

	public ComparadorPorISBN(ComparadorCompuesto siguiente) {
		super(siguiente);
	}

	@Override
	public int comparar(Libro l1, Libro l2) {
		return l1.getISBN().compareTo(l2.getISBN());
	}

}
