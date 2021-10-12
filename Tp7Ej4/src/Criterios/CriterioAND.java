package Criterios;

import Documentador.Documento;

public class CriterioAND extends Criterio {

	private Criterio c1;
	private Criterio c2;
	
	public CriterioAND(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Documento d1) {
		return c1.cumple(d1) && c2.cumple(d1);
	}

}
