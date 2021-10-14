package Criterios;

import Plataforma.Pelicula;

public class CriterioOR extends Criterio {

	private Criterio c1;
	private Criterio c2;
	
	public CriterioOR(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Pelicula p) {
		return c1.cumple(p) || c2.cumple(p);
	}

}
