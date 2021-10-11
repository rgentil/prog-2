package Comparador;

import Biblioteca.Libro;

public class ComparadorPorAutor extends ComparadorCompuesto {

	public ComparadorPorAutor() {
		super();
	}

	public ComparadorPorAutor(ComparadorCompuesto siguiente) {
		super(siguiente);
	}

	@Override
	public int comparar(Libro l1, Libro l2) {
		return l1.getAutor().compareTo(l2.getAutor());
	}

}
