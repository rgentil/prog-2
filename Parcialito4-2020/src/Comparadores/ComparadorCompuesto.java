package Comparadores;

import java.util.Comparator;

import Plataforma.Pelicula;

public class ComparadorCompuesto implements Comparator<Pelicula>{

	private Comparator<Pelicula> c1;
	private Comparator<Pelicula> c2;
	
	public ComparadorCompuesto(Comparator<Pelicula> c1, Comparator<Pelicula> c2) {
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
