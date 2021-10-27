package CalculoCostoPoliza;

import Aseguradora.Seguro;

public class ValorFijo extends CalculoCostoPoliza{

	private double valorFijo;
	
	public ValorFijo(double valorFijo) {
		super();
		this.valorFijo = valorFijo;
	}

	@Override
	public double caluclarCosto(Seguro s) {
		return this.valorFijo; 
	}


}
