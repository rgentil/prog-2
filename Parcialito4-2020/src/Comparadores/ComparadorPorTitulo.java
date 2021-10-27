package Comparadores;

import java.util.Comparator;

import Plataforma.Pelicula;

public class ComparadorPorTitulo implements Comparator<Pelicula>{

	public ComparadorPorTitulo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		return o1.getTitulo().compareTo(o2.getTitulo());
	}

}
