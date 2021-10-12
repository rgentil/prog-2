package Criterios;

import Documentador.Documento;

public class CriterioNOT extends Criterio {

	private Criterio c1;
	
	public CriterioNOT(Criterio c1) {
		this.c1 = c1;
	}

	@Override
	public boolean cumple(Documento d1) {
		return !c1.cumple(d1);
	}

}
