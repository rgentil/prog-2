package Comparador;

import Biblioteca.Libro;

public class ComparadorPorAnioEdicion extends ComparadorCompuesto {

	public ComparadorPorAnioEdicion() {
		super();
	}

	public ComparadorPorAnioEdicion(ComparadorCompuesto siguiente) {
		super(siguiente);
	}

	@Override
	public int comparar(Libro l1, Libro l2) {
		return l1.getAnioEdicion() - (l2.getAnioEdicion());
	}

}
