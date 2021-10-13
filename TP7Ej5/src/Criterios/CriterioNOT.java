package Criterios;

import Vivero.Planta;

public class CriterioNOT extends Criterio{

	private Criterio c;

	public CriterioNOT(Criterio c) {
		super();
		this.c = c;
	}

	@Override
	public boolean cumple(Planta p) {
		return !c.cumple(p);
	}
	
}
