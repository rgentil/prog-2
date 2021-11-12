package Comparadores;

import java.util.Comparator;

import Entidades.ElementoEquipo;

public class ComparadorAND implements Comparator<ElementoEquipo>{

	private Comparator<ElementoEquipo> c1;
	private Comparator<ElementoEquipo> c2;
	
	public ComparadorAND(Comparator<ElementoEquipo> c1, Comparator<ElementoEquipo> c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(ElementoEquipo o1, ElementoEquipo o2) {
		int aux = c1.compare(o1, o2);
		if (aux == 0) {
			aux = c2.compare(o1, o2);
		}
		return aux;
	}
}
