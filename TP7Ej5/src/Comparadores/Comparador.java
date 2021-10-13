package Comparadores;

import java.util.Comparator;

import Vivero.Planta;

public abstract class Comparador implements Comparator<Planta> {
	
	public abstract int compare(Planta p1, Planta p2);

}
