package Criterios;

import Principal.Vendedor;

public class CriterioNOT extends Criterio{
	
	private Criterio c;
	
	
	public CriterioNOT(Criterio c) {
		super();
		this.c = c;
	}

	public boolean cumple(Vendedor vendedor) {
		return !c.cumple(vendedor);
 	}
	
		
}
