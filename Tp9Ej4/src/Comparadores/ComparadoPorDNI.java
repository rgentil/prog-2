package Comparadores;

import java.util.Comparator;

import Aseguradora.SeguroSimple;

public class ComparadoPorDNI implements Comparator<SeguroSimple>{

	public ComparadoPorDNI() {
		super();
	}	

	@Override
	public int compare(SeguroSimple o1, SeguroSimple o2) {
		return o1.getDni().compareTo(o2.getDni());
	}

}
