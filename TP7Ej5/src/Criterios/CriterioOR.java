package Criterios;

import Vivero.Planta;

public class CriterioOR extends Criterio{

	private Criterio c1;
	private Criterio c2;
	
	@Override
	public boolean cumple(Planta p) {
		return c1.cumple(p) || c2.cumple(p);
	}
	
}
