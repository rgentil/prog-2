package Comparadores;

import java.util.Comparator;

import Plataforma.Pelicula;

public abstract class Comparador implements Comparator<Pelicula> {

	public abstract int compare(Pelicula o1, Pelicula o2);

}
