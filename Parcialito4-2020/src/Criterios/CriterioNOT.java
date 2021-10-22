package Criterios;

import Plataforma.Pelicula;

public class CriterioNOT extends Criterio {

	private Criterio c;
	
	public CriterioNOT(Criterio c) {
		this.c = c;
	}

	@Override
	public boolean cumple(Pelicula p) {
		return !c.cumple(p);
	}

}
