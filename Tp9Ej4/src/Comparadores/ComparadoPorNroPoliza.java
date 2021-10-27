package Comparadores;

import java.util.Comparator;

import Aseguradora.SeguroSimple;

public class ComparadoPorNroPoliza implements Comparator<SeguroSimple>{

	public ComparadoPorNroPoliza() {
		super();
	}

	@Override
	public int compare(SeguroSimple o1, SeguroSimple o2) {
		return o1.getNroPoliza() - o2.getNroPoliza();
	}

}
