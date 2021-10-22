package Comparadores;

import Plataforma.Pelicula;

public class ComparadorPorTitulo extends Comparador{

	public ComparadorPorTitulo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		return o1.getTitulo().compareTo(o2.getTitulo());
	}

}
