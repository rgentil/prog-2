package Comparadores;

import Vivero.Planta;

public class ComparadorPorNombre extends Comparador{

	public ComparadorPorNombre() {
		super();
	}
	
	@Override
	public int compare(Planta p1, Planta p2) {
		return p1.getNombreCientifico().compareTo(p2.getNombreCientifico());
	}	
	

}
