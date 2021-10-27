package Comparadores;

import java.util.Comparator;

import Aseguradora.SeguroSimple;

public class ComparadorAND implements Comparator<SeguroSimple>{

	private Comparator<SeguroSimple> c1;
	private Comparator<SeguroSimple> c2;
	
	public ComparadorAND(Comparator<SeguroSimple> c1, Comparator<SeguroSimple> c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(SeguroSimple o1, SeguroSimple o2) {
		int aux = c1.compare(o1, o2);
		if (aux == 0) {
			aux = c2.compare(o1, o2);
		}
		return aux;
	}
	
	
}
