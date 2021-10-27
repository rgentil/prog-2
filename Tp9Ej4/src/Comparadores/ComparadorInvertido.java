package Comparadores;

import java.util.Comparator;

import Aseguradora.SeguroSimple;

public class ComparadorInvertido implements Comparator<SeguroSimple>{

	private Comparator<SeguroSimple> c;
	
	public ComparadorInvertido(Comparator<SeguroSimple> c) {
		super();
		this.c = c;
	}

	@Override
	public int compare(SeguroSimple o1, SeguroSimple o2) {
		return - c.compare(o1, o2);
	}
	
	
}
