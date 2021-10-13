package Comparadores;

import Vivero.Planta;

public class ComparadorPorSol extends Comparador{

	public ComparadorPorSol() {
		super();
	}
	
	@Override
	public int compare(Planta p1, Planta p2) {
		return Integer.compare(p1.getSol(),p2.getSol());
	}	
	
}
