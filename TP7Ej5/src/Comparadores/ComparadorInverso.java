package Comparadores;

import Vivero.Planta;

public class ComparadorInverso extends Comparador{

	private Comparador c1;
	
	public ComparadorInverso(Comparador c1) {
		super();
		this.c1 = c1;
	}

	@Override
	public int compare(Planta p1, Planta p2) {
		return - c1.compare(p1, p2);
	}
	

}
