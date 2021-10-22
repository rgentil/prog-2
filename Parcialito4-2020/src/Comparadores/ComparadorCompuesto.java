package Comparadores;

import Plataforma.Pelicula;

public class ComparadorCompuesto extends Comparador{

	private Comparador c1;
	private Comparador c2;
	
	public ComparadorCompuesto(Comparador c1, Comparador c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		int aux = c1.compare(o1, o2);
		if (aux == 0) {
			return c2.compare(o1, o2);
		}
		return aux;
	}

}
