package Comparadores;

import Vivero.Planta;

public class ComparadorCompuesto extends Comparador{

	private Comparador c1;
	private Comparador c2;
	
	public ComparadorCompuesto(Comparador c1, Comparador c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public int compare(Planta p1, Planta p2) {
		int aux = c1.compare(p1,p2);
		if (aux == 0) {
			aux = c2.compare(p1,p2);
		}
		return aux;
	}

	public Comparador getC1() {
		return c1;
	}

	public Comparador getC2() {
		return c2;
	}
	
	

}
