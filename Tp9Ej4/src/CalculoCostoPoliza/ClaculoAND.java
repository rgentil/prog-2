package CalculoCostoPoliza;

import Aseguradora.Seguro;

public class ClaculoAND extends CalculoCostoPoliza{

	private CalculoCostoPoliza c1;
	private CalculoCostoPoliza c2;
	
	public ClaculoAND(CalculoCostoPoliza c1, CalculoCostoPoliza c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public double caluclarCosto(Seguro s) {
		return c1.caluclarCosto(s) + c2.caluclarCosto(s);
	}
	

}
