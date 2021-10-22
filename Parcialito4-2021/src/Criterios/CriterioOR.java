package Criterios;

import Principal.Vendedor;

public class CriterioOR extends Criterio{
	
	private Criterio c1;
	private Criterio c2;
	
	
	public CriterioOR(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	public boolean cumple(Vendedor vendedor) {
		return c1.cumple(vendedor) || c2.cumple(vendedor);
 	}
	
		
}
