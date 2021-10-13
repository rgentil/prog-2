package Comparadores;

import Vivero.Planta;

public class ComparadorPorRiego extends Comparador{

	public ComparadorPorRiego() {
		super();
	}
	
	@Override
	public int compare(Planta p1, Planta p2) {
		return Integer.compare(p1.getRiego(),p2.getRiego());
	}	
	
}
